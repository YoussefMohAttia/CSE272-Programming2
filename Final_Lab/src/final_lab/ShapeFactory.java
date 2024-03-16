package final_lab;
import static final_lab.Type.BOMB;
import java.util.Random;

public class ShapeFactory {

   
    public Shape createShape(String shapeType) {

        Type[] values = Type.values();
        Type index = values[new Random().nextInt(4)];
               
        String imagePath = shapeType + index+ ".png"; 
            switch (shapeType) {                
            case "Cup":
                return new Cup((int) (Math.random() * 1500), (int) (Math.random() * 750), "/"+imagePath,index);
            case "Plate":
                return new Plate((int) (Math.random() * 1500), (int) (Math.random() * 750), "/"+imagePath,index);
             case "Bomb":
                return new Bomb((int) (Math.random() * 1500), (int) (Math.random() * 750), "/Bomb.png",BOMB);
             case "Clown":
                return Clown.getinstance();
            default:
                throw new IllegalArgumentException("Invalid shape type: " + shapeType);
        }
    }
}