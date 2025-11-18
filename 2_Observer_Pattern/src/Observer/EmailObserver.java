package Observer;

import Observable.ObservableInterface;

public class EmailObserver implements ObserverInterface{
    ObservableInterface obj;
    String email;
    public EmailObserver(ObservableInterface observableObj,String email){
        this.obj=observableObj;
        this.email=email;
        obj.addObserver(this);
    }
    @Override
    public void update() {
        System.out.println("Email sent to:"+email+". Stock updated to: "+obj.getCount());
    }
}
