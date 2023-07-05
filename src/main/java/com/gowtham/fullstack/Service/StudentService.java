package com.gowtham.fullstack.Service;

import com.gowtham.fullstack.Entity.StudentEntity;
import com.gowtham.fullstack.error.StudentNotFoundException;

import java.util.List;

public interface StudentService {
    public  StudentEntity saveStudent(StudentEntity studentEntity);

    public List<StudentEntity> getStudentsList();

    public StudentEntity fetchById(Long studentId) throws StudentNotFoundException;


    public void deleteStudentById(Long id);

    public StudentEntity updateStudent(Long studentId,StudentEntity studentEntity);

    public StudentEntity fetchStudentByName(String studentname);
}
