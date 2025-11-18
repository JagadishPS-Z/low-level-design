package Observer;

import Observable.ObservableInterface;

public class NotificationObserver implements ObserverInterface{
    ObservableInterface obj;
    String user;
    public NotificationObserver(ObservableInterface observableObj,String user){
        this.obj=observableObj;
        this.user=user;
        obj.addObserver(this);

    }

    @Override
    public void update() {
        System.out.println("Notification sent to: "+user+". Stock updated to: "+obj.getCount());
    }
}
