package classes.vehicles;

import classes.app.Events;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Bicycle {

    private int id; //BIC-XXX
    private String type;//Mountain, Road.
    private String color;//red,blue,green,yellow,purple.
    private boolean availability;//true,false


    public Bicycle(int id, String type, String color, boolean availability) {
        this.id = id;
        this.type = type;
        this.color = color;
        this.availability = availability;
    }

    @Override
    public String toString() {
        return "Bicycle{" + "id=" + id + ", type='" + type + '\'' + ", color='" + color + '\'' + ", availability=" + availability + '}';
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
