
public class Image extends DigitalMedia
{
	private int width;
	private int height;
	
	public Image(String heck, int hecks)
	{
		super(heck, hecks);
	}
	
	public Image(String heck, long hecker, int hecks, int heckers)
	{
		super(heck, hecker);
		width = hecks;
		height = heckers;
	}
	
	public int getWidth()
	{
		return width;
	}
	
	public int getHeight()
	{
		return height;
	}
	
	public void setWidth(int heck)
	{
		width = heck;
	}
	
	public void setHeight(int heck) 
	{
		height = heck;
	}
	
	public boolean equals(Object object)
	{
		return false;
	}
	
	public String toString()
	{
		return null;
	}
}
