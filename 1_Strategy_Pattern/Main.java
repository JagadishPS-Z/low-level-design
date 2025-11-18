public class Main{
    public static void main(String[] args){
        Vehicle car1=new Car(new NormalDriveStrategy());
        car1.drive();
        Vehicle car2=new Car(new OffroadDriveStrategy());
        car2.drive();
    }
}