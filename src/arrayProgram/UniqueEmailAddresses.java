package arrayProgram;

import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAddresses {

        public int numUniqueEmails(String[] emails) {
            Set<String> uniqueEmails = new HashSet<>();

            for (String email : emails) {
                String[] parts = email.split("@");
                String localName = parts[0];
                String domainName = parts[1];

                // Remove '.' and ignore characters after '+'
                localName = localName.replace(".", "");
                int index = localName.indexOf('+');
                if (index != -1) {
                    localName = localName.substring(0, index);
                }

                // Add processed email to the set
                String processedEmail = localName + "@" + domainName;
                uniqueEmails.add(processedEmail);
            }

            return uniqueEmails.size();
        }

        public static void main(String[] args) {
            UniqueEmailAddresses solution = new UniqueEmailAddresses();

            // Test cases
            String[] test1 = {"test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com", "testemail+david@lee.tcode.com"};
            System.out.println(solution.numUniqueEmails(test1));  // Output: 2

            String[] test2 = {"a@leetcode.com", "b@leetcode.com", "c@leetcode.com"};
            System.out.println(solution.numUniqueEmails(test2));  // Output: 3
        }
    }


