package ru.mirea.it.ivt;

public class MovableRectangleExtended extends MovableRectangle{
    public MovableRectangleExtended(MovablePoint topLeft, MovablePoint bottomRight){
        this.setTopLeft(topLeft);
        this.setBottomRight(bottomRight);
    }

    @Override
    public String toString(){
        return "Top left point: " + this.getTopLeft() + "; bottom right point: " + this.getBottomRight();
    }

    public boolean SpeedTest(){
        if(this.getTopLeft().getxSpeed() == this.getBottomRight().getxSpeed() && this.getTopLeft().getySpeed() == this.getBottomRight().getySpeed()){
            return true;
        }
        else return false;
    }
}
