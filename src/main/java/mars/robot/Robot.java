package mars.robot;

public class Robot {

    public static final char MOVE_FORWARD = 'F';
    public static final char MOVE_BACKWARD = 'B';
    public static final char TURN_RIGHT = 'R';
    public static final char TURN_LEFT = 'L';

    private int x;
    private int y;
    private char direction;

    public void initialize(int x, int y, char orientation) {
        setDirection(orientation);
        this.setX(x);
        this.setY(y);
    }

    public void sendSignal(char event) {
      if(event == MOVE_FORWARD){
          moveForward();
      }else if(event== MOVE_BACKWARD){
          moveBackForward();
      }else if(event== TURN_RIGHT){
          turnToRight();
      }else if(event== TURN_LEFT){
          turnToLeft();
      }
    }

    private void turnToLeft() {
        switch (getDirection()){
            case 'N' : this.setDirection('W'); break;
            case 'E' : this.setDirection('N'); break;
            case 'S' : this.setDirection('E'); break;
            case 'W' : this.setDirection('S'); break;
        }
    }

    private void turnToRight() {
        switch (getDirection()){
            case 'N' : this.setDirection('E'); break;
            case 'E' : this.setDirection('S'); break;
            case 'S' : this.setDirection('W'); break;
            case 'W' : this.setDirection('N'); break;
        }
    }

    private void moveBackForward() {
        if(getDirection() == 'N') {
            this.setY(this.getY() - 1);
        }
        if(getDirection() == 'S') {
            this.setY(this.getY() + 1);
        }
        if(getDirection() == 'E') {
            this.setX(this.getX() - 1);
        }
        if(getDirection() == 'W') {
            this.setX(this.getX() + 1);
        }
    }

    private void moveForward() {

        if(getDirection() == 'N') {
            if(getY() == 10){
                setY(-10);
            }else{
                this.setY(this.getY() + 1);
            }
        }
        if(getDirection() == 'S') {
            if(getY() == -10){
                setY(10);
            }else{
                this.setY(this.getY() - 1);
            }
        }
        if(getDirection() == 'E') {
            if(getX() == 10){
                setX(-10);
            }else{
                this.setX(this.getX() + 1);
            }
        }
        if(getDirection() == 'W') {
            if(getX() == -10){
                setX(10);
            }else{
                this.setX(this.getX() - 1);
            }
        }



    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public char getDirection() {
        return direction;
    }

    public void setDirection(char direction) {
        this.direction = direction;
    }
}
