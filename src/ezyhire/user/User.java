/*
package ezyhire.user;

import java.util.List;

public class User {



@RestController
@RequestMapping(path = "api/ep1/usernew", produces = MediaType.APPLICATION_JSON_VALUE)
public class UserControllerNew {

    private AuthenticationUtil authenticationUtil;

    private IUserServiceNew userService;

    private static final Logger LOGGER = LoggerFactory.getLogger(UserControllerNew.class);

    @Autowired
    public UserControllerNew(AuthenticationUtil authenticationUtil, IUserServiceNew userService) {
        this.authenticationUtil = authenticationUtil;
        this.userService = userService;
    }

    */
/**
     * This method validates the login credentials of a user as well as the JWT implementation with the token validation
     *
     * @param userRequest       -   UserRequest model containing login credentials of a user.
     * @return ResponseEntity   -   response entity object containing the https code and corresponding error message or
     *                              response object.
     *//*

    @PostMapping(value = "loginUser")
    public ResponseEntity<ResponseContract> login(@Valid @RequestBody UserRequest userRequest) {
        ResponseContract responseContract = null;
        try {
            UserModelNew userModel = userService.getByUsername(userRequest.getUsername());
            if (userModel == null ) {
                LOGGER.info("Wrong Credentials!! invalid username or password");
                responseContract = new ResponseContract(HttpStatus.UNAUTHORIZED.value(), "Wrong Credentials");
                return new ResponseEntity<>(responseContract, HttpStatus.UNAUTHORIZED);
            } else if(userModel.getEmployeeStatus() ==3){
                LOGGER.info("User is terminated from the system.");
                responseContract = new ResponseContract(HttpStatus.UNAUTHORIZED.value(), "Terminated User, login not allowed.");
                return new ResponseEntity<>(responseContract, HttpStatus.UNAUTHORIZED);
            }else {
                boolean isPwdValid = AuthenticationUtil.base64Encode(userRequest.getPassword()).equals(userModel.getPassword());
                if (!isPwdValid) {
                    LOGGER.warn("Wrong Credentials!! wrong username and password");
                    responseContract = new ResponseContract(HttpStatus.UNAUTHORIZED.value(), "Wrong Credentials");
                    return new ResponseEntity<>(responseContract, HttpStatus.UNAUTHORIZED);
                }
            }
            //store in db
            if (userModel.getLastLoginToken() == null || userModel.getLastLoginToken().isEmpty()) {
                String token = authenticationUtil.generateJwtToken(userRequest.getUsername());
                LOGGER.info("Login Successful.. Token is generated");
                userService.saveUserTokenInDB(token, userRequest.getUsername());
                responseContract = new ResponseContract(HttpStatus.OK.value(), "Token generated and saved in DB.", token);
                return ResponseEntity.ok(responseContract);
            }else{
                LOGGER.warn("User is Already Logged in.");
                responseContract = new ResponseContract(HttpStatus.FORBIDDEN.value(), "User is Already Logged in.");
                return new ResponseEntity<>(responseContract, HttpStatus.FORBIDDEN);
            }


        } catch (Exception ex) {
            LOGGER.error("Error occurred while login user. Error: {}", ex.getMessage());
            ex.printStackTrace();
            responseContract = new ResponseContract(HttpStatus.INTERNAL_SERVER_ERROR.value(), "Error occurred while login user.");
            return new ResponseEntity<>(responseContract, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    */
