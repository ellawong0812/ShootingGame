package comp102x.project.task;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

import comp102x.project.model.GameRecord;

public class SaveLoader {

    public void saveGameRecords(GameRecord[] records, java.io.Writer writer) {
        //The text file that will be written is connected to a Writer object. 
        
            PrintWriter w = new PrintWriter(writer);
            String name;
            int level;
            int score;
            for (int i=0;i<records.length;i++){
                name=records[i].getName();
                level=records[i].getLevel();
                score=records[i].getScore();
                w.println(name+"\t"+level+"\t"+score);
            }
            w.close();
       
        
        
        // TODO: save the game records in the array to the file
    }

    public GameRecord[] loadGameRecords(java.io.Reader reader) {

        // TODO: load the game records from the file and return an array containing the game records
        Scanner sc = new Scanner(reader);
        
        String[]line;
        
        //error
        //int j;
        //for (j=0;sc.hasNextLine();j++){}
        GameRecord[] record = new GameRecord[30];
        
        
        int i;
        for (i=0; sc.hasNextLine();i++){
            line=sc.nextLine().split("\t");  //array  
            record[i]=new GameRecord(line[0],Integer.valueOf(line[1]),Integer.valueOf(line[2]));    
        }
        
        //make a new array of exactly size, copy the original array into the new one
        //using for loop
        GameRecord[] newRecord= new GameRecord[i];
        for (int j=0;j<i;j++){
            newRecord[j]=record[j];
        }
        
        return newRecord;
        // the following line should be deleted or modified after finishing the implementation
        //return new GameRecord[] {};
    }
    
    
}
