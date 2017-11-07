
public class Coche
{
	private String color	= "azul";
	private String brand	= "seat";
	private int speed		= 100;
	private String type		= "monovolumen";
	
	// --------------------------------------------------

	public Coche ()
	{
	}
	
	public Coche (String theColor)
	{
		if (theColor != "") this.setColor(theColor);
	}

	public Coche (String theColor, String theBrand, String theType, int theSpeed)
	{
		if (theColor != "") this.setColor(theColor);
		if (theBrand != "") this.setBrand(theBrand);
		if (theType != "")  this.setType(theType);
		if (theSpeed != 0)  this.setSpeed(theSpeed);
	}
	
	// --------------------------------------------------

	public String getBrand()
	{
		return this.brand;
	}

	public void setBrand(String theBrand)
	{
		this.brand = theBrand;
	}

	public int getSpeed()
	{
		return this.speed;
	}

	public void setSpeed(int theSpeed)
	{
		this.speed = theSpeed;
	}

	public String getType()
	{
		return this.type;
	}

	public void setType(String theType)
	{
		this.type = theType;
	}

	public String getColor()
	{
		return this.color;
	}

	public void setColor(String theColor)
	{
		this.color = theColor == "azul" || theColor == "verde" || theColor == "rojo" ? theColor : "error";
	}
	
	// --------------------------------------------------

	public void Dispose()
	{
		System.out.println(this.color + "destruido");
	}
	
}
