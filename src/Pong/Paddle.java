package Pong;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Paddle extends Block
{
   //instance variables
   private int speed;

   public Paddle()
   {
		super(10,10);
      speed =5;
   }


   //add the other Paddle constructors

public Paddle(int x, int y) {
            super(x, y);
            speed = 5;
        }
        
        
	public Paddle(int x, int y, int s) {
            super(x, y);
            speed = s;
        }
        
        public Paddle(int x, int y, int w, int h, int s) {
            super(x, y, w, h);
            speed = s;
        }
        
        
         public Paddle(int x, int y, int w, int h, Color col, int s) {
            super(x, y, w, h, col);
            speed = s;
         }




public void setSpeed (int a) {
    speed = a;
}



   public void moveUpAndDraw(Graphics window)
   {


   }

   public void moveDownAndDraw(Graphics window)
   {


   }

   
   public boolean equals( Paddle obj)
	{

		 return obj.getX() == this.getX()
			&& obj.getY() == this.getY()
			&& obj.getHeight() == this.getHeight() && obj.getWidth() == this.getWidth() && obj.getColor().equals(this.getColor()) && obj.getSpeed() == this.getSpeed();
	}   
   //add get methods
   
   

    /**
     * @return the speed
     */
    public int getSpeed() {
        return speed;
    }
    
    public String toString() {
        return super.toString() + " " + getSpeed();
    }
    
    
}