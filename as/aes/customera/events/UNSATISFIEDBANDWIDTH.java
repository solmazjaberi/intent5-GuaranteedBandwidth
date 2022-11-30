package generatedbyassl.as.aes.customera.events;

import java.io.Serializable;
import generatedbyassl.as.ASSLEVENT;

/**
 * Generated by ASSL Framework
 * 
 * This is the Java class generated for 'UnsatisfiedBandwidth' (specified as EVENT ASSL tier).
 */
public class UNSATISFIEDBANDWIDTH
	extends ASSLEVENT
	implements  Serializable
{

	/**
	 * Generated by ASSL Framework
	 * 
	 * This is a reference to the unique instance of 'UNSATISFIEDBANDWIDTH' class.
	 */
	static private UNSATISFIEDBANDWIDTH oInstance = null;
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
	private  UNSATISFIEDBANDWIDTH (  )
	{
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * This method returns the unique instance of 'UNSATISFIEDBANDWIDTH' class.
	 */
	static public UNSATISFIEDBANDWIDTH getInstance (  )
	{
		if ( null == oInstance ) 
		{
			oInstance = new UNSATISFIEDBANDWIDTH();
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
		//**** triggers the event if the event conditions are satisfied
		if (  generatedbyassl.as.aes.customera.metrics.BANDWIDTHA.getInstance().isChanged()  ) 
		{
			triggerEvent();
		}
		vOccurredEvents.clear();
		vReceivedMessages.clear();
		vSentMessages.clear();
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * Provides conditions to be fulfilled before processing the event.
	 */
	public boolean GUARDS (  )
	{
		boolean bResult = true;
		bResult =  !  generatedbyassl.as.aes.customera.metrics.BANDWIDTHA.getInstance().isValid()  ;
		return bResult;
	}

}