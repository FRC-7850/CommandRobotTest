package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.button.CommandXboxController;

public class commandXboxControllerDB extends CommandXboxController {
    

    public  commandXboxControllerDB(int port) {
        super(port);
    }

    @Override
    public double getRightY(){
        if (Math.abs(super.getRightY()) < 0.05) {
            return 0.0;
        }
        return super.getRightY(); 
    }

    @Override
    public double getLeftY(){
        if (Math.abs(super.getLeftY()) < 0.05) {
            return 0.0;
        }
        return super.getLeftY(); 
    }
    
}
