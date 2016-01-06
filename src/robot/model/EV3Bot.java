package robot.model;

public class EV3Bot 
{
	private String botMessage;
	private int xPosition;
	private int yPosition;
	private long waitTime;
	
	public EV3Bot()
	{
		this.botMessage = "Forrest codes forBot";
		this.xPosition = 50;
		this.yPosition = 50;
		this.waitTime = 4000;
		
		displayMessage();
	}
	
	public void driveRoom()
	{
		//call private helper method here
	}
	
	private void displayMessage()
	{
	//write your first drive method here
	//call the displayMessage("describe action as a string") in the helper method
	}
	
	//overload the displayMessage method with a single String parameter
	
	private void driveForward (double distance)

	{
		
	}
	
	private void turnRight(double degree)
	{
		
	}
	
	private void turnLeft(double degree)

	{
		
	}
	
	private void displayMessage1()
	{
		LCD.drawString(botMessage, xPosition, yPosition);
		{
		Delay.msDelay(waitTime);
		}
	//helper methods
	private boolean sendObject()
	{
		boolean senses = false;
	//if statement that detects distance
		if (true)
		{
			return senses;
		}
	private int meterToInches(double meters)
	{
		double inches =(meters / 3.2808)/12;
		return (int)inches;
	}
	
	private void driveForward(boolean) canDrive)
	{
		if(canDrive)
			//where all the movement code goes
	}
	
}
