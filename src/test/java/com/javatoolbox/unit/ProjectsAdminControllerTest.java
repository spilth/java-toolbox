package com.javatoolbox.unit;

import com.javatoolbox.categories.CategoriesRepository;
import com.javatoolbox.categories.Category;
import com.javatoolbox.projects.Project;
import com.javatoolbox.projects.ProjectsAdminController;
import com.javatoolbox.projects.ProjectsRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

public class ProjectsAdminControllerTest {
    @InjectMocks
    ProjectsAdminController projectsAdminController;

    @Mock
    ProjectsRepository projectsRepository;

    @Mock
    CategoriesRepository categoriesRepository;

    private MockMvc mockMvc;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        mockMvc = standaloneSetup(projectsAdminController).build();
    }

    @Test
    public void projectNew_rendersNewForm() throws Exception {
        List<Category> categories = new ArrayList<>();
        Category category = new Category();
        category.setId(42l);
        category.setName("HTML and Markup");
        categories.add(category);

        when(categoriesRepository.findAll()).thenReturn(categories);

        mockMvc.perform(get("/admin/projects/new"))
                .andExpect(status().isOk())
                .andExpect(view().name("projects/new"));
    }

    @Test
    public void projectCreate_createsProject() throws Exception {
        List<Category> categories = new ArrayList<>();
        Category category = new Category();
        category.setId(42l);
        category.setName("HTML and Markup");
        categories.add(category);

        when(categoriesRepository.findAll()).thenReturn(categories);

        Project persistedProject = new Project();
        persistedProject.setId(42l);

        when(projectsRepository.save(Matchers.any(Project.class))).thenReturn(persistedProject);

        mockMvc.perform(post("/admin/projects")
                .param("name", "pegdown")
                .param("description", "description")
                .param("categoryId", "42")
        )
                .andExpect(redirectedUrl("/projects/42"));
    }
}