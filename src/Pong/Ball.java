package Pong;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block
{
	private int xSpeed;
	private int ySpeed;

	public Ball()
	{
		super(200,200);
		xSpeed = 3;
		ySpeed = 1;
	}

	//add the other Ball constructors
	
	public Ball(int x, int y) {
            super(x, y);
            xSpeed = 3;
            ySpeed = 1;
        }
        
        
	public Ball(int x, int y, int w, int h) {
            super(x, y, w, h);
            xSpeed = 3;
            ySpeed = 1;
        }
        
        public Ball(int x, int y, int w, int h, Color col) {
            super(x, y, w, h, col);
            xSpeed = 3;
            ySpeed = 1;
        }
        
        
         public Ball(int x, int y, int w, int h, Color col, int xs, int ys) {
            super(x, y, w, h, col);
            xSpeed = xs;
            ySpeed = ys;
        }
	
	
	
	
	
	
	
	
	
	
	   
   //add the set methods
          /**
     * @return the xSpeed
     */
    public int getxSpeed() {
        return xSpeed;
    }

    /**
     * @param xSpeed the xSpeed to set
     */
    public void setxSpeed(int xSpeed) {
        this.xSpeed = xSpeed;
    }

    /**
     * @return the ySpeed
     */
    public int getySpeed() {
        return ySpeed;
    }

    /**
     * @param ySpeed the ySpeed to set
     */
    public void setySpeed(int ySpeed) {
        this.ySpeed = ySpeed;
    }
         
         
   @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

   public void moveAndDraw(Graphics window)
   {
   	//draw a white ball at old ball location
      window.setColor(Color.white);
      window.fillRect(super.getX(),super.getY(),super.getWidth(),super.getHeight());

      setX(getX()+getxSpeed());
		//setY
      setY(getY() + getySpeed());

		//draw the ball at its new location
       window.setColor(super.getColor());
       window.fillRect(super.getX(),super.getY(),super.getWidth(),super.getHeight());
      
   }
   
	public boolean equals( Ball obj)
	{

		 return obj.getX() == this.getX()
			&& obj.getY() == this.getY()
			&& obj.getHeight() == this.getHeight() && obj.getWidth() == this.getWidth() && obj.getColor().equals(this.getColor()) && obj.getxSpeed() == this.getxSpeed() && obj.getySpeed() == this.getySpeed();
	}   
        
        public boolean didCollideLeft(Object obj){
		Block xd = (Block)obj;
		if (getX() > xd.getX() && getX() <= xd.getX()+xd.getWidth() && (getY() >= xd.getY() && getY()+getHeight() <= xd.getY()+xd.getHeight())){
			return true;
		}
		return false;
	}
	public boolean didCollideRight(Object obj){
		Block xd = (Block)obj;
		if (getX()<xd.getX() && getX()+getWidth()>=xd.getX() && (getY() >= xd.getY() && getY()+getHeight() <= xd.getY()+xd.getHeight())){
			return true;
		}
		return false;
	}
	public boolean didCollideTop(Object obj){
		Block xd = (Block)obj;
		if (getY()+getHeight() >= xd.getY() && getY() < xd.getY()+xd.getHeight() && (getX()>=xd.getX() && getX()+getWidth()<=xd.getX()+xd.getWidth())){
			return true;
		}
		return false;
	}
	public boolean didCollideBottom(Object obj){
		Block xd = (Block)obj;
		if (getY() <= xd.getY()+xd.getHeight() && getY()+getHeight() > xd.getY() && (getX()>=xd.getX() && getX()+getWidth()<=xd.getX()+xd.getWidth())){
			return true;
		}
		return false;
	}

   //add a toString() method

        public String toString() {
            return super.toString() + " " + getxSpeed() + " " + getySpeed();
        }
   
}