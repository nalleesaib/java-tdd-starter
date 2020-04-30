package mars.robot;

public class ProtocoleZX80 extends AbstractProtoclManager {

    @Override
    public void setRobot(Robot robot) {
        this.robot = robot;
    }

    @Override
    public Robot getRobot() {
        return robot;
    }

    @Override
    public void turnToRight(Robot robot) {
        switch (robot.getDirection()){
            case RobotConstant.NORTH: robot.setDirection(RobotConstant.EAST); break;
            case RobotConstant.EAST: robot.setDirection(RobotConstant.SOUTH); break;
            case RobotConstant.SOUTH: robot.setDirection(RobotConstant.WEST); break;
            case RobotConstant.WEST: robot.setDirection(RobotConstant.NORTH); break;
        }
    }

    @Override
    public void turnToLeft(Robot robot) {
        switch (robot.getDirection()){
            case RobotConstant.NORTH: robot.setDirection(RobotConstant.WEST); break;
            case RobotConstant.EAST: robot.setDirection(RobotConstant.NORTH); break;
            case RobotConstant.SOUTH: robot.setDirection(RobotConstant.EAST); break;
            case RobotConstant.WEST: robot.setDirection(RobotConstant.SOUTH); break;
        }
    }

    @Override
    public void moveBackward(Robot robot) {
        if(robot.getDirection() == RobotConstant.NORTH) {
            robot.setY(robot.getY() - 1);
        }
        if(robot.getDirection() == RobotConstant.SOUTH) {
            robot.setY(robot.getY() + 1);
        }
        if(robot.getDirection() == RobotConstant.EAST) {
            robot.setX(robot.getX() - 1);
        }
        if(robot.getDirection() == RobotConstant.WEST) {
            robot.setX(robot.getX() + 1);
        }
    }

    @Override
    public void moveForward(Robot robot){
        if(robot.getDirection() == RobotConstant.NORTH) {
            if(robot.getY() == 10){
                robot.setY(-10);
            }else{
                robot.setY(robot.getY() + 1);
            }
        }
        if(robot.getDirection() == RobotConstant.SOUTH) {
            if(robot.getY() == -10){
                robot.setY(10);
            }else{
                robot.setY(robot.getY() - 1);
            }
        }
        if(robot.getDirection() == RobotConstant.EAST) {
            if(robot.getX() == 10){
                robot.setX(-10);
            }else{
                robot.setX(robot.getX() + 1);
            }
        }
        if(robot.getDirection() == RobotConstant.WEST) {
            if(robot.getX() == -10){
                robot.setX(10);
            }else{
                robot.setX(robot.getX() - 1);
            }
        }
    }




}
