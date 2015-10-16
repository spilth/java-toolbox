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
public class UserSubmissionTest extends SeleniumTest {
    @Test
    public void submittingAProject() {
        goTo(getDefaultBaseUrl() + "/admin");

        find("a").withText("New Category").click();
        find("#name").fill("HTML and Markup");
        find("input[type=submit]").click();

        goTo(getDefaultBaseUrl());

        find("a").withText("Submit A Project").click();

        find("#name").fill("User Submitted Project");
        find("#description").fill("A website for discovering Java libraries and tools");
        find("#categoryId").select("HTML and Markup");
        find("#websiteUrl").fill("http://www.java-toolbox.com/");
        find("#sourcecodeUrl").fill("https://github.com/TheJavaToolbox/java-toolbox");
        find("#issuesUrl").fill("https://github.com/TheJavaToolbox/java-toolbox/issues");
        find("#groupId").fill("org.spilth");
        find("#artifactId").fill("blog");
        find("input[type=submit]").click();

        find("a").withText("Projects").click();
        find("body").should().not().contain("User Submitted Project");

        goTo(getDefaultBaseUrl() + "/admin");
        find("a").withText("User Submitted Project");
    }

    @Override
    protected String getDefaultBaseUrl() {
        return "http://localhost:9000";
    }
}
