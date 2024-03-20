package designPattern;

public class UserSingletonClass {

    private static UserSingletonClass user;


    public UserSingletonClass() {
    }

    public static UserSingletonClass getUser() {
        return user;
    }

    public static void main(String args[]){
        UserSingletonClass userSingletonClass = new UserSingletonClass();
        UserSingletonClass userSingletonClass1 = new UserSingletonClass();
        System.out.println(userSingletonClass1==userSingletonClass);
    }
}
