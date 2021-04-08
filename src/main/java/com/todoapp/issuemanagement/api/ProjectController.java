package com.todoapp.issuemanagement.api;

import com.todoapp.issuemanagement.dto.ProjectDto;
import com.todoapp.issuemanagement.service.impl.ProjectServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/project")
public class ProjectController {

    private final ProjectServiceImpl projectServiceImpl;

    public ProjectController(ProjectServiceImpl projectServiceImpl){
        this.projectServiceImpl = projectServiceImpl;
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProjectDto>getById(@PathVariable("id") Long id){
       ProjectDto projectDto = projectServiceImpl.getById(id);
       return ResponseEntity.ok(projectDto);
    }

}
