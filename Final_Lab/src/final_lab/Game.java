package final_lab;
import eg.edu.alexu.csd.oop.game.GameObject;
import eg.edu.alexu.csd.oop.game.World;
import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;

public class Game implements World {
    private static int MAX_TIME = 1 * 90 * 1000;
    private int score = 0;
    private long startTime = System.currentTimeMillis();
    private final int width;
    private final int height;
    private Iterator moving;
    private Iterator control;
    private Iterator constant;
    Level l;
    private int leftstackheight = 0;
    private int rightstackheight = 0;
    private Iterator leftstack = new ShapesData();
    private Iterator rightstack = new ShapesData();

    public Game(int screenWidth, int screenHeight, String level) {
        width = screenWidth;
        height = screenHeight;
        if (level.equals("Beginner")) {
            l = new Beginner();
        } else if (level.equals("Amateur")) {
            l = new Amateur();
        } else {
            l = new Legendary();
        }
        moving = l.createMovingshapes();
        control = l.createControlshapes();
        constant = l.createConstantshapes();
    }

    @Override
    public boolean refresh() {
        boolean timeout = System.currentTimeMillis() - startTime > MAX_TIME;
        doRefresh();
        return !timeout;
    }

    private boolean intersectLeft(GameObject clown, GameObject object) {
        int deltaX;
        int deltaY;          
        if(object instanceof Plate){
        deltaX = clown.getX() + 10 - object.getX() - object.getWidth() / 10;
        deltaY = clown.getY() - object.getY()+5  - leftstackheight;
        }
        else if(object instanceof Cup){
        deltaX = clown.getX() + 10 - object.getX() - object.getWidth() / 10;
        deltaY = clown.getY() - object.getY()-20 - leftstackheight;
        }
        else {
        deltaX = clown.getX() + 10 - object.getX() - object.getWidth() / 10;
        deltaY = clown.getY() - object.getY()-30 - leftstackheight;
        }        
        boolean xIntersect = Math.abs(deltaX) <= object.getWidth();
        boolean yIntersect = deltaY == 0;
        return xIntersect && yIntersect;
    }

    private boolean intersectRight(GameObject clown, Shape object) {
        int deltaX;
        int deltaY;               
        if(object instanceof Plate){
        deltaX = clown.getX() + 160 - object.getX() - object.getWidth() / 10;
        deltaY = clown.getY() - object.getY()+5  - rightstackheight;
        }
        else if(object instanceof Cup){
        deltaX = clown.getX() + 160 - object.getX() - object.getWidth() / 10;
        deltaY = clown.getY() - object.getY()-20 - rightstackheight;
        }
        else {
        deltaX = clown.getX() + 160 - object.getX() - object.getWidth() / 10;
        deltaY = clown.getY() - object.getY()-30 - rightstackheight;
        }        
        boolean xIntersect = Math.abs(deltaX) <= object.getWidth();
        boolean yIntersect = deltaY == 0;
        return xIntersect && yIntersect;
    }

    public void doRefresh() {
        Shape clown = control.get(0);
        Shape m;
        while (moving.hasNext()) {
            m = moving.next();
            if (m.getShapeType() == Type.GREEN || m.getShapeType() == Type.BLUE || m.getShapeType() == Type.RED || m.getShapeType() == Type.GOLD) {
                if (intersectRight(clown, m)) {
                    rightstackheight += m.getHeight();
                    m.setX(clown.getX() + 165);
                    m.setY(clown.getY() + 10 - rightstackheight);
                    m.setycontrol(1);
                    control.Add(m);
                    moving.Remove(m);
                    rightstack.Add(m);
                    int x = rightstack.List().size();
                    if (x >= 3) {
                        Type shapeType1 = rightstack.get(x - 1).getShapeType();
                        Type shapeType2 = rightstack.get(x - 2).getShapeType();
                        Type shapeType3 = rightstack.get(x - 3).getShapeType();
                        if (shapeType1 == shapeType2 && shapeType1 == shapeType3) {
                            for (int i = 1; i <= 3; i++) {
                                Shape temp = rightstack.get(x - i);
                                control.Remove((Shape) temp);
                                temp.setX((int) (Math.random() * width));
                                rightstackheight -= temp.getHeight();
                                moving.Add((Shape) temp);
                                temp.setycontrol(0);
                                temp.setY(0);
                                rightstack.Remove((Shape) temp);
                            }
                            score += 10;
                        }
                    }
                }
                if (intersectLeft(clown, m)) {
                    leftstackheight += m.getHeight();
                    m.setX(clown.getX() + 5);
                    m.setY(clown.getY() + 10 - leftstackheight);
                    m.setycontrol(1);
                    control.Add(m);
                    moving.Remove(m);
                    leftstack.Add(m);
                    int x = leftstack.List().size();
                    if (x >= 3) {
                        Type shapeType1 = leftstack.get(x - 1).getShapeType();
                        Type shapeType2 = leftstack.get(x - 2).getShapeType();
                        Type shapeType3 = leftstack.get(x - 3).getShapeType();

                        if (shapeType1 == shapeType2 && shapeType1 == shapeType3) {
                            for (int i = 1; i <= 3; i++) {
                                Shape temp = leftstack.get(x - i);
                                control.Remove((Shape) temp);
                                temp.setX((int) (Math.random() * width));
                                leftstackheight -= temp.getHeight();
                                moving.Add((Shape) temp);
                                temp.setycontrol(0);
                                temp.setY(0);
                                leftstack.Remove((Shape) temp);
                            }
                            score += 10;
                        }
                    }
                }
                m.setY((m.getY() + 1));
                if (m.getY() == height) {
                    m.setY(0);
                    m.setX((int) (Math.random() * width));
                }
            }
            else if (m.getShapeType() == Type.BOMB) {
                if (intersectLeft(clown, m) || intersectRight(clown, m)) {
                    m.setY(0);
                    m.setX((int) (Math.random() * width));
                    score = Math.max(0, score - 10);
                }
                m.setY((m.getY() + 1));
                if (m.getY() == height) {
                    m.setY(0);
                    m.setX((int) (Math.random() * width));
                }
            }
                if (clown.getX() <= 0) {
                    while (rightstack.hasNext()) {
                        m = rightstack.next();
                        m.setX(165);
                    }
                }
                if (clown.getX() >= 1250) {
                    while (rightstack.hasNext()) {
                        m = rightstack.next();
                        m.setX(1415);
                    }
                    while (leftstack.hasNext()) {
                        m = leftstack.next();
                        m.setX(1250);
                    }
                }            
        }
    }

    public int Score() {
        return this.score;
    }
    @Override
    public List<GameObject> getConstantObjects() {
        return constant.List();
    }
    @Override
    public List<GameObject> getMovableObjects() {
        return moving.List();
    }
    @Override
    public List<GameObject> getControlableObjects() {
        return control.List();
    }
    @Override
    public int getWidth() {
        return width;
    }
    @Override
    public int getHeight() {
        return height;
    }
    @Override
    public String getStatus() {
        return "Score=" + score + "   |   Time=" + Math.max(0, (MAX_TIME - (System.currentTimeMillis() - startTime)) / 1000) + "  |    " + "Status: " + getstate();
    }
    public String getstate() {
        if (System.currentTimeMillis() - startTime < MAX_TIME) {
            return "In progress";
        } 
        else return "End";
    }
    @Override
    public int getSpeed() {
        return l.gameSpeed();
    }
    @Override
    public int getControlSpeed() {
        return 15;
    }
}
