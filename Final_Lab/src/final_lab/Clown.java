package final_lab;

import static final_lab.Type.CLOWN;

public class Clown extends Shape {
    int ycontrol = 1;
    private int positionY;
    
      
  private static Clown clown=null;
    private Clown(){
        super(750,485,"/clown.png",CLOWN);
    }
    public static Clown getinstance(){
        if (clown==null)
           clown=new Clown();        
        return clown;
    }    
    @Override
    public void setY(int yCoordinate) {
        if (ycontrol == 0) {
        this.positionY = yCoordinate;}
    }    
  
}