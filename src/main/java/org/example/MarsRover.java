package org.example;public class MarsRover {
    private int x;
    private int y;
    private char direction;

    public MarsRover() {
        this.x = 0;
        this.y = 0;
        this.direction = 'N';
    }

    public String showStatus() {
        return x + ":" + y + ":" + direction;
    }
    public void setDirection(char newDirection){
        this.direction = newDirection;
    }
}
