package generatedbyassl.as.aes.coordinator.aeself_management.self_healing;

import java.io.Serializable;
import generatedbyassl.as.*;

/**
 * Generated by ASSL Framework
 * 
 * This is the Java class generated for 'InUnsatisfiedBandwidth' (specified as FLUENT ASSL tier).
 */
public class INUNSATISFIEDBANDWIDTH
	extends ASSLFLUENT
	implements  Serializable
{

	/**
	 * Generated by ASSL Framework
	 * 
	 * This is a reference to the unique instance of 'INUNSATISFIEDBANDWIDTH' class.
	 */
	static private INUNSATISFIEDBANDWIDTH oInstance = null;
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
	private  INUNSATISFIEDBANDWIDTH (  )
	{
		vInitiatedByEvents.add( generatedbyassl.as.aes.coordinator.events.UNSATISFIEDBANDWIDTH.getInstance() );
		generatedbyassl.as.aes.coordinator.events.UNSATISFIEDBANDWIDTH.getInstance().addEventCatcher(this); //**** fluent registers for that event
		vTerminatedByEvents.add( generatedbyassl.as.aes.coordinator.events.DEVICECHECKED.getInstance() );
		generatedbyassl.as.aes.coordinator.events.DEVICECHECKED.getInstance().addEventCatcher(this); //**** fluent registers for that event
		vTerminatedByEvents.add( generatedbyassl.as.autonomicnetwork.events.DEVICECRASHED.getInstance() );
		generatedbyassl.as.autonomicnetwork.events.DEVICECRASHED.getInstance().addEventCatcher(this); //**** fluent registers for that event
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * This method returns the unique instance of 'INUNSATISFIEDBANDWIDTH' class.
	 */
	static public INUNSATISFIEDBANDWIDTH getInstance (  )
	{
		if ( null == oInstance ) 
		{
			oInstance = new INUNSATISFIEDBANDWIDTH();
		}
		return oInstance;
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * This method calls all the fluent-mapped actions in sequence.
	 */
	protected synchronized void callFluentActions (  )
	{
	}

}