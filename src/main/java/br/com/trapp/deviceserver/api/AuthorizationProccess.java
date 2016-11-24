package br.com.trapp.deviceserver.api;


public class AuthorizationProccess {

    private String p;
    private String g;
    private String y;
    private String signature;
    private int session;

    public AuthorizationProccess() {
    }

    public AuthorizationProccess(String p, String g, String y,  int session) {
	this.p = p;
	this.g = g;
	this.y = y;
	this.session =  session;
    }

    public String getP() {
        return p;
    }

    public void setP(String p) {
        this.p = p;
    }

    public String getG() {
        return g;
    }

    public void setG(String g) {
        this.g = g;
    }

    public String getY() {
        return y;
    }

    public void setY(String y) {
        this.y = y;
    }

    public int getSession() {
        return session;
    }

    public void setSession(int session) {
        this.session = session;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }
}
