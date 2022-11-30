package generatedbyassl.as.aes;

import java.io.Serializable;
import generatedbyassl.as.ASSLAE;
import generatedbyassl.as.aes.coordinator.controlloop.*;

/**
 * Generated by ASSL Framework
 * 
 * This is the Java class generated for 'Coordinator' (specified as AE ASSL tier).
 */
public class COORDINATOR
	extends ASSLAE
	implements  Serializable
{

	/**
	 * Generated by ASSL Framework
	 * 
	 * This is a reference to the unique instance of 'COORDINATOR' class.
	 */
	static private COORDINATOR oInstance = null;
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
	private COORDINATOR_ASSLMONITOR oMonitor = new COORDINATOR_ASSLMONITOR();
	/**
	 * Generated by ASSL Framework
	 * 
	 * Holds a reference to the AE control loop's analyzer.
	 */
	private COORDINATOR_ASSLANALYZER oAnalyzer = new COORDINATOR_ASSLANALYZER();
	/**
	 * Generated by ASSL Framework
	 * 
	 * Holds a reference to the AE control loop's simulator.
	 */
	private COORDINATOR_ASSLSIMULATOR oSimulator = new COORDINATOR_ASSLSIMULATOR();
	/**
	 * Generated by ASSL Framework
	 * 
	 * Holds a reference to the AE control loop's executor.
	 */
	private COORDINATOR_ASSLEXECUTOR oExecutor = new COORDINATOR_ASSLEXECUTOR();
	/**
	 * Generated by ASSL Framework
	 * 
	 * Holds a reference to the AEIP class.
	 */
	public generatedbyassl.as.aes.coordinator.AEIP AEIP = generatedbyassl.as.aes.coordinator.AEIP.getInstance();

	/**
	 * Generated by ASSL Framework
	 * 
	 * Because this is a singleton class its constructor is private.
	 */
	private  COORDINATOR (  )
	{
		vPolicies.put( "SELF_HEALING", generatedbyassl.as.aes.coordinator.aeself_management.SELF_HEALING.getInstance() );
		ACTIONS.put( "CHECKDEVICE", generatedbyassl.as.aes.coordinator.actions.CHECKDEVICE.getInstance() );
		EVENTS.put( "UNSATISFIEDBANDWIDTH", generatedbyassl.as.aes.coordinator.events.UNSATISFIEDBANDWIDTH.getInstance() );
		EVENTS.put( "DEVICECHECKED", generatedbyassl.as.aes.coordinator.events.DEVICECHECKED.getInstance() );
		EVENTS.put( "MSGINTERFACEINACTIVERECEIVED", generatedbyassl.as.aes.coordinator.events.MSGINTERFACEINACTIVERECEIVED.getInstance() );
		METRICS.put( "BANDWIDTHA", generatedbyassl.as.aes.coordinator.metrics.BANDWIDTHA.getInstance() );
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * This method returns the unique instance of 'COORDINATOR' class.
	 */
	static public COORDINATOR getInstance (  )
	{
		if ( null == oInstance ) 
		{
			oInstance = new COORDINATOR();
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