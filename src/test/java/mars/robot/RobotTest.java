package mars.robot;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RobotTest {

    @Test
    void shouldReturn00NWhenInitialiseTo00N(){
        Robot robot = new Robot();

        robot.initialize(0,0,'N');
        assertThat(robot.getX()).isEqualTo(0);
        assertThat(robot.getY()).isEqualTo(0);
        assertThat(robot.getDirection()).isEqualTo('N');
    }

    @Test
    void shouldGoForwardFromNorth(){
        Robot robot = new Robot();

        robot.initialize(0,0,'N');
        robot.sendSignal('F');

        assertThat(robot.getX()).isEqualTo(0);
        assertThat(robot.getY()).isEqualTo(1);
        assertThat(robot.getDirection()).isEqualTo('N');
    }

    @Test
    void shouldGoForwardFromSouth(){
        Robot robot = new Robot();

        robot.initialize(0,0,'S');
        robot.sendSignal('F');

        assertThat(robot.getX()).isEqualTo(0);
        assertThat(robot.getY()).isEqualTo(-1);
        assertThat(robot.getDirection()).isEqualTo('S');
    }

    @Test
    void shouldGoForwardFromEast(){
        Robot robot = new Robot();

        robot.initialize(0,1,'E');
        robot.sendSignal('F');

        assertThat(robot.getX()).isEqualTo(1);
        assertThat(robot.getY()).isEqualTo(1);
        assertThat(robot.getDirection()).isEqualTo('E');
    }

    @Test
    void shouldGoBackWardFromNorth(){
        Robot robot = new Robot();

        robot.initialize(0,0,'N');
        robot.sendSignal('B');

        assertThat(robot.getX()).isEqualTo(0);
        assertThat(robot.getY()).isEqualTo(-1);
        assertThat(robot.getDirection()).isEqualTo('N');
    }

    @Test
    void shouldGoBackWardFromEast(){
        Robot robot = new Robot();

        robot.initialize(0,0,'E');
        robot.sendSignal('B');

        assertThat(robot.getX()).isEqualTo(-1);
        assertThat(robot.getY()).isEqualTo(0);
        assertThat(robot.getDirection()).isEqualTo('E');
    }


    @Test
    void shouldRotateToRight(){
        Robot robot = new Robot();

        robot.initialize(0,0,'N');
        robot.sendSignal('R');

        assertThat(robot.getX()).isEqualTo(0);
        assertThat(robot.getY()).isEqualTo(0);
        assertThat(robot.getDirection()).isEqualTo('E');
    }

    @Test
    void shouldRotateTwiceFromNorth(){
        Robot robot = new Robot();

        robot.initialize(0,0,'N');
        robot.sendSignal('R');
        robot.sendSignal('R');


        assertThat(robot.getX()).isEqualTo(0);
        assertThat(robot.getY()).isEqualTo(0);
        assertThat(robot.getDirection()).isEqualTo('S');
    }

    @Test
    void shouldRotateToRightForthFromNorth(){
        Robot robot = new Robot();

        robot.initialize(0,0,'N');
        robot.sendSignal('R');
        robot.sendSignal('R');
        robot.sendSignal('R');
        robot.sendSignal('R');


        assertThat(robot.getX()).isEqualTo(0);
        assertThat(robot.getY()).isEqualTo(0);
        assertThat(robot.getDirection()).isEqualTo('N');
    }

    @Test
    void shouldRotateToLeftForthFromNorth(){
        Robot robot = new Robot();

        robot.initialize(0,0,'N');
        robot.sendSignal('L');
        robot.sendSignal('L');
        robot.sendSignal('L');


        assertThat(robot.getX()).isEqualTo(0);
        assertThat(robot.getY()).isEqualTo(0);
        assertThat(robot.getDirection()).isEqualTo('E');
    }

    @Test
    void shouldGoBack(){
        Robot robot = new Robot();

        robot.initialize(3,3,'N');
        robot.sendSignal('B');

        assertThat(robot.getX()).isEqualTo(3);
        assertThat(robot.getY()).isEqualTo(2);
        assertThat(robot.getDirection()).isEqualTo('N');
    }

    @Test
    void shouldMoveBackwardRotateRightAndMoveForwardTwice(){
        Robot robot = new Robot();

        robot.initialize(-5,8,'N');

        robot.sendSignal('B');
        robot.sendSignal('R');
        robot.sendSignal('F');
        robot.sendSignal('F');

        assertThat(robot.getX()).isEqualTo(-3);
        assertThat(robot.getY()).isEqualTo(7);
        assertThat(robot.getDirection()).isEqualTo('E');
    }

    @Test
    void shouldGoForwardFromNorthWhenYIs10(){
        Robot robot = new Robot();

        robot.initialize(0,10,'N');
        robot.sendSignal('F');

        assertThat(robot.getX()).isEqualTo(0);
        assertThat(robot.getY()).isEqualTo(-10);
        assertThat(robot.getDirection()).isEqualTo('N');
    }

    @Test
    void shouldGoForwardFromSouthWhenYIs10(){
        Robot robot = new Robot();

        robot.initialize(0,-10,'S');
        robot.sendSignal('F');

        assertThat(robot.getX()).isEqualTo(0);
        assertThat(robot.getY()).isEqualTo(10);
        assertThat(robot.getDirection()).isEqualTo('S');
    }

    @Test
    void shouldGoForwardFromEastWhenXIs10(){
        Robot robot = new Robot();

        robot.initialize(10,0,'E');
        robot.sendSignal('F');

        assertThat(robot.getX()).isEqualTo(-10);
        assertThat(robot.getY()).isEqualTo(0);
        assertThat(robot.getDirection()).isEqualTo('E');
    }





}