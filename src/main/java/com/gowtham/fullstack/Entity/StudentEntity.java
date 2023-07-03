package com.gowtham.fullstack.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StudentEntity {

    @Id
    @GeneratedValue
    private Long studentId;

    private String studentName;
    @NotBlank(message = "please add the student rollnumber")
    private String studentRollNumber;
    private String studentDepartment;

//    public Long getStudentId() {
//        return studentId;
//    }
//
//    public void setStudentId(Long studentId) {
//        this.studentId = studentId;
//    }
//
//    public String getStudentName() {
//        return studentName;
//    }
//
//    public void setStudentName(String studentName) {
//        this.studentName = studentName;
//    }
//
//    public String getStudentRollNumber() {
//        return studentRollNumber;
//    }
//
//    public void setStudentRollNumber(String studentRollNumber) {
//        this.studentRollNumber = studentRollNumber;
//    }
//
//    public String getStudentDepartment() {
//        return studentDepartment;
//    }
//
//
//    public void setStudentDepartment(String studentDepartment) {
//        this.studentDepartment = studentDepartment;
//    }
//
//    public StudentEntity(Long studentId, String studentName, String studentRollNumber, String studentDepartment) {
//        this.studentId = studentId;
//        this.studentName = studentName;
//        this.studentRollNumber = studentRollNumber;
//        this.studentDepartment = studentDepartment;
//    }
//
//    public StudentEntity() {
//    }
//
//    @Override
//    public String toString() {
//        return "StudentEntity{" +
//                "studentId=" + studentId +
//                ", studentName='" + studentName + '\'' +
//                ", studentRollNumber=" + studentRollNumber +
//                ", studentDepartment='" + studentDepartment + '\'' +
//                '}';
//    }
}

