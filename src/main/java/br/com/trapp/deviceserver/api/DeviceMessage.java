package br.com.trapp.deviceserver.api;


/**
 * Class to encapsulate messages through the device server. This class is
 * generic enough to accept any type of message needed by the module.
 * <p>
 * DO NOT USE THIS CLASS DIRECTLY IN SERVER. This class is supposed to be uses
 * directly only in the module. To construct a DeviceMessage use the
 * {@link DeviceMessageFactory} class.
 * 
 * @author marlon
 *
 */
public class DeviceMessage {

    private String method;

    private String message;
    
    private String iv;

    /**
     * /** Default constructor
     * 
     * @param method
     *            the method of the target module to be executed
     * @param message
     *            it can be anything defined in the module documentation. Eg.
     *            plain text or json
     */
    public DeviceMessage(String method, String message) {
	this.message = message;
    }

    /**
     * Empty constructor for serialization
     */
    public DeviceMessage() {
    }

    public String getMessage() {
	return this.message;
    }

    public void setMessage(String message) {
	this.message = message;
    }

    public String getMethod() {
	return method;
    }

    public void setMethod(String method) {
	this.method = method;
    }

    public void setIV(String iv) {
	this.iv = iv;	
    }
    
    public String getIV() {
	return this.iv;	
    }

}
