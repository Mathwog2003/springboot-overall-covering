package com.gowtham.fullstack.JpaRepositary;


import com.gowtham.fullstack.Entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepositary extends JpaRepository<StudentEntity,Long>{



    public StudentEntity findByStudentNameIgnoreCase(String studentname);
}
