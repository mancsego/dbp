package com.codingchallange.dgp.repositories;

import com.codingchallange.dgp.entities.Group;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "groups", path = "groups")
public interface GroupRepository extends CrudRepository<Group, Long>, PagingAndSortingRepository<Group, Long> {
}
