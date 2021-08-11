package com.ivson.controller;

import com.ivson.domain.Project;
import com.ivson.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/project")
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @PostMapping
    public ResponseEntity<Project> createNewProject(@RequestBody Project project) {
        Project project1 = projectService.saveOrUpdate(project);
        return new ResponseEntity<Project>(project1, HttpStatus.CREATED);
    }

}
