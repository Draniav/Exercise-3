package classes.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Events {

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
            text = temp;
            //myBicycleList.add(temp);
        } catch (Exception e) {
            System.err.println("file not found ");
        }
        return myBicycleList;
    }

}
