package br.com.trapp.deviceserver.api;

/**
 * Interface that every module have to follow in order to connect it in the
 * device server
 * 
 * @author marlon
 *
 */
public interface DeviceModule {

    /**
     * This method is from where all messages will come to the module
     * 
     * @param message
     *            the message
     * @return the return message null if none
     */
    public DeviceMessage incomingMessage(DeviceMessage message) throws DeviceException;

    /**
     * This should return the beauty name of the module
     * 
     * @return the version of the module
     */
    public String getName();

    /**
     * This should return the version of the module
     * 
     * @return the version of the module
     */
    public String getVersion();

    /**
     * This should return the identifier to be used in the path in the Device
     * Server
     * 
     * @return the name that will identify the module
     */
    public String getIdendifier();

}
