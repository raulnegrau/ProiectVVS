import com.company.WebServer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class testWebServer {

    WebServer webServer;

    @Before
    public void before () {
        webServer = new WebServer();
    }


    @Test
    public void getStateWhenStopped() {
        assertEquals(0, webServer.getState());
    }

    @Test
    public void getStateWhenRunning() {
        webServer.startServer();
        assertEquals(1, webServer.getState());
    }

    @Test
    public void getStateWhenInMaintenance () {
        webServer.setState(2);
        assertEquals(2, webServer.getState());
    }

    @Test
    public void checkWhenThereIsNotAnyPortNumber() {
        assertEquals(-1, webServer.getPortNumber());
    }

}
