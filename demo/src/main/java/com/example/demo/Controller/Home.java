package com.example.demo.Controller;

import com.example.demo.Model.StudentModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {

  @GetMapping("/Student")

    public StudentModel getStudent(){
      StudentModel student = new StudentModel(12,"OK","vanshi@gmail.com");
      student.setId(12);
      return student;
  }



}
