
public class Vehicle {
    DriveStrategy DriveSt;
    Vehicle(DriveStrategy ob){
        this.DriveSt=ob;
    }
    public void drive(){
        DriveSt.drive();
    }
}
