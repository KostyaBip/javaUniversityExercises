package ru.mirea.it.ivt;

public class MovableCircle implements Movable{
    private int radius;
    private MovablePoint center;

    public MovableCircle(int radius, MovablePoint center) {
        this.radius = radius;
        this.center = center;
    }

    @Override
    public String toString(){
        return "Radius: " + radius + "; CentralPoint: " + center;
    }

    public void moveUp() {
        this.center.setY(this.center.getY()+1);
    }

    @Override
    public void moveDown() {
        this.center.setY(this.center.getY()-1);
    }

    @Override
    public void moveLeft() {
        this.center.setX(this.center.getX()-1);
    }


    @Override
    public void moveRight() {
        this.center.setX(this.center.getX()+1);
    }
}
