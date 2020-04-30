package mars.robot;

public interface RobotEvent {
    void sendSignal(char event);

    void setRobot(Robot robot);

    Robot getRobot();
}
