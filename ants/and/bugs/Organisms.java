
package ants.and.bugs;

public abstract class Organisms {
    
    public static final int DIRECTION_UP = 0;
    public static final int DIRECTION_LEFT = 1;
    public static final int DIRECTION_RIGHT = 2;
    public static final int DIRECTION_DOWN = 3;
    
    
    private int posX=0, posY=0;
    
   public int GetPosX(){
       return posX;
   }
   
   public int GetPosY(){
       return posY;
   }
   
   public int SetPosX(int posX){
       return this.posX = posX;
   }
   
   public int SetPosY(int posY){
       return this.posY = posY;
   }
   
   public void breed(){
       
   }
   
   public abstract void move();
    
}
