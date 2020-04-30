package mars.robot;

public class Robot {

    public int x;
    public int y;
    public char direction;

    public void initialize(int x, int y, char orientation) {
        direction = orientation;
        this.x = x ;
        this.y = y;
    }

    public void move(char f) {
      if(f=='F'){
          this.y+=1;
      }else if(f=='B'){
          this.y-=1;
      }else if(f=='R'){
          this.direction='E';
      }
    }
}
