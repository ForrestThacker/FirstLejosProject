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
}
