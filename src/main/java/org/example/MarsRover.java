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
    public String executeCommand(String command) {
        char[] directions = {'N', 'E', 'S', 'W'};
        for (int i = 0; i < directions.length; i++) {
            if (directions[i] == direction) {
                if (command.equals("L")) {
                    int newDirectionIndex = i==0? directions.length - 1: i-1;
                    setDirection(directions[newDirectionIndex]);
                }
                break;
            }
        };
        return showStatus();
    }
}
