package com.javatoolbox.features;

import com.javatoolbox.ToolboxApplication;
import com.javatoolbox.projects.Project;
import com.javatoolbox.projects.ProjectsRepository;
import net.codestory.simplelenium.SeleniumTest;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ToolboxApplication.class)
@WebAppConfiguration
@IntegrationTest("server.port:9000")
public class HomepageTest extends SeleniumTest {
    @Autowired
    ProjectsRepository projectsRepository;

    @Before
    public void setup() {
        Project project = new Project();
        project.setName("pegdown");
        project.setDescription("Foo");
        projectsRepository.save(project);
    }

    @Test
    public void homepageListsProjects() {
        goTo(getDefaultBaseUrl());

        find(".navbar-brand").first().should().contain("The Java Toolbox");
        find(".starter-template").should().contain("pegdown");
    }

    @Override
    protected String getDefaultBaseUrl() {
        return "http://localhost:9000/";
    }
}
