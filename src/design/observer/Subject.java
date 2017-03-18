package design.observer;

import java.util.Vector;

/**
 * Created by wangyun on 17/3/18.
 */
public abstract class Subject implements Observable{
    private Vector<Observer> observers = new Vector<Observer>();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer o : observers) {
            o.update();
        }
    }
}
