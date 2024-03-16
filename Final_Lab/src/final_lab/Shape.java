package final_lab;

import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import eg.edu.alexu.csd.oop.game.GameObject;

public  class Shape implements GameObject{

    private BufferedImage[] shapeImages = new BufferedImage[1];
    private int positionX;
    private int positionY;
    private boolean isDisplayed;
    private Type shapeType;    
    int ycontrol = 0;

    
    public Shape(int xCoordinate, int yCoordinate, String imagePath, Type type) {
        positionX = xCoordinate;
        positionY = yCoordinate;
        shapeType = type;
        isDisplayed = true;
        		try {
			shapeImages[0] = ImageIO.read(getClass().getResourceAsStream(imagePath));
		} catch (IOException e) {
			e.printStackTrace();
		}     
    }    
    
    public void setycontrol(int number) {
        ycontrol = number;
    }
    
    @Override
    public int getX() {
        return positionX;
    }

    @Override    
    public void setX(int xCoordinate) {
        this.positionX = xCoordinate;
    }

    @Override
    public int getY() {
        return positionY;
    }

    @Override
    public void setY(int yCoordinate) {
        if (ycontrol == 0) {
        this.positionY = yCoordinate;}
    }

    @Override
    public BufferedImage[] getSpriteImages() {
        return shapeImages;
    }

    @Override
    public int getWidth() {
        if (shapeImages != null && shapeImages.length > 0) {
            return shapeImages[0].getWidth();
        } else {
            return 0;
        }
    }

    @Override
    public int getHeight() {
        if (shapeImages != null && shapeImages.length > 0) {
            return shapeImages[0].getHeight();
        } else {
            return 0;
        }
    }
    
    @Override
    public boolean isVisible() {
        return isDisplayed;
    }

    public void hide() {
        this.isDisplayed = false;
    }

    public void show() {
        this.isDisplayed = true;
    }

    public Type getShapeType() {
        return shapeType;
    }

    public void setShapeType(Type type) {
        this.shapeType = type;
    }
}

