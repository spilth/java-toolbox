package com.javatoolbox.unit;

import com.javatoolbox.ToolboxApplication;
import com.javatoolbox.projects.Project;
import com.javatoolbox.projects.ProjectsAdminController;
import com.javatoolbox.projects.ProjectsRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {ToolboxApplication.class})
@WebAppConfiguration
public class ProjectsAdminControllerTest {
    @InjectMocks
    ProjectsAdminController projectsAdminController;

    @Mock
    ProjectsRepository projectsRepository;

    private MockMvc mockMvc;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        mockMvc = standaloneSetup(projectsAdminController).build();
    }

    @Test
    public void projectNew_rendersNewForm() throws Exception {
        mockMvc.perform(get("/admin/projects/new"))
                .andExpect(status().isOk())
                .andExpect(view().name("projects/new"));
    }

    @Test
    public void projectCreate_createsProject() throws Exception {
        Project persistedProject = new Project();
        persistedProject.setId(42l);

        when(projectsRepository.save(Matchers.any(Project.class))).thenReturn(persistedProject);

        mockMvc.perform(post("/admin/projects")
                .param("name", "pegdown")
                .param("description", "description"))
                .andExpect(redirectedUrl("/projects/42"));
    }
}