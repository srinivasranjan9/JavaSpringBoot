package com.techchefs.test.service;

//import com.techchefs.test.excpetion.BadResourceRequestException;
//import com.techchefs.test.excpetion.NoSuchResourceFoundException;
import com.techchefs.test.model.Student;
import com.techchefs.test.repository.StudentRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("studentService")
public class StudentServiceImpl implements StudentService {

   @Autowired
   private StudentRepository studentRepository;

   public Student create(Student student) {

      return studentRepository.save(student);
   }

   public Student get(Long id) {

      return studentRepository.findById(id);
   }

}
