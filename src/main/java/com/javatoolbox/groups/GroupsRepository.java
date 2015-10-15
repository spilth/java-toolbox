package com.javatoolbox.groups;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface GroupsRepository extends CrudRepository<Group, Long> {
    List<Group> findAllByOrderByNameAsc();
}
