package com.gowtham.fullstack.Service;

import com.gowtham.fullstack.Entity.StudentEntity;

import java.util.List;

public interface StudentService {
    public  StudentEntity saveStudent(StudentEntity studentEntity);

    public List<StudentEntity> getStudentsList();

    public StudentEntity fetchById(Long studentId);


    public void deleteStudentById(Long id);

    public StudentEntity updateStudent(Long studentId,StudentEntity studentEntity);

    public StudentEntity fetchStudentByName(String studentname);
}
