package com.gowtham.fullstack.Service;

import com.gowtham.fullstack.Entity.StudentEntity;
import com.gowtham.fullstack.JpaRepositary.StudentRepositary;
import org.junit.jupiter.api.*;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudentServiceTest {


    @Autowired
    private StudentService studentService;
    @MockBean
    private StudentRepositary studentRepositary;

    //@BeforeAll
    @BeforeEach
    void setUp() {

        StudentEntity studentEntity = StudentEntity.builder().studentName("gowtham").studentRollNumber("a21").studentDepartment("bca"). build();
        Mockito.when(studentRepositary.findByStudentNameIgnoreCase("gowtham")).thenReturn(studentEntity);
    }

    @Test
    @DisplayName("Get  student data based on student name  ")
    //@Disabled  if u want avoid any particular test case, we can use @Disabled annotation
    public void whenStudentName_thenStudentShouldFound()
    {
        String studentName = "gowtham";
        StudentEntity got = studentService.fetchStudentByName(studentName);
        assertEquals(studentName,got.getStudentName());
    }
}