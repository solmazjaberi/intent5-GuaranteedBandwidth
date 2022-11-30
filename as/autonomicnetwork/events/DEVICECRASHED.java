package generatedbyassl.as.autonomicnetwork.events;

import java.io.Serializable;
import generatedbyassl.as.ASSLEVENT;

/**
 * Generated by ASSL Framework
 * 
 * This is the Java class generated for 'DeviceCrashed' (specified as EVENT ASSL tier).
 */
public class DEVICECRASHED
	extends ASSLEVENT
	implements  Serializable
{

	/**
	 * Generated by ASSL Framework
	 * 
	 * This is a reference to the unique instance of 'DEVICECRASHED' class.
	 */
	static private DEVICECRASHED oInstance = null;
	/**
	 * Generated by ASSL Framework
	 * 
	 * Needed by the class because it implements the Serializable interface.
	 */
	static final long serialVersionUID = 0001L;

	/**
	 * Generated by ASSL Framework
	 * 
	 * Because this is a singleton class its constructor is private.
	 */
	private  DEVICECRASHED (  )
	{
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * This method returns the unique instance of 'DEVICECRASHED' class.
	 */
	static public DEVICECRASHED getInstance (  )
	{
		if ( null == oInstance ) 
		{
			oInstance = new DEVICECRASHED();
		}
		return oInstance;
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * Initialises the event after the system has been started.
	 */
	public synchronized void postStartInit (  )
	{
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * This method checks the event's prompting conditions and if satisfied triggers the event.
	 */
	protected void checkEventConditions (  )
	{
	}

}