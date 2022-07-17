package classes.persons;

import classes.app.Events;

import java.io.IOException;
import java.util.ArrayList;
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

    protected int assaingID(String file_dir, int id) {
        Events ev = new Events();
        ArrayList<String> myBicycleList2 = new ArrayList<>();
        ev.readFile(file_dir, myBicycleList2);
        id = (myBicycleList2.size() + 1);
        return id;
    }


    public String registerUser() {
        Events ev = new Events();
        int id = 0;
        int a = 1;

        Scanner sn = new Scanner(System.in);

        while (a == 1) {
            try {
                System.out.println(" press 1:to  Professor. 2:to Student");

                a = sn.nextInt();
                switch (a) {
                    case 1:
                        id = assaingID("src/classes/txt/ProfessorDB.txt",id);
                        String user_to_register = "P-" + id;
                        System.out.println(" Register new Professor");
                        sn.nextLine();
                        System.out.println(" Type the  name ");
                        user_to_register = user_to_register + ";" + sn.nextLine();
                        System.out.println(" Type the sure name ");
                        user_to_register = user_to_register + ";" + sn.nextLine();
                        System.out.println(" Type the age");
                        user_to_register = user_to_register + ";" + sn.nextLine();
                        ev.writeFile("src/classes/txt/ProfessorDB.txt", user_to_register);
                        System.out.println("The Professor {" + user_to_register + "} was successfully Registered ");
                        a = 3;
                        break;
                    case 2:
                        id = assaingID("src/classes/txt/StudentDB.txt",id);
                        user_to_register = "S-" + id;
                        System.out.println("   Register new Student :) ");
                        sn.nextLine();
                        System.out.println(" Type the  name ");
                        user_to_register = user_to_register + ";" + sn.nextLine();
                        System.out.println(" Type the sure name ");
                        user_to_register = user_to_register + ";" + sn.nextLine();
                        System.out.println(" Type the age");
                        user_to_register = user_to_register + ";" + sn.nextLine();
                        ev.writeFile("src/classes/txt/StudentDB.txt", user_to_register);
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

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


        return null;

    }


}
