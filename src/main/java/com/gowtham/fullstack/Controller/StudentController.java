package com.gowtham.fullstack.Controller;

import com.gowtham.fullstack.Entity.StudentEntity;
import com.gowtham.fullstack.Service.StudentService;
import com.gowtham.fullstack.Service.StudentServiceImple;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class StudentController {

    private final Logger logger = LoggerFactory.getLogger(StudentController.class);
    @Autowired
    private StudentService studentService;

    @PostMapping("/students")
    public StudentEntity saveStudent(@Valid @RequestBody StudentEntity studentEntity)
    {
        return studentService.saveStudent(studentEntity);
    }


    @GetMapping("/students")
    public List<StudentEntity> getStudentsList()
    {
        logger.info("Inside of student controller");
        return studentService.getStudentsList();
    }

    @GetMapping("/students/{id}")
    public StudentEntity fetchById(@PathVariable("id") Long studentId)
    {
        return studentService.fetchById(studentId);
    }

    @DeleteMapping("/students/{id}")
    public void deleteStudentById(@PathVariable("id") Long id)
    {
         studentService.deleteStudentById(id);

//        return "successfully deleted";
    }

    @PutMapping("/students/{id}")
    public StudentEntity updateStudent(@PathVariable("id") Long studentId,@RequestBody StudentEntity studentEntity)
    {
        return studentService.updateStudent(studentId,studentEntity);
    }

    @GetMapping("students/name/{name}")
    public StudentEntity fetchStudentByName(@PathVariable("name") String studentname)
    {

        return studentService.fetchStudentByName(studentname);
    }
}
