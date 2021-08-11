package com.ivson.repositories;

import com.ivson.domain.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {

    //Iterable<Project> findAllById(Iterable<Long> iterable);
    List<Project> findAllById(Iterable<Long> iterable);

}
