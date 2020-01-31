public class ReporterFactory
{
	Reporter r;
	
	public Reporter getReporter(int i)
	{
		if (i ==1)
		   return r = new StandardReporter();
		else
		   return r = new GUIReporter();
	}
}