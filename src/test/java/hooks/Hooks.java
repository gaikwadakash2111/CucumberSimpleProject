package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.BaseClass;

public class Hooks {
    @Before
    public void setUp() {
        BaseClass.launchBrowser();
    }

    @After
    public void tearDown() {
        BaseClass.quitBrowser();
    }
}