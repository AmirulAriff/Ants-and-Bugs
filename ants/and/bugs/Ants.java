
package ants.and.bugs;

import java.util.Random;

public class Ants extends Organisms{
    Random myRand = new Random();
     
    @Override
    public void move() {
        
        for(int i=0; i<4; i++){
            
            int rand = myRand.nextInt(4);;

            if(rand==Direction.DIRECTION_DOWN){
                this.SetPosY(this.GetPosY()+1);
            }
            else if(rand==Direction.DIRECTION_UP){
                this.SetPosY(this.GetPosY()-1);
            }
            else if(rand==Direction.DIRECTION_LEFT){
                this.SetPosX(this.GetPosX()-1);
            }
            else if(rand==Direction.DIRECTION_RIGHT){
                this.SetPosX(this.GetPosX()+1);
            }
        }

    }
}
