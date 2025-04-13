import java.awt.*;

public class Player {
    private int posX;
    private int posY;
    private int width;
    private int heigth;
    private Image image;
    private int velocityY;

    public Player(int posX, int posY, int width, int heigth, Image image) {
        this.posX = posX;
        this.posY = posY;
        this.width = width;
        this.heigth = heigth;
        this.image = image;

        this.velocityY = -0;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeigth(int heigth) {
        this.heigth = heigth;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public void setVelocityY(int velocityY) {
        this.velocityY = velocityY;
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    public int getWidth() {
        return width;
    }

    public int getHeigth() {
        return heigth;
    }

    public Image getImage() {
        return image;
    }

    public int getVelocityY() {
        return velocityY;
    }
}
