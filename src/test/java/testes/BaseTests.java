package  testes;

import org.junit.After;
import org.junit.Before;
import utils.Browser;
import utils.Utils;

public class BaseTests {
    @Before
    public void setup(){

        Browser.loadPage(Utils.getBaseUrl());
    }

    @After
    public void tearmDronw(){
     Browser.close();

    }

}

