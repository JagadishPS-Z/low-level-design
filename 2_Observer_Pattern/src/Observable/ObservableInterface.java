package Observable;

import Observer.ObserverInterface;

public interface ObservableInterface {
    void addObserver(ObserverInterface ob);
    void deleteObserver(ObserverInterface ob);
    void notifyObserver();
    void updateCount(int count);
    Integer getCount();

}
