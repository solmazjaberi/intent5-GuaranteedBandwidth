package generatedbyassl.as.aes.customera.aeip.channels;

import java.io.Serializable;
import generatedbyassl.as.ASSLCHANNEL;

/**
 * Generated by ASSL Framework
 * 
 * This is the Java class generated for 'Private_Link' (specified as CHANNEL ASSL tier).
 */
public class PRIVATE_LINK
	extends ASSLCHANNEL
	implements  Serializable
{

	/**
	 * Generated by ASSL Framework
	 * 
	 * This is a reference to the unique instance of 'PRIVATE_LINK' class.
	 */
	static private PRIVATE_LINK oInstance = null;
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
	private  PRIVATE_LINK (  )
	{
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * This method returns the unique instance of 'PRIVATE_LINK' class.
	 */
	static public PRIVATE_LINK getInstance (  )
	{
		if ( null == oInstance ) 
		{
			oInstance = new PRIVATE_LINK();
		}
		return oInstance;
	}

}