package observerPattern;

public interface Observer {
    public void update();                   //method to update the observer, used by subject
    public void setSubject(Subject sub);    //attach with subject to observe
}
