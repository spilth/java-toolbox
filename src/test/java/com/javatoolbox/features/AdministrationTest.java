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
    public void addingContent() {
        addCategory();
        addProject();
    }

    private void addCategory() {
        goTo(getDefaultBaseUrl() + "/admin");

        find("a").withText("New Category").click();
        find("#name").fill("HTML and Markup");
        find("input[type=submit]").click();
        find("h1").should().contain("HTML and Markup");

        find("#projects").click();
        find("body").should().contain("HTML and Markup");
    }

    private void addProject() {
        goTo(getDefaultBaseUrl() + "/admin");

        find("a").withText("New Project").click();
        find("#name").fill("Java Toolbox");
        find("#description").fill("A website for discovering Java libraries and tools");
        find("#categoryId").select("HTML and Markup");
        find("#websiteUrl").fill("http://www.java-toolbox.com/");
        find("#sourcecodeUrl").fill("https://github.com/TheJavaToolbox/java-toolbox");
        find("#issuesUrl").fill("https://github.com/TheJavaToolbox/java-toolbox/issues");
        find("#groupId").fill("org.spilth");
        find("#artifactId").fill("blog");
        find("input[type=submit]").click();

        find("h1").should().contain("Java Toolbox");
        find("body").should().contain("Website");
        find("body").should().contain("Source Code");
        find("body").should().contain("Bug Tracker");

        find("#projects").click();
        find("body").should().contain("Java Toolbox");
    }

    @Override
    protected String getDefaultBaseUrl() {
        return "http://localhost:9000";
    }
}
