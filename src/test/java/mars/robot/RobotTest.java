package mars.robot;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class RobotTest {

    @Test
    void shouldReturn00NWhenInitialiseTo00N(){
        Robot robot = new Robot();

        robot.initialize(0,0,'N');
        assertThat(robot.x).isEqualTo(0);
        assertThat(robot.y).isEqualTo(0);
        assertThat(robot.direction).isEqualTo('N');
    }

    @Test
    void shouldGoForward(){
        Robot robot = new Robot();

        robot.initialize(0,0,'N');
        robot.move('F');

        assertThat(robot.x).isEqualTo(0);
        assertThat(robot.y).isEqualTo(1);
        assertThat(robot.direction).isEqualTo('N');
    }

    @Test
    void shouldRotateToRight(){
        Robot robot = new Robot();

        robot.initialize(0,0,'N');
        robot.move('R');

        assertThat(robot.x).isEqualTo(0);
        assertThat(robot.y).isEqualTo(0);
        assertThat(robot.direction).isEqualTo('E');
    }

    @Test
    void shouldGoBack(){
        Robot robot = new Robot();

        robot.initialize(3,3,'N');
        robot.move('B');

        assertThat(robot.x).isEqualTo(3);
        assertThat(robot.y).isEqualTo(2);
        assertThat(robot.direction).isEqualTo('N');
    }

    @Test
    void shouldMoveBackwardRotateRightAndMoveForwardTwice(){
        Robot robot = new Robot();

        robot.initialize(-5,8,'N');
        robot.move('B');
        robot.move('R');
        robot.move('F');
        robot.move('F');

        assertThat(robot.x).isEqualTo(-3);
        assertThat(robot.y).isEqualTo(7);
        assertThat(robot.direction).isEqualTo('E');
    }
}