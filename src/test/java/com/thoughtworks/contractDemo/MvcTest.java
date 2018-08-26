package com.thoughtworks.contractDemo;

import com.github.database.rider.core.api.dataset.DataSet;
import com.github.database.rider.spring.api.DBRider;
import com.thoughtworks.contractDemo.controllers.ProductController;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ActiveProfiles("test")
@DBRider
public class MvcTest {

    @Before
    @DataSet("products.yml")
    public void setup() {
        RestAssuredMockMvc.standaloneSetup(new ProductController());
    }
}
