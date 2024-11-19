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

    public void moveForward(){
        switch(direction){
            case 'N':
                this.y+=1;
                break;
            case 'E':
                this.x+=1;
                break;
            case 'S':
                this.y-=1;
                break;
            case 'W':
                this.x-=1;
                break;
            default:
                break;
        }
    }

    public String executeCommand(String command) {
        char[] directions = {'N', 'E', 'S', 'W'};
        if (command.equals("M")) {
            this.moveForward();
            return showStatus();
        }
        for (int i = 0; i < directions.length; i++) {
            if (directions[i] == direction) {
                if (command.equals("L")) {
                    int newDirectionIndex = i==0? directions.length - 1: i-1;
                    setDirection(directions[newDirectionIndex]);
                }
                else if (command.equals("R")) {
                    int newDirectionIndex = (i+1) % directions.length;
                    setDirection(directions[newDirectionIndex]);
                }
                break;
            }
        };
        return showStatus();
    }

}
