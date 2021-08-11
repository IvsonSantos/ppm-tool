package com.ivson.service;

import com.ivson.domain.Project;
import com.ivson.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    public Project saveOrUpdate(Project project) {
        return projectRepository.save(project);
    }

}
