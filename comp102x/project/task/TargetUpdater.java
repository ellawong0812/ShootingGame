package comp102x.project.task;

import java.util.Random;

import comp102x.project.model.Target;

public class TargetUpdater {
    
    public void updateTarget(Target[] targets, int level) {
        
        // TODO: finishing the implementation of this method so that it updates the target positions according to the level
        // repeatly select two targets from target array-->swap their x,y,x positions
        //level-->determine how many times to repeat(1-0, 2-4, 3-10)
        //both of targets are hitted or not hitted--> no swapping
        
        // randomly draw two targets--> get the index(x,y,z) of two targets
        //  set temp and then swap
        Random r = new Random();
        int numOfSelection;

        
        if (level==1)
        numOfSelection=0;
        else if (level==2)
        numOfSelection=4;
        else 
        numOfSelection=10;
        
        
        for (int i=0; i< numOfSelection; i++){
        Target target1 = targets[r.nextInt(targets.length)];
        Target target2 = targets[r.nextInt(targets.length)];    
        if ((target1.isHit() && target2.isHit()) || (!target1.isHit() && !target2.isHit())) {
            continue;
        }
        else{
        int tempX = target1.getX();
        int tempY = target1.getY();
        int tempZ = target1.getZ();

        target1.setX(target2.getX());
        target1.setY(target2.getY());
        target1.setZ(target2.getZ());
        
        target2.setX(tempX);
        target2.setY(tempY);
        target2.setZ(tempZ);
        }
        
    }
        
        
    }

}
