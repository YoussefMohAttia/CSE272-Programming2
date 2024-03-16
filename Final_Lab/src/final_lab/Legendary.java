package final_lab;

import static final_lab.Type.THEME;

public class Legendary implements Level {

    ShapeFactory sf = new ShapeFactory();
    
    @Override
    public Iterator createConstantshapes() {
    Iterator constant = new ShapesData();          
       constant.Add(new Shape(0,0, "/Theme.png", THEME));
        return constant;
    }
    @Override
    public Iterator createMovingshapes() {
    Iterator moving = new ShapesData();
    int i=0;
        while(i<15) {
            i++;
            moving.Add(sf.createShape("Plate"));
        }i=0;
        while(i<15) {
            i++;
            moving.Add(sf.createShape("Cup"));
        }i=0;
        while(i<6) {
            i++;
            moving.Add(sf.createShape("Bomb"));
        } 
           
        return moving; 
    }
    @Override
    public Iterator createControlshapes() {
    Iterator control = new ShapesData();  
        control.Add(sf.createShape("Clown"));
        return control;    
    }
    @Override
    public int gameSpeed() {
    return 1; 
    }   
}
