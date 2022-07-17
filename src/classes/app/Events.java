package classes.app;

import classes.persons.Person;

import java.io.*;
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

    /**
     * This method to  write a txt.
     */
    public void writeFile(String file_dir, String text) throws IOException {


        FileWriter fw = null;

        try {
            fw = new FileWriter(file_dir, true);

            PrintWriter pw = new PrintWriter(fw);
            pw.println(text);
            pw.flush();

            System.out.println("file updated");
        } catch (IOException exception) {
            System.err.println("file not found ");
        } finally {
            assert fw != null;
            fw.close();
        }
    }

    /**
     * method to  search a word in  the txt
     */
    public void searchInFile(String file_dir, String text) {
        String line;


        try {
            BufferedReader bf = new BufferedReader(new FileReader(file_dir));

            while ((line = bf.readLine()) != null) {
                String[] word = line.split(";");
                for (int i = 0; i < word.length; i++) {
                    if (word[i].equals(text)) {
                        System.out.println(line);

                    }
                }
            }
        } catch (IOException exception) {
            System.err.println("file not found ");
        }
    }



    public static void eventMenuUser() throws IOException {
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
                    Person pe = new Person();

                    System.out.println("code to register new User");

                    pe.registerUser();


                    out = true;
                    break;
                case 0:

                    out = true;
                    break;

                default:
                    Messages.failureMsg2();
            }
        }
    }

    public static void modifyFile(String filePath, String oldStatus, String newStatus) {

        String oldContent = "";
        BufferedReader br = null;
        FileWriter fw = null;
        try {
            br = new BufferedReader(new FileReader(filePath));
            //Reading all the lines of input text file into oldContent
            String line = br.readLine();
            while (line != null) {
                oldContent = oldContent + line + System.lineSeparator();
                line = br.readLine();
            }
            String newContent = oldContent.replaceAll(oldStatus, newStatus);
            fw = new FileWriter(filePath);
            fw.write(newContent);
        } catch (IOException e) {

        } finally {
            try {
                //Closing the resources
                br.close();
                fw.close();
            } catch (IOException e) {
                System.err.println("file not found ");
            }
        }
    }


}
