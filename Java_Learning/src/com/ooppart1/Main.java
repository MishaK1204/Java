package com.ooppart1;

class Dog {
    private static String name;

    public Dog(String name) {
        this.name = name;
    }

    public void printName() {
        System.out.println("name = " + name);
    }
}

public class Main {

    public static void main(String[] args) {

        Account bobsAccount = new Account("12345", 1000.00,
                "Bob Brown", "myemail@bob.com", "(087) 123-4567");

//        System.out.println(bobsAccount.getNumber());
//        System.out.println(bobsAccount.getBalance());

//        bobsAccount.setNumber("12345");
//        bobsAccount.setBalance(1000.00);
//        bobsAccount.setCustomerName("Bob Brown");
//        bobsAccount.setCustomerEmail("myemail@bob.com");
//        bobsAccount.setCustomerPhone("(087) 123-4567");

//        Dog dog1 = new Dog("Sancho");
//        Dog dog2 = new Dog("Pansa");
//
//        dog1.printName();
//        dog2.printName();

        for (int i = 1; i < 5; i++) {
            Student student = new Student("0000" + i, switch (i) {
                case 1 -> "Misha";
                case 2 -> "Grisha";
                case 3 -> "Lisha";
                default -> "Krisha";
            }, "05/11/1985", "Java Masterclass");

            System.out.println(student);
        }
    }
}