/**
     * This method is used to save a new user into the DB.
     *
     * @param userModel         -   user model object which has to be saved into the DB.
     * @return ResponseEntity   -   response entity object containing the https code and corresponding error message or
     *                              response object.
     *//*

    @PostMapping("saveUser")
    public ResponseEntity<ResponseContract> saveNewUser(@Valid @RequestBody UserModelNew userModel) {
        ResponseContract responseContract;
        try {
            UserModelNew savedUser = userService.addNewUser(userModel);
            if (savedUser == null) {
                responseContract = new ResponseContract(HttpStatus.NO_CONTENT.value(), "Unable to save the user.");
                return new ResponseEntity<>(responseContract, HttpStatus.OK);
            }
            responseContract = new ResponseContract(HttpStatus.OK.value(), "Success", savedUser);
            return new ResponseEntity<>(responseContract, HttpStatus.OK);
        } catch (DataIntegrityViolationException ex) {
            LOGGER.error("user name already exists ");
            ex.printStackTrace();
            responseContract = new ResponseContract(HttpStatus.BAD_REQUEST.value(), "email already exists");
            return new ResponseEntity<>(responseContract, HttpStatus.BAD_REQUEST);
        } catch (Exception ex) {
            LOGGER.error("Error occurred while saving new user details: {} ", ex.getMessage());
            ex.printStackTrace();
            responseContract = new ResponseContract(HttpStatus.INTERNAL_SERVER_ERROR.value(),
                    "Error occurred while saving  new user details");
            return new ResponseEntity<>(responseContract, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    */
/**
     * This method is used to reset password.
     *
     * @param emailId           -   Resetting password based on email id.
     * @return ResponseEntity   -   Response entity object containing the https code and corresponding error message or
     *                              response object.
     *//*

    @PostMapping("resetPasswordLink")
    public ResponseEntity<ResponseContract> getResetPasswordLink(@RequestBody String emailId) {
        ResponseContract responseContract;
        try {
            if (userService.isUserNameExist(emailId)) {
                String token = authenticationUtil.generateJwtToken(emailId);
                userService.resetPwdLink(emailId, token);
                responseContract = new ResponseContract(HttpStatus.OK.value(),
                        "Password reset link sent successfully", null);
                return new ResponseEntity<>(responseContract, HttpStatus.OK);
            } else {
                responseContract = new ResponseContract(HttpStatus.BAD_REQUEST.value(),
                        "Username doesn't exist in database");
                return new ResponseEntity<>(responseContract, HttpStatus.OK);
            }
        } catch (Exception ex) {
            LOGGER.error("Error while resetting the password. Error: {}", ex.getMessage());
            ex.printStackTrace();
            responseContract = new ResponseContract(HttpStatus.INTERNAL_SERVER_ERROR.value(), ex.getMessage());
            return new ResponseEntity<>(responseContract, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    */
/**
     * This method is used to verify the OTP and change the password based on email.
     *
     * @param token             -   Token is used to send token along with url to change password.
     * @param newPassword       -   New password contains user new password.
     * @return ResponseEntity   -   response entity object containing the https code and corresponding error message or
     *                              response object.
     *//*

    @PostMapping("forgetPassword/{token}")
    public ResponseEntity<ResponseContract> resetPassword(@PathVariable("token") String token,
                                                          @RequestBody String newPassword) {
        ResponseContract responseContract;
        try {
            if (!authenticationUtil.isExpiredToken(token)) {
                String usernameByToken = authenticationUtil.getUserName(token);
                if (userService.isUserNameExist(usernameByToken)) {
                    userService.resetPwd(newPassword, usernameByToken);
                    responseContract = new ResponseContract(HttpStatus.OK.value(), "Password changed successfully.", "");
                    LOGGER.info("Password changed successfully.");
                    return new ResponseEntity<>(responseContract, HttpStatus.OK);
                }
                LOGGER.info("userName doesn't match with any account.!! please resend reset password link.");
                responseContract = new ResponseContract(HttpStatus.NO_CONTENT.value(),
                        "username doesn't match with any account");
                return new ResponseEntity<>(responseContract, HttpStatus.OK);
            } else {
                LOGGER.info("Link Expired!!. or Invalid link.");
                responseContract = new ResponseContract(HttpStatus.BAD_REQUEST.value(), "Link expired or invalid link.");
                return new ResponseEntity<>(responseContract, HttpStatus.OK);
            }
        } catch (Exception ex) {
            LOGGER.error("Error occurred while changing password or verifying OTP. Error: {}", ex.getMessage());
            ex.printStackTrace();
            responseContract = new ResponseContract(HttpStatus.INTERNAL_SERVER_ERROR.value(), ex.getMessage());
            return new ResponseEntity<>(responseContract, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    */
