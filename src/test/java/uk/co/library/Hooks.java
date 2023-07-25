package uk.co.library;

import org.junit.After;
import org.junit.Before;
import uk.co.library.propertiesfiles.PropertyReader;
import uk.co.library.utilities.Utility;

public class Hooks extends Utility {
    @Before
    public void setUp(){
        selectBrowser(PropertyReader.getInstance().getProperty("browser"));
    }

    @After
    public void tearDown(){
        closeBrowser();
    }
}
