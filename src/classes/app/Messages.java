package classes.app;

public class Messages {

    /**
     * a method is created to can create marquees in the app.
     */
    public static void line() {
        System.out.println("===========================================================");
    }

    /**
     * a method is created to show a message to the user about an  error.
     */
    public static void failureMsg() {
        line();
        System.out.println("|   Error, the app can't read it,  please type it again   |");
        line();

    }

    /**
     * line to notify at user about wrong number typed,  it is out of range.
     */
    public static void failureMsg2() {

        System.out.println("ERROR, please type ONLY numbers within the range of the menu");

    }

    /**
     * a method is created to create the menu to be displayed by the user.
     */

    public static void returningMsg() {
        line();
        System.out.println("| The typed option is empty right now or was wrong typed |");
        line();
        System.out.println("|             Returning to main menu.                    |");
        line();
    }

    /**
     * a method created to show the menu to be displayed by the user.
     */

    public static void continueMsg() {
        line();
        System.out.println("|            Do  you  want to  continue                 |");
        line();
        System.out.println("|                     1- yes                            |");
        System.out.println("|                     2- no                             |");
        line();
    }

    /**
     * line to close the app.
     */
    public static void closingMsg() {
        line();
        System.out.println("Thank you for using this app, have a nice day");
        line();

    }
    /**
     * line to show a format in the menu bicycles.
     */
    public static void tableBicycleDB() {
        System.out.println("============================================");
        System.out.println("|   ID   |   Type   | Color | Availability |");
        System.out.println("============================================");
    }
    public static void tableTicketsDB() {
        System.out.println("===========================================================");
        System.out.println("|  Code  |   UserID   |    Name    | Amount($) | Status |");
        System.out.println("===========================================================");


    }
    public static void tableUsersDB() {
        System.out.println("=================================");
        System.out.println("|   UserID   |    Name    | Age |");
        System.out.println("=================================");


    }


}
