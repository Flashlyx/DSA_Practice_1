package Java_Concepts.Object_Class;

import java.util.Objects;


public class EqualsMethodOverriding {
        private String name;
        private int age;

        public EqualsMethodOverriding(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
        // Always override hashcode method after overriding equals method
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;

            if (o == null || getClass() != o.getClass()) return false;

            EqualsMethodOverriding equalsMethodOverriding = (EqualsMethodOverriding) o;

            return age == equalsMethodOverriding.age && Objects.equals(name, equalsMethodOverriding.name);
        }

        @Override
        public int hashCode() {

            return Objects.hash(name, age);
        }

        public static void main(String[] args) {
            EqualsMethodOverriding p1 = new EqualsMethodOverriding("Alice", 30);
            EqualsMethodOverriding p2 = new EqualsMethodOverriding("Alice", 30);
            EqualsMethodOverriding p3 = new EqualsMethodOverriding("Bob", 25);

            System.out.println("p1 equals p2: " + p1.equals(p2)); // true
            System.out.println("p1 equals p3: " + p1.equals(p3)); // false
            System.out.println("p1 == p2: " + (p1 == p2));       // false (different memory locations)
        }
    }

