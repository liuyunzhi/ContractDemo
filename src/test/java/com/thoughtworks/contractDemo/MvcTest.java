package com.thoughtworks.contractDemo;

import com.thoughtworks.contractDemo.controllers.TestController;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.Before;

public class MvcTest {

    @Before
    public void setup() {
        RestAssuredMockMvc.standaloneSetup(new TestController());
    }
}
