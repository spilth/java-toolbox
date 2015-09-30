package com.javatoolbox.projects;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProjectsRepository extends CrudRepository<Project, Long> {
    List<Project> findAllByOrderByNameAsc();
}
