import classes.app.Events;
import classes.app.Menus;
import classes.app.Messages;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Events events = new Events();
        //ArrayList<Song> myPlayList = new ArrayList<>();
        //events.upLoadSongsLibrary(myPlayList);

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

                        break;
                    case 2:
                        /**
                         * Function to  borrow a bicycle.
                         */
                        System.out.println("Borrow Bicycle code...");

                        break;
                    case 3:
                        /**
                         * Function to return a bicycle.
                         */
                        System.out.println("Return Bicycle code...");

                        break;
                    case 4:
                        /**
                         * Function to  pay a ticket.
                         */
                        System.out.println("Pay Tickets code...");

                        break;
                    case 5:
                        /** This method creates a list with all tickets.
                         */

                        System.out.println("Tickets  history code...");
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
            }

        } while (!bandera);
    }
}

