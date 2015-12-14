package robot.controller;

import lejos.hardware.lcd.LCD;
import lejos.utility.Delay;

import robot.model.EV3Bot;

/**
 * 
 * @author ftha4681
 * @version 0.x Dec 10, 2015
 */

public class BotController 
{
	private String message;
	private int xPosition;
	private int yPosition;
	
	private long waitTime;
	
	private EV3Bot forBot;
	
	public BotController()
	{
		this.message = "Programming Lego robots with Java";
		this.xPosition = 10;
		this.yPosition = 10;
		this.waitTime = 4000;
		
		forBot = new EV3Bot();
	}
	
	public void start()
	{
		LCD.drawString(botMessage, xPosition, yPosition);
		Delay.msDelay(waitTime);
	}
	
		forBot.driveRoom();
	
}
