package com.gowtham.fullstack.Service;

import com.gowtham.fullstack.Entity.StudentEntity;
import com.gowtham.fullstack.JpaRepositary.StudentRepositary;
import com.gowtham.fullstack.error.StudentNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class StudentServiceImple implements StudentService {

    @Autowired
    private StudentRepositary studentRepositary;
    @Override
    public StudentEntity saveStudent(StudentEntity studentEntity) {
        return studentRepositary.save(studentEntity);
    }

    @Override
    public List<StudentEntity> getStudentsList() {
        return studentRepositary.findAll();
    }

    @Override
    public StudentEntity fetchById(Long studentId) throws StudentNotFoundException {
       Optional<StudentEntity> student = studentRepositary.findById(studentId);

       if(!student.isPresent())
       {
           throw new StudentNotFoundException("student details not found");
       }
       return student.get();
        
    }

    @Override
    public void deleteStudentById(Long id) {
        studentRepositary.deleteById(id);
    }

    @Override
    public StudentEntity updateStudent(Long studentId,StudentEntity studentEntity )
    {
    StudentEntity stuEntity = studentRepositary.findById(studentId).get();

    if(Objects.nonNull(studentEntity.getStudentName()) &&
            !"".equalsIgnoreCase(studentEntity.getStudentName()))
    {
        stuEntity.setStudentName((studentEntity.getStudentName()));
    }

        if(Objects.nonNull(studentEntity.getStudentDepartment()) && 
                !"".equalsIgnoreCase(studentEntity.getStudentDepartment()))
        {
            stuEntity.setStudentDepartment((studentEntity.getStudentDepartment()));
        }

        if(Objects.nonNull(studentEntity.getStudentRollNumber()) &&
                !"".equalsIgnoreCase(studentEntity.getStudentRollNumber()))
        {
            stuEntity.setStudentRollNumber((studentEntity.getStudentRollNumber()));
        }

        return studentRepositary.save(stuEntity);
    }

    @Override
    public StudentEntity fetchStudentByName(String studentname) {
        return studentRepositary.findByStudentNameIgnoreCase(studentname);
    }

}
