package generatedbyassl.as.aes.customera.actions;

import java.io.Serializable;
import generatedbyassl.as.ASSLACTION;

/**
 * Generated by ASSL Framework
 * 
 * This is the Java class generated for 'NotifyForInActiveInterface' (specified as ACTION ASSL tier).
 */
public class NOTIFYFORINACTIVEINTERFACE
	extends ASSLACTION
	implements  Serializable
{

	/**
	 * Generated by ASSL Framework
	 * 
	 * This is a reference to the unique instance of 'NOTIFYFORINACTIVEINTERFACE' class.
	 */
	static private NOTIFYFORINACTIVEINTERFACE oInstance = null;
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
	private  NOTIFYFORINACTIVEINTERFACE (  )
	{
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * This method returns the unique instance of 'NOTIFYFORINACTIVEINTERFACE' class.
	 */
	static public NOTIFYFORINACTIVEINTERFACE getInstance (  )
	{
		if ( null == oInstance ) 
		{
			oInstance = new NOTIFYFORINACTIVEINTERFACE();
		}
		return oInstance;
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * Provides conditions to be fulfilled before processing the action.
	 */
	public boolean GUARDS (  )
	{
		boolean bResult = true;
		bResult =  generatedbyassl.as.aes.customera.aeself_management.self_healing.ININTERFACEINACTIVE.getInstance().isFluentInitiated()  ;
		return bResult;
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * Embeds statements to be performed by the action if the GURADS conditions are fulfilled.
	 */
	public void DOES (  )
	{
		super.DOES();
		generatedbyassl.as.aes.customera.aeip.functions.SENDINTERFACEINACTIVEMSG.getInstance().perform(  );
	}

}