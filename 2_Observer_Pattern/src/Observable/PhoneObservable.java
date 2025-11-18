package Observable;

import Observer.ObserverInterface;

import java.util.ArrayList;
import java.util.List;

public class PhoneObservable implements ObservableInterface {
    List<ObserverInterface> observerList=new ArrayList<>();
    int count;

    public PhoneObservable(Integer count){
        this.count=count;
    }

    @Override
    public void addObserver(ObserverInterface ob){
        observerList.add(ob);
    }

    @Override
    public void deleteObserver(ObserverInterface ob) {
        observerList.remove(ob);
    }

    @Override
    public void notifyObserver() {
        for(ObserverInterface ob:observerList){
            ob.update();
        }
    }

    @Override
    public void updateCount(int count) {
        this.count=count;
        notifyObserver();
    }

    @Override
    public Integer getCount() {
        return this.count;
    }


}
