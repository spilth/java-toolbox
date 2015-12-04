package com.javatoolbox.projects;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class ProjectTest {
    @Test
    public void isMavenDependency_hasGroupAndArtifact_returnsTrue() {
        Project project = new Project();
        project.setGroupId("groupId");
        project.setArtifactId("artifactId");

        assertThat(project.isMavenDependency(), is(true));
    }

    @Test
    public void isMavenDependency_hasOnlyOne_returnsFalse() {
        Project project = new Project();
        project.setGroupId("groupId");

        assertThat(project.isMavenDependency(), is(false));
    }
}