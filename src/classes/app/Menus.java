package classes.app;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menus {

    public static void menuMain() {
        Messages.line();
        System.out.println("|         Hello Welcome to BICI_U's App                  |");
        Messages.line();
        System.out.println("|              1- Register user.                         |");
        System.out.println("|              2- Borrow Bicycle.                        |");
        System.out.println("|              3- Return Bicycle.                        |");
        System.out.println("|              4- Pay tickets.                           |");
        System.out.println("|              5- Tickets history.                       |");
        System.out.println("|              0- Exit program.                          |");
        Messages.line();
    }
    public static void menuHistory() {
        Messages.line();
        System.out.println("|             Menu Tickets history                       |");
        Messages.line();
        System.out.println("|              1- Show all.                              |");
        System.out.println("|              2- Search by code.                        |");
        System.out.println("|              3- Search by status.                      |");
        System.out.println("|              0- Go Back.                               |");
        Messages.line();
    }

    public static boolean menuContinue(boolean exit) {
        exit = true;
        int a = 1;
        Scanner sn = new Scanner(System.in);
        while (a == 1) {
            try {
                Messages.continueMsg();
                a = sn.nextInt();
                switch (a) {
                    case 1:
                        a = 2;
                        exit = false;
                        break;
                    case 2:

                        System.out.println("   Thank you for using this app :) ");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Type only numbers please (1:to  continue. 2:to Finish");

                        a = 1;
                }
            } catch (InputMismatchException e) {
                a = 1;


                System.out.println("Type only numbers please (1:to  continue. 2:to Finish");
                sn.next();

            }
        }
        return exit;
    }


}
