package hashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;



    public class CommonFromThreeArrayListForEmployee {
        private int id;
        private String name;

        public CommonFromThreeArrayListForEmployee(int id, String name) {
            this.id = id;
            this.name = name;
        }

        // Getters and setters

        @Override
        public String toString() {
            return "Employee{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
