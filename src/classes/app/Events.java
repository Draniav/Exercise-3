package classes.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Events {

    /**
     * This method creates an Array List with the data in a route txt.
     */
    public ArrayList readFile(String file_dir, ArrayList<String> myBicycleList) {

        String text = "";
        try {
            BufferedReader bf = new BufferedReader(new FileReader(file_dir));

            String temp = "";
            String bfRead;
            //code while bf has data
            while ((bfRead = bf.readLine()) != null) {

                temp = temp + bfRead;//saves the text from  the file
                myBicycleList.add(bfRead);
            }
            //text = temp;
            //myBicycleList.add(temp);
        } catch (Exception e) {
            System.err.println("file not found ");
        }
        return myBicycleList;
    }

    /**
     * This method creates a list with the selected array(for general uses).
     */
    public static void eventPrintAll(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }

    public static void eventMenuUser() {
        boolean out = false;
        Integer opt = 0;
        Scanner input = new Scanner(System.in);
        Events events = new Events();
        ArrayList<String> myUserList = new ArrayList<>();

        /** This method creates a list with all tickets.
         */

        while (!out) {
            Menus.menuUser();
            opt = input.nextInt();

            switch (opt) {
                case 1:
                    System.out.println("code to show all Professors");
                    events.readFile("src/classes/txt/ProfessorDB.txt", myUserList);
                    Messages.tableUsersDB();
                    eventPrintAll(myUserList);

                    break;
                case 2:
                    System.out.println("code to show all Students");
                    events.readFile("src/classes/txt/StudentDB.txt", myUserList);
                    Messages.tableUsersDB();
                    eventPrintAll(myUserList);
                    break;
                case 3:
                    System.out.println("code to register new User");
                    break;
                case 0:

                    out = true;
                    break;

                default:
                    Messages.failureMsg2();
            }
        }
    }


}