/**
     * This method returns the UserModel class object based on a give id.
     *
     * @param id                -   id to fetch the UserModel object from the DB.
     * @return ResponseEntity   -   response entity object containing the https code and corresponding error message or
     *                              response object.
     *//*

    @GetMapping("{id}")
    public ResponseEntity<ResponseContract> getOneUserDetails(@PathVariable("id") String id) {
        ResponseContract responseContract;
        try {
            UserModelNew user = userService.getUserById(id);
            if (user == null) {
                responseContract = new ResponseContract(HttpStatus.NO_CONTENT.value(), "No User found for this id :" + id);
                return new ResponseEntity<>(responseContract, HttpStatus.OK);
            }
            user.setPassword(null);
            LOGGER.info("Getting the user based on id : {}", id);
            responseContract = new ResponseContract(HttpStatus.OK.value(), "Success", user);
            return new ResponseEntity<>(responseContract, HttpStatus.OK);
        } catch (Exception ex) {
            LOGGER.error("Exception occurred while searching user based on id. Error: {}", ex.getMessage());
            ex.printStackTrace();
            responseContract = new ResponseContract(HttpStatus.INTERNAL_SERVER_ERROR.value(), ex.getMessage());
            return new ResponseEntity<>(responseContract, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    */
/**
     * this method is used get the time sheets for created by and employer id given.
     *
     * @param userName        -     user will be fetched from DB based on email.
     * @param request         -     HttpServletRequest object containing parameters in headers.
     * @param response        -     HttpServletResponse object containing parameters set in headers.
     * @return ResponseEntity -     ResponseEntity object containing HTTP status and user Data.
     *//*

    @GetMapping("getuserbyemail/{userName}")
    ResponseEntity<ResponseContract> getCreatedBy(@PathVariable("userName") String userName,
                                                  HttpServletRequest request, HttpServletResponse response) {
        ResponseContract responseContract;

        if (authenticationUtil.isTokenInvalid(request, response)) {
            responseContract = new ResponseContract(HttpStatus.UNAUTHORIZED.value(), response.getHeader("error"));
            return new ResponseEntity<>(responseContract, HttpStatus.UNAUTHORIZED);
        }
        try {
            UserModelNew userByEmail = userService.getUserByEmail(userName);
            if (userByEmail == null) {
                LOGGER.info("No createdBy found based on userName/mailId : {}", userName);
                responseContract = new ResponseContract(HttpStatus.NO_CONTENT.value(), "No User found for this UserName :" + userName);
                return new ResponseEntity<>(responseContract, HttpStatus.OK);
            }
            userByEmail.setPassword(null);
            LOGGER.info("Getting all the createdBy based on userName/mailId : {}", userName);
            responseContract = new ResponseContract(HttpStatus.OK.value(), "User Found", userByEmail);
            return new ResponseEntity<>(responseContract, HttpStatus.OK);
        } catch (Exception ex) {
            LOGGER.error("Exception occurred while searching user based on id. Error: {}", ex.getMessage());
            ex.printStackTrace();
            responseContract = new ResponseContract(HttpStatus.INTERNAL_SERVER_ERROR.value(), ex.getMessage());
            return new ResponseEntity<>(responseContract, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    */
/**
     *  This method is used to fetch all the data of user in the based on the UserType.
     *
     * @param usertype        -     user will be fetched from DB based on userType.
     * @param request         -     HttpServletRequest object containing parameters in headers.
     * @param response        -     HttpServletResponse object containing parameters set in headers.
     * @return ResponseEntity -     ResponseEntity object containing HTTP status and user Data.
     *//*

    @GetMapping("getuser/{usertype}")
    ResponseEntity<ResponseContract> getAllUserByUserType(@PathVariable("usertype") int usertype,
                                                          HttpServletRequest request, HttpServletResponse response) {
        ResponseContract responseContract;

        if (authenticationUtil.isTokenInvalid(request, response)) {
            responseContract = new ResponseContract(HttpStatus.UNAUTHORIZED.value(), response.getHeader("error"));
            return new ResponseEntity<>(responseContract, HttpStatus.UNAUTHORIZED);
        }
        try {
            List<UserModelNew> userByEmail = userService.getUserByType(usertype);
            if (userByEmail == null) {
                LOGGER.info("Not found user based on usertype : {}", usertype);
                responseContract = new ResponseContract(HttpStatus.NO_CONTENT.value(), "No User found.");
                return new ResponseEntity<>(responseContract, HttpStatus.OK);
            }
            LOGGER.info("Getting all the user based on usertype : {}", usertype);
            responseContract = new ResponseContract(HttpStatus.OK.value(), "User Found", userByEmail);
            return new ResponseEntity<>(responseContract, HttpStatus.OK);
        } catch (Exception ex) {
            LOGGER.error("Exception occurred while searching user based on id. Error: {}", ex.getMessage());
            ex.printStackTrace();
            responseContract = new ResponseContract(HttpStatus.INTERNAL_SERVER_ERROR.value(), ex.getMessage());
            return new ResponseEntity<>(responseContract, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    */
