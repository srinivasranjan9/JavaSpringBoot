package com.techchefs.test.controller;

import com.techchefs.test.model.Student;
import com.techchefs.test.service.StudentService;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@EnableConfigurationProperties
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/students", method = RequestMethod.POST, consumes = "application/json")
    @ResponseStatus(HttpStatus.OK)
    public Student createNewStudent(@RequestBody @Valid Student student) {
        return studentService.create(student);
    }

    @RequestMapping(value = "/student/{id}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public Student getStudentById(@PathVariable Long id) {
        return studentService.get(id);
    }
    
    @RequestMapping(value = "/student/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public void deleteStudentById(@PathVariable Long id) {
        
    }
}
