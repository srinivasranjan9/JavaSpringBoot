package com.techchefs.test.service;

import com.techchefs.test.model.Student;
import java.util.List;

public interface StudentService {

   Student create(Student student);

   Student get(Long id);
    
}