/**
     * This method is used to fetch all the data of user in the based on the userId.
     *
     * @param userid             -     user will be fetched from DB based on userId.
     * @param request            -     HttpServletRequest object containing parameters in headers.
     * @param response           -     HttpServletResponse object containing parameters set in headers.
     * @return ResponseEntity    -     ResponseEntity object containing HTTP status and user Data.
     *//*

    @GetMapping("getallpermissionforuser/{userid}")
    ResponseEntity<ResponseContract> getAllPermissionsForUser(@PathVariable("userid") String userid,
                                                              HttpServletRequest request, HttpServletResponse response) {
        ResponseContract responseContract;

        if (authenticationUtil.isTokenInvalid(request, response)) {
            responseContract = new ResponseContract(HttpStatus.UNAUTHORIZED.value(), response.getHeader("error"));
            return new ResponseEntity<>(responseContract, HttpStatus.UNAUTHORIZED);
        }
        try {
            List<RolePermission> rolePermissions = userService.getAllPermission(userid);
            if (rolePermissions == null) {
                LOGGER.info("No data found for the permission based on userid : {}", userid);
                responseContract = new ResponseContract(HttpStatus.NO_CONTENT.value(), "No data found.");
                return new ResponseEntity<>(responseContract, HttpStatus.OK);
            }
            LOGGER.info("Getting all the permission based on userid : {}", userid);
            responseContract = new ResponseContract(HttpStatus.OK.value(), "Role Permission Found with data", rolePermissions);
            return new ResponseEntity<>(responseContract, HttpStatus.OK);
        } catch (Exception ex) {
            LOGGER.error("Exception occurred while searching user based on id. Error: {}", ex.getMessage());
            ex.printStackTrace();
            responseContract = new ResponseContract(HttpStatus.INTERNAL_SERVER_ERROR.value(), ex.getMessage());
            return new ResponseEntity<>(responseContract, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    */
/**
     *  This method is used to fetch all the data of user in the based on the UserType.
     *
     * @param companyId        -     user will be fetched from DB based on userType.
     * @param request         -     HttpServletRequest object containing parameters in headers.
     * @param response        -     HttpServletResponse object containing parameters set in headers.
     * @return ResponseEntity -     ResponseEntity object containing HTTP status and user Data.
     *//*

    @GetMapping("getallemployer/{companyId}")
    ResponseEntity<ResponseContract> getAllUserByUser(@PathVariable("companyId") String companyId,
                                                      HttpServletRequest request, HttpServletResponse response) {
        ResponseContract responseContract;

        if (authenticationUtil.isTokenInvalid(request, response)) {
            responseContract = new ResponseContract(HttpStatus.UNAUTHORIZED.value(), response.getHeader("error"));
            return new ResponseEntity<>(responseContract, HttpStatus.UNAUTHORIZED);
        }
        try {
            List<UserModelNew> userByEmployer = userService.getUserByEmployer(companyId);
            if (userByEmployer == null) {
                LOGGER.info("No user found based on companyId : {}", companyId);
                responseContract = new ResponseContract(HttpStatus.NO_CONTENT.value(), "No User found.");
                return new ResponseEntity<>(responseContract, HttpStatus.OK);
            }
            LOGGER.info("Getting all the user based on companyId : {}", companyId);
            responseContract = new ResponseContract(HttpStatus.OK.value(), "User Found", userByEmployer);
            return new ResponseEntity<>(responseContract, HttpStatus.OK);
        } catch (Exception ex) {
            LOGGER.error("Exception occurred while searching user based on companyId. Error: {}", ex.getMessage());
            ex.printStackTrace();
            responseContract = new ResponseContract(HttpStatus.INTERNAL_SERVER_ERROR.value(), ex.getMessage());
            return new ResponseEntity<>(responseContract, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    */
