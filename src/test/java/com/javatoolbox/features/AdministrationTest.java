package com.javatoolbox.features;

import com.javatoolbox.ToolboxApplication;
import net.codestory.simplelenium.SeleniumTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ToolboxApplication.class)
@WebAppConfiguration
@IntegrationTest("server.port:9000")
public class AdministrationTest extends SeleniumTest {
    @Test
    public void addingProjects() {
        goTo(getDefaultBaseUrl() + "/admin");

        find("a").withText("New Project").click();
        find("#name").fill("pegdown");
        find("#description").fill("foo");
        find("input[type=submit]").click();

        find("h1").should().contain("pegdown");

        find("#projects").click();
        find("body").should().contain("pegdown");
    }

    @Override
    protected String getDefaultBaseUrl() {
        return "http://localhost:9000";
    }
}
