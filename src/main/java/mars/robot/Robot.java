package mars.robot;

public class Robot {

    private RobotEvent robotEvent;

    private int x;
    private int y;
    private char direction;

    public Robot() {
    }

    public Robot(int x, int y, char direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
        this.robotEvent = new ProtocoleZX80();
    }

    public Robot(RobotEvent robotEvent, int x, int y, char direction) {
        this.robotEvent = robotEvent;
        this.x = x;
        this.y = y;
        this.direction = direction;
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

    public void receiveSignal(char f) {
        this.robotEvent.setRobot(this);
        this.robotEvent.sendSignal(f);
    }
}
