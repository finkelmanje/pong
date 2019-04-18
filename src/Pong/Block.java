package Pong;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Block implements Locatable
{
	private int xPos;
	private int yPos;
	private int width;
	private int height;

	private Color color;

	public Block()
	{
               xPos = 100;
            yPos = 150;
           width = 10;
            height = 10;
            color = Color.BLACK;

	}

	//add other Block constructors - x , y , width, height, color
        
        public Block(int ex, int why, int wid, int hei, Color col) {
            xPos = ex;
            yPos = why;
           width = wid;
            height = hei;
            color = col;
        }
        
         public Block(int ex, int why, int wid, int hei) {
            xPos = ex;
            yPos = why;
           width = wid;
            height = hei;
            color = Color.BLACK;
     
        }
         
         
	 public Block(int ex, int why) {
            xPos = ex;
            yPos = why;
            width = 10;
            height = 10;
            color = Color.BLACK;
 
     
        }
         
	
	
	
	
	
	
	
	
	
	
	
	
   //add the other set methods
   

   public void setColor(Color col)
   {
color = col;

   }
   
     public void setX(int x)
   {
xPos = x;

   }
     
      public void setY(int y)
   {
yPos = y;

   }
      
      public void setWidth(int y)
   {
width = y;

   }
      public void setHeight(int y)
   {
height = y;

   }
      
      public void setPos(int x, int y) {
          xPos = x;
          yPos = y;
      }
      
     /**
     * @return the xPos
     */
    public int getX() {
        return xPos;
    }

    /**
     * @return the yPos
     */
    public int getY() {
        return yPos;
    }

    /**
     * @return the width
     */
    public int getWidth() {
        return width;
    }

    /**
     * @return the height
     */
    public int getHeight() {
        return height;
    }

    /**
     * @return the color
     */
    public Color getColor() {
        return color;
    }
      
      

   public void draw(Graphics window)
   {
   	//uncomment after you write the set and get methods
      window.setColor(color);
      window.fillRect(getX(), getY(), getWidth(), getHeight());
   }

   public void draw(Graphics window, Color col)
   {
 window.setColor(color);
      window.fillRect(getX(), getY(), getWidth(), getHeight());

   }
   
	public boolean equals(Block obj)
	{

		 return obj.getX() == this.getX()
			&& obj.getY() == this.getY()
			&& obj.getHeight() == this.getHeight() && obj.getWidth() == this.getWidth() && obj.getColor().equals(this.getColor());
	}
	  

    

   //add a toString() method  - x , y , width, height, color
        
        public String toString() {
            return getX() + " " + getY() + " " + getWidth() + " " + getHeight() + " " + getColor(); 
        }
}

    
