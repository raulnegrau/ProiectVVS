package com.company;

public class WebServer {
    // 0 stopped, 1 running, 2 maintenance
    private int state;
    private int portNumber;

    public WebServer () {
        this(0, -1);
    }

    public WebServer(int state) {
        this(state, -1);
    }

    public WebServer(int state, int portNumber) {
        this.state = state;
        this.portNumber = portNumber;
    }


    public void setState (int state) {
        this.state = state;
    }

    public int getState () {
        return state;
    }

    public int getPortNumber() {
        return portNumber;
    }

    public void setPortNumber(int portNumber) {
        this.portNumber = portNumber;
    }

    public void startServer(){
        state = 1;
    }
}
