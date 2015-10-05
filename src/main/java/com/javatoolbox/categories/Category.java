package com.javatoolbox.categories;

import com.javatoolbox.projects.Project;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "categories")
public class Category {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "categoryId")
    @Where(clause = "enabled = 1")
    @OrderBy("name")
    private Set<Project> projects;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Project> getProjects() {
        return projects;
    }

    public void setProjects(Set<Project> projects) {
        this.projects = projects;
    }
}
