package final_lab;

public interface Observant {
    void notifyAllObservers();
    void Attach (Observer observer );   
    public boolean getVisualState();    
}
