/*
 * The purpose of this class is to model a television
 * Rowan Barr
 * 2/19/2020
 */
public class Television {
	
	private static String manufacturer; //brand name of the TV
	private static int screenSize; //size of the TV screen
	private boolean powerOn; //whether the TV is on (true) or off (false)
	private int channel; //what station the TV is showing
	private int volume; //the volume of the TV, 0 being mute
	
	//this constructor initializes a Television with two user provided fields
	public Television(String a, int b) 
	{
		manufacturer = a;
		screenSize = b;
		powerOn= false;
		volume = 20;
		channel = 2;
	}
	
	/**
	 * Gets the name of the manufacturer
	 * @return manufacturer
	 */
	public String getManufacturer()
	{
		return manufacturer;
	}
	
	/**
	 * Gets the size of the television
	 * @return screenSize
	 */
	public int getScreenSize()
	{
		return screenSize;
	}
	
	/**
	 * Gets the channel the television's currently on
	 * @return channel
	 */
	public int getChannel()
	{
		return channel;
	}
	
	/**
	 * Gets the volume of the television
	 * @return volume
	 */
	public int getVolume()
	{
		return volume;
	}
	
	/**
	 * Sets the channel the television should be on
	 * @param channel the channel the TV's on
	 */
	public void setChannel(int a)
	{
		channel = a;
	}
	
	/**
	 * Changes the power of the TV from off to on 
	 * or on to off
	 */
	
	public void power()
	{
		powerOn = !powerOn;
	}
	/**
	 * increments the volume by one
	 */
	public void increaseVolume()
	{
		volume++;
	}
	/**
	 * decrements the volume by one
	 */
	public void decreaseVolume()
	{
		volume--;
	}
}
