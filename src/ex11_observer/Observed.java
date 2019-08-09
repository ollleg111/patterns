package ex11_observer;

public interface Observed {

    public void addObserver(Observer observer);

    public void removeObserver(Observer observer);

    public void notifyObservers();
}
