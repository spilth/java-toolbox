package com.javatoolbox.features;

import org.junit.Test;

public class UserSubmissionTest extends BaseFeatureTest {
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
}
