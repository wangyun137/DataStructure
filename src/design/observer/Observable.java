package design.observer;

/**
 * Created by wangyun on 17/3/18.
 */
public interface Observable {
    void addObserver(Observer observer);

    void deleteObserver(Observer observer);

    void notifyObserver();
}
