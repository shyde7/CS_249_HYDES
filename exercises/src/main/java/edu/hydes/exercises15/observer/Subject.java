package edu.hydes.exercises15.observer;

public interface Subject {
    void registerObserver(Observer ob);
    void removeObserver(Observer ob);
    void notifyObserver();
}
