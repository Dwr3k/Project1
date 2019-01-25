
public class DigitalMedia 
{
	private String name;
	private long size;
	
	public DigitalMedia()
	{
		
	}
	
	public DigitalMedia(String heck, long joke)
	{
		name = heck;
		size = joke;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public long getSize()
	{
		return size;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setSize(long size)
	{
		this.size = size;
	}
	
	public boolean equals(Object other)
	{
		return false;
	}
	
	public String toString()
	{
		String heck = "Name: " + name + "n/";
		return heck;
				
	}
	
}
