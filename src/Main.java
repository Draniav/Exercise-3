import classes.app.Events;
import classes.app.Menus;
import classes.app.Messages;
import classes.persons.Person;

import java.io.IOException;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String search;
        Events events = new Events();

        ArrayList<String> myBicycleList2 = new ArrayList<>();

        boolean out = false;
        boolean bandera = false;
        /**
         * Main menu for program execution
         */

        do {
            Scanner input = new Scanner(System.in);
            int opt;
            /**
             * Try is used for error handling
             */
            try {

                Menus.menuMain();
                opt = input.nextInt();

                switch (opt) {
                    case 1:
                        /**
                         * Register a new user.
                         */
                        System.out.println("Register user code...");

                        Events.eventMenuUser();

                        break;
                    case 2:
                        /**
                         * Function to  borrow a bicycle.
                         */
                        System.out.println("Borrow Bicycle code...");

                        events.readFile("src/classes/txt/BicyclesDB.txt", myBicycleList2);
                        Messages.tableBicycleDB();
                        events.eventPrintAll(myBicycleList2);


                        break;
                    case 3:
                        /**
                         * Function to return a bicycle.
                         */

                        break;
                    case 4:
                        /**
                         * Function to  pay a ticket.
                         */
                        System.out.println("type the Ticket's ID to pay ");
                        String ticket = input.next();
                        events.searchInFile("src/classes/txt/TicketsDB.txt",ticket);
                        events.modifyFile("src/classes/txt/TicketsDB.txt", "pending", "ok");
                        System.out.println("ID :"+ticket+" was successfully updated");
                        break;
                    case 5:
                        /** This method creates a list with all tickets.
                         */
                        System.out.println("Tickets  history code...");

                        while (!out) {
                            Menus.menuHistory();
                            opt = input.nextInt();

                            switch (opt) {
                                case 1:
                                    System.out.println("code to show all tickets");

                                    events.readFile("src/classes/txt/Tickets.txt", myBicycleList2);
                                    System.out.println(myBicycleList2);
                                    Messages.tableTicketsDB();
                                    for (int i = 0; i < myBicycleList2.size(); i++) {
                                        System.out.println(myBicycleList2.get(i));
                                    }

                                    break;
                                case 2:
                                    System.out.println("type the code to search");

                                    search = input.next();
                                    Messages.tableTicketsDB();
                                    events.searchInFile("src/classes/txt/Tickets.txt", search);
                                    break;
                                case 3:
                                    System.out.println("code to search by status");

                                    search = input.next();
                                    Messages.tableTicketsDB();
                                    events.searchInFile("src/classes/txt/Tickets.txt", search);
                                    break;
                                case 0:

                                    out = true;
                                    break;

                                default:
                                    Messages.failureMsg2();
                            }
                        }

                        break;

                    case 0:
                        Messages.closingMsg();
                        System.exit(0);
                        break;

                    default:
                        Messages.failureMsg2();
                }
            } catch (InputMismatchException e) {
                Messages.failureMsg();
                bandera = Menus.menuContinue(false);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        } while (!bandera);
    }
}

