package comp102x.project.task;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import comp102x.project.view.GameScreen;

// TODO: finish the implementation of the AimListener class so that it process mouse motion events

public class AimListener implements MouseMotionListener{
    private double tilt;
    private double pan;
    
    public double getTilt(){
        return tilt;
    }
    
    public double getPan(){
        return pan;
    }
    
    
    public void mouseMoved(MouseEvent e) {
        //override mouseMoved(MouseEvent)
        //update the values of pan and tilt
        int x=e.getX();
        int y=e.getY();
        pan=(double)x/GameScreen.WIDTH*180-90;
        tilt=(double)y/GameScreen.HEIGHT*90;
        
    }
    
    
    
    public void mouseDragged(MouseEvent e) {
        // Implement the mouseDragged method if needed
    }
    
    
    
    
    
    
    
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
}
