package prac06.task01;

public class MovableCircle implements Movable{

    public MovablePoint center;
    public int radius;

    public MovableCircle( int x, int y, int xSpeed, int ySpeed, int radius ){
        center = new MovablePoint(x,y,xSpeed,ySpeed);
        this.radius = radius;
    }

    @Override
    public String toString(){
        return "Circle: radius = "+radius+" with "+center.toString();
    }
    @Override
    public void moveUp() {
        center.moveUp();
    }
    @Override
    public void moveDown() {
        center.moveDown();
    }
    @Override
    public void moveLeft() {
        center.moveLeft();
    }
    @Override
    public void moveRight() {
        center.moveRight();
    }
}