/**
     * This method is used to save a new user into the DB.
     *
     * @param mailToEmployee    -   user model object which has to be saved into the DB.
     * @return ResponseEntity   -   response entity object containing the https code and corresponding error message or
     *                              response object.
     *//*

    @PostMapping("sendMailToEmployee")
    public ResponseEntity<ResponseContract> sendMailToEmployee(@Valid @RequestBody MailToEmployee mailToEmployee) {
        ResponseContract responseContract;
        try {
            boolean mail = userService.mailToEmployee(mailToEmployee);
            if (mail == false) {
                LOGGER.info("Unable sending mail to Employee : {}", mailToEmployee);
                responseContract = new ResponseContract(HttpStatus.NO_CONTENT.value(), "Unable to send the mail.");
                return new ResponseEntity<>(responseContract, HttpStatus.OK);
            }
            LOGGER.info("sending mail to Employee : {}", mailToEmployee);
            responseContract = new ResponseContract(HttpStatus.OK.value(), "Success", true);
            return new ResponseEntity<>(responseContract, HttpStatus.OK);
        } catch (Exception ex) {
            LOGGER.error("Error occurred while sending mail.Error: {} ", ex.getMessage());
            ex.printStackTrace();
            responseContract = new ResponseContract(HttpStatus.INTERNAL_SERVER_ERROR.value(),
                    "Error occurred while sending mail");
            return new ResponseEntity<>(responseContract, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    */
/**
     * This is the utility which is used to update the flags corresponding to the user.
     *
     * @param newFlag           -       value of new flag
     * @param userId            -       id of the user
     * @param request           -       HttpServletRequest object containing parameters in headers.
     * @param response          -       HttpServletResponse object containing parameters set in headers.
     * @return ResponseEntity   -       ResponseEntity object containing HTTP status and user Data.
     *//*

    @GetMapping("updateUserFlag/{newFlag}/{userId}")
    ResponseEntity<ResponseContract> updateUserFlag(@PathVariable("newFlag") String newFlag, @PathVariable("userId") String userId,
                                                    HttpServletRequest request, HttpServletResponse response) {
        ResponseContract responseContract;

        if (authenticationUtil.isTokenInvalid(request, response)) {
            responseContract = new ResponseContract(HttpStatus.UNAUTHORIZED.value(), response.getHeader("error"));
            return new ResponseEntity<>(responseContract, HttpStatus.UNAUTHORIZED);
        }
        try {
            boolean isUpdate = userService.updateUserFlag(newFlag, userId);
            responseContract = new ResponseContract(HttpStatus.OK.value(), "Success", isUpdate);
            return new ResponseEntity<>(responseContract, HttpStatus.OK);
        } catch (Exception ex) {
            LOGGER.error("Exception occurred while searching user based on companyId. Error: {}", ex.getMessage());
            ex.printStackTrace();
            responseContract = new ResponseContract(HttpStatus.INTERNAL_SERVER_ERROR.value(), ex.getMessage());
            return new ResponseEntity<>(responseContract, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("logout/{userName}")
    ResponseEntity<ResponseContract> logout(@PathVariable("userName") String userName,
                                            HttpServletRequest request, HttpServletResponse response) {
        ResponseContract responseContract;

        try {
            userService.deleteToken(userName);
            LOGGER.info("User Logged Out Successfully : {}", userName);
            responseContract = new ResponseContract(HttpStatus.OK.value(), "User Logged Out Successfully!", userName);
            return new ResponseEntity<>(responseContract, HttpStatus.OK);
        } catch (Exception ex) {
            LOGGER.error("Exception while deleting token: {}", ex.getMessage());
            ex.printStackTrace();
            responseContract = new ResponseContract(HttpStatus.INTERNAL_SERVER_ERROR.value(), ex.getMessage());
            return new ResponseEntity<>(responseContract, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

*/
