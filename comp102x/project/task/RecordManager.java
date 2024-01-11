package comp102x.project.task;

import comp102x.project.model.GameRecord;
import java.util.*;
public class RecordManager {
    //at first, the record page is empty, after first player plays-->record page should have one record only
    //(error) but me returns a null empty record page
    
    //some invalid content or invalid logic: if (newRecord.getScore() > updatedRecords[n].getScore()) 
    
    //error: same name, but I put same name record behind, should be replace or ignore
    
    public GameRecord[] updateGameRecords(GameRecord[] oldRecords, GameRecord newRecord) {
     
        GameRecord[] updatedRecords = Arrays.copyOf(oldRecords, oldRecords.length + 1);
        GameRecord[] updatedRecords2 = Arrays.copyOf(oldRecords, oldRecords.length + 1); 
        
        //if the original record is empty
        //solved!!!test case 1.1:error
        if (oldRecords.length==0){
            updatedRecords[0]=newRecord;
            return updatedRecords;
        }
        // TODO: return an updated game record array after processing the new game record
        for (int i=0;i<oldRecords.length;i++){
            //test case 3: first scenario: same name and level but different score
            //error
            //problem: if the first one is not same name and same level, it would automately skip into else case
        if (newRecord.getName().equals(oldRecords[i].getName()) && newRecord.getLevel()==oldRecords[i].getLevel()){
            if (newRecord.getScore()<=oldRecords[i].getScore()){
                return oldRecords; // Ignore the new record if the score is not higher
            }
            else{
                //error!!!
                //i think the error part is here
                
                oldRecords[i] = newRecord; // Replace the existing record with the new record
                //the existing records move downward by 1 unit
                /*for (int j=i+1;j<updatedRecords.length;j++){
                        updatedRecords[j]=updatedRecords2[j-1];
                    }*/
                Util.sort(oldRecords);
                return oldRecords;    
                
                
            }
        }
    }
    
        for (int i=0;i<oldRecords.length;i++){
            if (oldRecords.length<10){
                updatedRecords[oldRecords.length]=newRecord;
                Util.sort(updatedRecords);// Sort the updatedRecords array
                return updatedRecords;
            }
            else{
            //if old Record length>10, but not the same level,still append to the list
            //solved!!!test case 1.2: error
            int count=0;
            for (int a=0; a<oldRecords.length;a++){
                if (oldRecords[a].getLevel()==newRecord.getLevel()){
                    count++;
                }
            }
            
            if (count<10){
                updatedRecords[oldRecords.length]=newRecord;
            }
            else{
            // Iterate through the updatedRecords array to find the appropriate position for the newRecord
            for (int n = 0; n < updatedRecords.length; n++) {
                if (newRecord.getScore() > updatedRecords[n].getScore()) {
                    //replace old records with the new record
                    updatedRecords[n] = newRecord;
                    for (int j=n+1;j<updatedRecords.length;j++){
                        updatedRecords[j]=updatedRecords2[j-1];
                    }
                    
                    break;
                }
            }
        }
            //return the old records array
            Util.sort(updatedRecords);
            return updatedRecords;
            
        }
        
        
    }
    
    Util.sort(updatedRecords);
    return updatedRecords;
    }
}
