package mars.robot;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ProtocoleZX81Test {
    private RobotEvent robotEvent;

    @BeforeEach
    public void setup(){
        robotEvent = new ProtocoleZX81();
    }

    @Test
    @Disabled
    void shouldGoForwardFromNorth(){
        Robot robot = new Robot(robotEvent,0,0,'N');

        robot.receiveSignal('X');

        assertThat(robot.getX()).isEqualTo(0);
        assertThat(robot.getY()).isEqualTo(15);
        assertThat(robot.getDirection()).isEqualTo('N');
    }

    @Test
    @Disabled
    void shouldGoForwardFromSouth(){
        Robot robot = new Robot(0,0,'S');
        
       robot.receiveSignal('F');

        assertThat(robot.getX()).isEqualTo(0);
        assertThat(robot.getY()).isEqualTo(-1);
        assertThat(robot.getDirection()).isEqualTo('S');
    }

    @Test
    @Disabled
    void shouldGoForwardFromEast(){
        Robot robot = new Robot(0,1,'E');

        robot.receiveSignal('F');

        assertThat(robot.getX()).isEqualTo(1);
        assertThat(robot.getY()).isEqualTo(1);
        assertThat(robot.getDirection()).isEqualTo('E');
    }

    @Test
    @Disabled
    void shouldGoBackWardFromNorth(){
        Robot robot = new Robot(0,0,'N');

        robot.receiveSignal('B');

        assertThat(robot.getX()).isEqualTo(0);
        assertThat(robot.getY()).isEqualTo(-1);
        assertThat(robot.getDirection()).isEqualTo('N');
    }

    @Test
    @Disabled
    void shouldGoBackWardFromEast(){
        Robot robot = new Robot(0,0,'E');

        robot.receiveSignal('B');

        assertThat(robot.getX()).isEqualTo(-1);
        assertThat(robot.getY()).isEqualTo(0);
        assertThat(robot.getDirection()).isEqualTo('E');
    }


    @Test
    @Disabled
    void shouldRotateToRight(){
        Robot robot = new Robot(0,0,'N');

        robot.receiveSignal('R');

        assertThat(robot.getX()).isEqualTo(0);
        assertThat(robot.getY()).isEqualTo(0);
        assertThat(robot.getDirection()).isEqualTo('E');
    }

    @Test
    @Disabled
    void shouldRotateTwiceFromNorth(){
        Robot robot = new Robot(0,0,'N');


       robot.receiveSignal('R');
       robot.receiveSignal('R');

        assertThat(robot.getX()).isEqualTo(0);
        assertThat(robot.getY()).isEqualTo(0);
        assertThat(robot.getDirection()).isEqualTo('S');
    }

    @Test
    @Disabled
    void shouldRotateToRightForthFromNorth(){
        Robot robot = new Robot(0,0,'N');

       robot.receiveSignal('R');
       robot.receiveSignal('R');
       robot.receiveSignal('R');
       robot.receiveSignal('R');


        assertThat(robot.getX()).isEqualTo(0);
        assertThat(robot.getY()).isEqualTo(0);
        assertThat(robot.getDirection()).isEqualTo('N');
    }

    @Test
    @Disabled
    void shouldRotateToLeftForthFromNorth(){
        Robot robot = new Robot(0,0,'N');


       robot.receiveSignal('L');
       robot.receiveSignal('L');
       robot.receiveSignal('L');


        assertThat(robot.getX()).isEqualTo(0);
        assertThat(robot.getY()).isEqualTo(0);
        assertThat(robot.getDirection()).isEqualTo('E');
    }

    @Test
    @Disabled
    void shouldGoBack(){
        Robot robot = new Robot(3,3,'N');


       robot.receiveSignal('B');

        assertThat(robot.getX()).isEqualTo(3);
        assertThat(robot.getY()).isEqualTo(2);
        assertThat(robot.getDirection()).isEqualTo('N');
    }

    @Test
    @Disabled
    void shouldMoveBackwardRotateRightAndMoveForwardTwice(){
        Robot robot = new Robot(-5,8,'N');


       robot.receiveSignal('B');
       robot.receiveSignal('R');
       robot.receiveSignal('F');
       robot.receiveSignal('F');

        assertThat(robot.getX()).isEqualTo(-3);
        assertThat(robot.getY()).isEqualTo(7);
        assertThat(robot.getDirection()).isEqualTo('E');
    }

    @Test
    @Disabled
    void shouldGoForwardFromNorthWhenYIs10(){
        Robot robot = new Robot(0,10,'N');


       robot.receiveSignal('F');

        assertThat(robot.getX()).isEqualTo(0);
        assertThat(robot.getY()).isEqualTo(-10);
        assertThat(robot.getDirection()).isEqualTo('N');
    }

    @Test
    @Disabled
    void shouldGoForwardFromSouthWhenYIs10(){
        Robot robot = new Robot(0,-10,'S');


       robot.receiveSignal('F');

        assertThat(robot.getX()).isEqualTo(0);
        assertThat(robot.getY()).isEqualTo(10);
        assertThat(robot.getDirection()).isEqualTo('S');
    }

    @Test
    @Disabled
    void shouldGoForwardFromEastWhenXIs10(){
        Robot robot = new Robot(10,0,'E');


       robot.receiveSignal('F');

        assertThat(robot.getX()).isEqualTo(-10);
        assertThat(robot.getY()).isEqualTo(0);
        assertThat(robot.getDirection()).isEqualTo('E');
    }





}