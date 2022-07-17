package classes.persons;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Person {

    private String Name;
    private String Surname;
    private int age;

    public Person(String name, String surname, int age) {

        Name = name;
        Surname = surname;
        this.age = age;
    }

    public Person() {

    }

    protected int assingID(int id) {
        id += 1;
        return id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String registerUser(String user_to_register) {

        int id = 0;
        int a = 1;
        id = assingID(id);
        user_to_register = "P-" + id;
        Scanner sn = new Scanner(System.in);


        while (a == 1) {
            try {
                System.out.println(" press 1:to  Professor. 2:to Student");

                a = sn.nextInt();
                switch (a) {
                    case 1:
                        user_to_register = "P-" + id;
                        System.out.println(" Register new Professor");
                        sn.nextLine();
                        System.out.println(" Type the  name ");
                        user_to_register = user_to_register + ";" + sn.nextLine();
                        System.out.println(" Type the sure name ");
                        user_to_register = user_to_register + ";" + sn.nextLine();
                        System.out.println(" Type the age");
                        user_to_register = user_to_register + ";" + sn.nextLine();
                        System.out.println("The Professor {" + user_to_register + "} was successfully Registered ");
                        a = 3;
                        break;
                    case 2:
                        user_to_register = "S-" + id;
                        System.out.println("   Register new Student :) ");
                        sn.nextLine();
                        System.out.println(" Type the  name ");
                        user_to_register = user_to_register + ";" + sn.nextLine();
                        System.out.println(" Type the sure name ");
                        user_to_register = user_to_register + ";" + sn.nextLine();
                        System.out.println(" Type the age");
                        user_to_register = user_to_register + ";" + sn.nextLine();
                        System.out.println("The student {" + user_to_register + "} was successfully Registered ");

                        a = 3;
                        break;
                    default:
                        System.out.println("Type only numbers please (1:to  Professor. 2:to Student");

                        a = 1;
                }
            } catch (InputMismatchException e) {
                a = 1;


                System.out.println("Type only numbers please (1:to  continue. 2:to Finish");
                sn.next();

            }
        }


        return user_to_register;

    }


}
