package classes.vehicles;

import classes.app.Events;
import classes.app.Messages;

import java.io.IOException;
import java.time.LocalTime;
import java.util.ArrayList;
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

    public Bicycle() {

    }

    @Override
    public String toString() {
        return "Bicycle{" + "id=" + id + ", type='" + type + '\'' + ", color='" + color + '\'' + ", availability=" + availability + '}';
    }

    protected int assaingID(String file_dir, int id) {
        Events ev = new Events();
        ArrayList<String> myList = new ArrayList<>();
        ev.readFile(file_dir, myList);
        id = (myList.size() + 1);
        return id;
    }

    public String registerBorrow() {
        Events ev = new Events();
        int id = 0;
        int a = 1;
        Scanner sn = new Scanner(System.in);

        while (a == 1) {
            try {
                Messages.line();
                System.out.println(" press 1:to  mountain. 2:to Road");
                Messages.line();

                a = sn.nextInt();
                switch (a) {
                    case 1:

                        id = assaingID("src/classes/txt/Tickets.txt",id);
                        String user_to_register = "T-" + id;
                        System.out.println(" Register new Mountain Borrow");
                        sn.nextLine();
                        System.out.println(" Type the  User ID  ");
                        user_to_register = user_to_register + ";" + sn.nextLine();
                        System.out.println(" Type the User's name ");
                        user_to_register = user_to_register + ";"+ sn.nextLine();
                        System.out.println(" Type the User's sure name ");
                        user_to_register = user_to_register + " " + sn.nextLine()+";"+"pending";
                        System.out.println(" Type the age");
                        user_to_register = user_to_register + ";" + sn.nextLine()+";"+ LocalTime.now();
                        ev.writeFile("src/classes/txt/Tickets.txt", user_to_register);
                        System.out.println("The Borrow {" + user_to_register + "} was successfully Registered ");
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
