package final_lab;

import java.util.List;

public interface Iterator {
    public Shape get(int i);
    public void Add(Shape o);
    public void Remove(Shape i);      
    public boolean hasNext( );
    public Shape next( ); 
    public List List();    

}
