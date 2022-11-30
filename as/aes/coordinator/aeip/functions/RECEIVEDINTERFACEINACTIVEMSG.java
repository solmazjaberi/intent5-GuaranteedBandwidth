package generatedbyassl.as.aes.coordinator.aeip.functions;

import java.io.Serializable;
import generatedbyassl.as.ASSLFUNCTION;

/**
 * Generated by ASSL Framework
 * 
 * This is the Java class generated for 'ReceivedInterfaceInActiveMsg' (specified as FUNCTION ASSL tier).
 */
public class RECEIVEDINTERFACEINACTIVEMSG
	extends ASSLFUNCTION
	implements  Serializable
{

	/**
	 * Generated by ASSL Framework
	 * 
	 * This is a reference to the unique instance of 'RECEIVEDINTERFACEINACTIVEMSG' class.
	 */
	static private RECEIVEDINTERFACEINACTIVEMSG oInstance = null;
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
	private  RECEIVEDINTERFACEINACTIVEMSG (  )
	{
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * This method returns the unique instance of 'RECEIVEDINTERFACEINACTIVEMSG' class.
	 */
	static public RECEIVEDINTERFACEINACTIVEMSG getInstance (  )
	{
		if ( null == oInstance ) 
		{
			oInstance = new RECEIVEDINTERFACEINACTIVEMSG();
		}
		return oInstance;
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * Embeds statements to be performed by the function.
	 */
	public void DOES (  )
	{
		super.DOES();
		generatedbyassl.as.aes.customera.aeip.channels.PRIVATE_LINK.getInstance().getMessage("generatedbyassl.as.aes.customera.aeip.messages.INTERFACEINACTIVEMSG");
	}

}