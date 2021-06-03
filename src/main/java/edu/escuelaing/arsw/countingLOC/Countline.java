package edu.escuelaing.arsw.countingLOC;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @author Miguel Ángel Rodríguez Siachoque.
 * 
 */
public class Countline 
{
    /**
     * This is the main method.
     * @param args is a ArrayList of Strings.
     * 
     * @param args args[0] The user's option that chooses to counts the lines.
     * Where 'loc' counts the lines without commentaries and 'phy' counts all the lines.
     * 
     * @param args args[1] The file's location whose lines the user wants to be counted.
     * 
     * 
     */
    public static void main( String[] args )
    {
        String paramOpt = args[0], paramFile = args[1];
        ArrayList<String> answer = ReadLine(paramOpt, paramFile);
        //Print the number of lines in the file.
        System.out.print("Lines whit " + args[0] + ": " + answer.size());
    }
    
    /**
     * This method read and save the lines in the ArrayList.
     * @param option The option of the user.
     * @param locationFile The file's location.
     * @return ArrayList String, save the lines of the read file.
     */
    public static ArrayList<String> ReadLine (String option, String locationFile) {
        //paramLocate: location's unity of the repository.
        String paramLocate = System.getProperty("user.dir");
        String line = "";
        //lines: Arraylist where file lines are saved.
        ArrayList<String> lines = new ArrayList<String>();
        //Read the file.
        try{
            FileReader file = new FileReader(paramLocate + "\\src\\main\\java\\edu\\escuelaing\\arsw\\countingLOC\\" + locationFile);
            if (file.ready()){
                BufferedReader read = new BufferedReader(file);
                while((line = read.readLine())!= null){
                    //line2 = Line without spaces.
                    String line2 = line.replace(" ","");
                    //check = Verify that the lines meet the requirements.
                    boolean check = ExceptionLine(line2);
                    if (option.equals("loc") && check) {
                        lines.add(line2);
                    }
                    else if (option.equals("phy")) {
                        lines.add(line);
                    }
                }
            }
        }
        //Exception that not read the file.
        catch (IOException e){
            System.out.println("Error"+e.getMessage());
        }
        return lines;
    }
    
    /**
     * This method verify if the line is a commentary, null or not.
     * @param excepLine String, excepLine is the line of file to check.
     * @return boolean, if the value is True so the line not is a commentary, otherwise is a commentary.
     */
    public static boolean ExceptionLine (String excepLine) {
        boolean checkLine = false;
        //Verify that the lines not have the characters /, *.
        if (!excepLine.contains("/") && !excepLine.equals("")) {
            checkLine = !excepLine.contains("*");
        }
        return checkLine;
    }
}