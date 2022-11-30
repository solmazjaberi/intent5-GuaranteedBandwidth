package generatedbyassl.as.aes;

import java.io.Serializable;
import generatedbyassl.as.ASSLAE;
import generatedbyassl.as.aes.customera.controlloop.*;

/**
 * Generated by ASSL Framework
 * 
 * This is the Java class generated for 'CustomerA' (specified as AE ASSL tier).
 */
public class CUSTOMERA
	extends ASSLAE
	implements  Serializable
{

	/**
	 * Generated by ASSL Framework
	 * 
	 * This is a reference to the unique instance of 'CUSTOMERA' class.
	 */
	static private CUSTOMERA oInstance = null;
	/**
	 * Generated by ASSL Framework
	 * 
	 * Needed by the class because it implements the Serializable interface.
	 */
	static final long serialVersionUID = 0001L;
	/**
	 * Generated by ASSL Framework
	 * 
	 * Holds a reference to the AE control loop's monitor.
	 */
	private CUSTOMERA_ASSLMONITOR oMonitor = new CUSTOMERA_ASSLMONITOR();
	/**
	 * Generated by ASSL Framework
	 * 
	 * Holds a reference to the AE control loop's analyzer.
	 */
	private CUSTOMERA_ASSLANALYZER oAnalyzer = new CUSTOMERA_ASSLANALYZER();
	/**
	 * Generated by ASSL Framework
	 * 
	 * Holds a reference to the AE control loop's simulator.
	 */
	private CUSTOMERA_ASSLSIMULATOR oSimulator = new CUSTOMERA_ASSLSIMULATOR();
	/**
	 * Generated by ASSL Framework
	 * 
	 * Holds a reference to the AE control loop's executor.
	 */
	private CUSTOMERA_ASSLEXECUTOR oExecutor = new CUSTOMERA_ASSLEXECUTOR();
	/**
	 * Generated by ASSL Framework
	 * 
	 * Holds a reference to the FRIENDS class.
	 */
	public generatedbyassl.as.aes.customera.FRIENDS FRIENDS = generatedbyassl.as.aes.customera.FRIENDS.getInstance();
	/**
	 * Generated by ASSL Framework
	 * 
	 * Holds a reference to the AEIP class.
	 */
	public generatedbyassl.as.aes.customera.AEIP AEIP = generatedbyassl.as.aes.customera.AEIP.getInstance();

	/**
	 * Generated by ASSL Framework
	 * 
	 * Because this is a singleton class its constructor is private.
	 */
	private  CUSTOMERA (  )
	{
		vPolicies.put( "SELF_HEALING", generatedbyassl.as.aes.customera.aeself_management.SELF_HEALING.getInstance() );
		ACTIONS.put( "SERVICESINPROGRESS", generatedbyassl.as.aes.customera.actions.SERVICESINPROGRESS.getInstance() );
		ACTIONS.put( "CHECKINTERFACE", generatedbyassl.as.aes.customera.actions.CHECKINTERFACE.getInstance() );
		ACTIONS.put( "CHECKBANDWIDTHISSUES", generatedbyassl.as.aes.customera.actions.CHECKBANDWIDTHISSUES.getInstance() );
		ACTIONS.put( "NOTIFYFORINACTIVEINTERFACE", generatedbyassl.as.aes.customera.actions.NOTIFYFORINACTIVEINTERFACE.getInstance() );
		ACTIONS.put( "SIMULATEUNSATISFIEDBANDWIDTH", generatedbyassl.as.aes.customera.actions.SIMULATEUNSATISFIEDBANDWIDTH.getInstance() );
		EVENTS.put( "TIMEFORSERVICES", generatedbyassl.as.aes.customera.events.TIMEFORSERVICES.getInstance() );
		EVENTS.put( "SERVICESTIMOUT", generatedbyassl.as.aes.customera.events.SERVICESTIMOUT.getInstance() );
		EVENTS.put( "UNSATISFIEDBANDWIDTH", generatedbyassl.as.aes.customera.events.UNSATISFIEDBANDWIDTH.getInstance() );
		EVENTS.put( "ISMSGINTERFACEINACTIVESENT", generatedbyassl.as.aes.customera.events.ISMSGINTERFACEINACTIVESENT.getInstance() );
		EVENTS.put( "INTERFACEINACTIVE", generatedbyassl.as.aes.customera.events.INTERFACEINACTIVE.getInstance() );
		EVENTS.put( "INTERFACECHECKED", generatedbyassl.as.aes.customera.events.INTERFACECHECKED.getInstance() );
		EVENTS.put( "INTERFACENOTCHECKED", generatedbyassl.as.aes.customera.events.INTERFACENOTCHECKED.getInstance() );
		EVENTS.put( "TIMETOSIMULATEUNSATISFIEDBANDWIDTH", generatedbyassl.as.aes.customera.events.TIMETOSIMULATEUNSATISFIEDBANDWIDTH.getInstance() );
		EVENTS.put( "CUSTOMERAINUNSATISFIEDBANDWIDTH", generatedbyassl.as.aes.customera.events.CUSTOMERAINUNSATISFIEDBANDWIDTH.getInstance() );
		METRICS.put( "BANDWIDTHA", generatedbyassl.as.aes.customera.metrics.BANDWIDTHA.getInstance() );
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * This method returns the unique instance of 'CUSTOMERA' class.
	 */
	static public CUSTOMERA getInstance (  )
	{
		if ( null == oInstance ) 
		{
			oInstance = new CUSTOMERA();
		}
		return oInstance;
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * Sets the control loop components.
	 */
	protected void setControlLoop (  )
	{
		//**** This method overrides the super class's method.
		//****************************************************
		oMonitor.setMonitoredSLO(AESLO);
		oMonitor.setMonitoredMetrics(METRICS);
		oMonitor.setAnalyzer(oAnalyzer);
		oAnalyzer.setSimulator(oSimulator);
		oAnalyzer.setExecutor(oExecutor);
		oSimulator.setExecutor(oExecutor);
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * Performs the AE control loop.
	 */
	protected void controlLoop (  )
	{
		//**** This method overrides the super class's method.
		//****************************************************
		try
		{
			//**** control loops should not be very resource-consuming, thus it releases CPU for a while
			Thread.sleep(1000);
		}
		catch ( InterruptedException ex ) 
		{
			System.err.println( ex.getMessage() );
		}
		//**** performs AE control loop monitor-analyzer-simulator-executor
		oMonitor.perform();
		oAnalyzer.perform();
		oSimulator.perform();
		oExecutor.perform();
		//**** applies all the "switched-on" self-management policies for the AS
		applayPolicies();
	}

}