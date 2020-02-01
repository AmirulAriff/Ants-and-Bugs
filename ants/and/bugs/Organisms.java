
package ants.and.bugs;

public abstract class Organisms {
    
    private int posX, posY;
    
   public int GetPosX(){
       return posX;
   }
   
   public int GetPosY(){
       return posY;
   }
   
   public int SetPosX(int posX){
       return this.posX = posX;
   }
   
   public int SetPostY(int posY){
       return this.posY = posY;
   }
   
   public void breed(){
       
   }
   
   public abstract void move();
    
}
