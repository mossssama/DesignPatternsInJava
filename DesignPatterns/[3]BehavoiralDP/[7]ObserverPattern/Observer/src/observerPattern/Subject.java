package observerPattern;

public interface Subject {
    public void register(Observer obj);         //methods to register and unregister observers
    public void unregister(Observer obj);

    public void notifyObservers();              //method to notify observers of change

    public Object getUpdate(Observer obj);      //method to get updates from subject
}
