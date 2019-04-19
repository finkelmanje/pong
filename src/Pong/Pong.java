package Pong;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;

public class Pong extends Canvas implements KeyListener, Runnable
{
	private Ball ball;
	private Paddle leftPaddle;
	private Paddle rightPaddle;
	private boolean[] keys;
	private BufferedImage back;
        private int rightScore = 0;
        private int leftScore = 0;


	public Pong()
	{
		//set up all variables related to the game




		keys = new boolean[4];

    
    	setBackground(Color.WHITE);
		setVisible(true);
		
		new Thread(this).start();
		addKeyListener(this);		//starts the key thread to log key strokes
	}
	
   public void update(Graphics window){
	   paint(window);
   }

   public void paint(Graphics window)
   {
		//set up the double buffering to make the game animation nice and smooth
		Graphics2D twoDGraph = (Graphics2D)window;

		//take a snap shop of the current screen and same it as an image
		//that is the exact same width and height as the current screen
		if(back==null)
		   back = (BufferedImage)(createImage(getWidth(),getHeight()));

		//create a graphics reference to the back ground image
		//we will draw all changes on the background image
		Graphics graphToBack = back.createGraphics();


		ball.moveAndDraw(graphToBack);
		leftPaddle.draw(graphToBack);
		rightPaddle.draw(graphToBack);


		//see if ball hits left wall or right wall
		if(!(ball.getX()>=10 && ball.getX()<=780))
		{
			ball.setxSpeed(0);
                        ball.setySpeed(0);
		}
                
                if(ball.getX() <= 400) {
                    rightScore++;
                }
                 
                if (ball.getX() >= 720) {
                    leftScore++;
                }
                
                try {
       Thread.currentThread().sleep(950);
   } catch(Exception e) {
           
           }
                ball.draw(graphToBack, Color.WHITE);
                ball.setX((int) (Math.random() * 50) + 400);
                ball.setY((int) (Math.random() * 50) + 300);
                int whoot = (int) (Math.random() * 2);
                if (whoot == 0) {
                    ball.setxSpeed(2);
                    ball.setySpeed(1);
                }
                else {
                    ball.setxSpeed(-2);
                    ball.setySpeed(1);
                }
                
                graphToBack.setColor(Color.WHITE);
                graphToBack.fillRect(440, 520, 80,80);
                
                graphToBack.setColor(Color.red);
                
                 graphToBack.drawString("rightScore = " + rightScore, 400, 540);
                 graphToBack.drawString("leftScore = " + leftScore, 400, 560);
                 
                
   

		
		//see if the ball hits the top or bottom wall 

if (!(ball.getY() >= 20 && ball.getY() <= 450)) {
    ball.setySpeed(-ball.getySpeed());
}

if ( (ball.didCollideLeft(leftPaddle)) && ball.didCollideTop(leftPaddle) || ball.didCollideBottom(leftPaddle) ) {
       
   }




		//see if the ball hits the left paddle
		
		
		
		//see if the ball hits the right paddle
		
		
		


		//see if the paddles need to be moved















		
		twoDGraph.drawImage(back, null, 0, 0);
	}

	public void keyPressed(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=true; break;
			case 'S' : keys[1]=true; break;
			case 'I' : keys[2]=true; break;
			case 'K' : keys[3]=true; break;
		}
	}

	public void keyReleased(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=false; break;
			case 'S' : keys[1]=false; break;
			case 'I' : keys[2]=false; break;
			case 'K' : keys[3]=false; break;
		}
	}

	public void keyTyped(KeyEvent e){}
	
   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(8);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}	
}