package coreJava.sorting.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Person implements Comparable<Person> {
        int age;
        String name;

        public Person(int age, String name) {
            super();
            this.age = age;
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public int compareTo(Person otherPerson) {
            return Integer.compare(this.age, otherPerson.age);
        }
    }


