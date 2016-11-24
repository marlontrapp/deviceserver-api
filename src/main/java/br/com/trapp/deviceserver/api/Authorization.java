package br.com.trapp.deviceserver.api;

public class Authorization {
    
    /**
     * Certificate encoded in PEM
     */
    private String certificate;
    
    public Authorization(String certificate) {
	this.certificate = certificate;
    }
    
    public Authorization() {
    }

    public String getCertificate() {
        return certificate;
    }

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

}
