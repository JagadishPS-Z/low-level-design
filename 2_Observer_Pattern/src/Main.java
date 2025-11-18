import Observable.ObservableInterface;
import Observable.PhoneObservable;
import Observer.EmailObserver;
import Observer.NotificationObserver;
import Observer.ObserverInterface;

public class Main {
    public static void main(String[] args){
        ObservableInterface phoneObv=new PhoneObservable(10);
        ObserverInterface ob1=new EmailObserver(phoneObv,"abc@gmail.com");
        ObserverInterface ob2=new NotificationObserver(phoneObv,"ABC");
        ObserverInterface ob3=new NotificationObserver(phoneObv,"DEF");

        phoneObv.updateCount(20);

    }
}
