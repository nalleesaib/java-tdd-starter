package mars.robot;

public abstract class AbstractProtoclManager implements RobotEvent {

    protected  Robot robot;

    @Override
    public void sendSignal(char event) {
        switch (event){
            case RobotConstant.MOVE_FORWARD: moveForward(robot); break;
            case RobotConstant.MOVE_BACKWARD:
                moveBackward(robot);
                break;
            case RobotConstant.TURN_LEFT:
                turnToLeft(robot);
                break;
            case RobotConstant.TURN_RIGHT:
                turnToRight(robot);
                break;
        }
    }

    public abstract void moveForward(Robot robot);
    public abstract void moveBackward(Robot robot);
    public abstract void turnToLeft(Robot robot);
    public abstract void turnToRight(Robot robot);


}
