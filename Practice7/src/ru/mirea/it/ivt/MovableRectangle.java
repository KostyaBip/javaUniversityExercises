package ru.mirea.it.ivt;

public class MovableRectangle implements Movable{

    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(){
        this.topLeft = new MovablePoint(-1,1,0,0);
        this.bottomRight = new MovablePoint(1,-1,0,0);
    }

    public void moveUp() {
        this.topLeft.setY(this.topLeft.getY()+1);
        this.bottomRight.setY(this.bottomRight.getY()+1);
    }

    @Override
    public void moveDown() {
        this.topLeft.setY(this.topLeft.getY()-1);
        this.bottomRight.setY(this.bottomRight.getY()-1);
    }

    @Override
    public void moveLeft() {
        this.topLeft.setX(this.topLeft.getX()-1);
        this.bottomRight.setX(this.bottomRight.getX()-1);
    }


    @Override
    public void moveRight() {
        this.topLeft.setX(this.topLeft.getX()+1);
        this.bottomRight.setX(this.bottomRight.getX()+1);
    }

    public void setTopLeft(MovablePoint topLeft) {
        this.topLeft = topLeft;
    }

    public void setBottomRight(MovablePoint bottomRight) {
        this.bottomRight = bottomRight;
    }

    public MovablePoint getTopLeft() {
        return topLeft;
    }

    public MovablePoint getBottomRight() {
        return bottomRight;
    }
}
