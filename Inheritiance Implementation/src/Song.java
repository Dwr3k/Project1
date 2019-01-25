
public class Song extends DigitalMedia
{
	private String artist;
	private String album;
	
	public Song(String heck, long hecks)
	{
		super(heck, hecks);
	}
	
	public Song(String heck, long hecks, String nani, String what)
	{
		super(heck, hecks);
		artist = nani;
		album = what;
	}
	
	public String getTitle()
	{
		return name;
	}
	
	public String getArtist()
	{
		return artist;
	}
	
	public String getAlbum()
	{
		return album;
	}
	
	public void setTitle()
	{
		
	}
	
	public void setArtist(String heck)
	{
		artist = heck;
	}
	
	public void setAlbum(String heck)
	{
		album = heck;
	}
	
	public boolean equals(Object heck)
	{
		return false;
	}
	
	public String toString()
	{
		return null;
	}
}
