class ResizableCircle extends Circle implements Resizable
{
	// Constructer
	ResizableCircle (double r)
	{
		super(r);
	}
    // resize the Radius to small or Big
	public double resize (int p)
	{
		return ((radius*(10+p))/10);
	}
}