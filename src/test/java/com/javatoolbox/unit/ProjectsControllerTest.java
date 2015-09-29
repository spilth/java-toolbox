package com.javatoolbox.unit;

import com.javatoolbox.projects.ProjectsController;
import com.javatoolbox.ToolboxApplication;
import com.javatoolbox.projects.Project;
import com.javatoolbox.projects.ProjectsRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {ToolboxApplication.class})
@WebAppConfiguration
public class ProjectsControllerTest {
    @InjectMocks
    ProjectsController projectsController;

    @Mock
    ProjectsRepository projectsRepository;

    private MockMvc mockMvc;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        mockMvc = standaloneSetup(projectsController).build();
    }

    @Test
    public void projectShow_rendersProject() throws Exception {
        Project project = mock(Project.class);

        when(projectsRepository.findOne(42l)).thenReturn(project);

        mockMvc.perform(get("/projects/42"))
                .andExpect(status().isOk())
                .andExpect(view().name("projects/show"))
                .andExpect(model().attribute("project", project));
    }
}