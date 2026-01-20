package com.example.demo.Controller;
import java.util.*;
import com.example.demo.Model.StudentModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {

  @GetMapping("/Student")

  public ArrayList<StudentModel> getStudent() {
    ArrayList<StudentModel> students = new ArrayList<>();
    students.add(new StudentModel(1, "ir", "ishi"));
    students.add(new StudentModel(2, "ef", "ish"));
    students.add(new StudentModel(3, "gr", "isha"));
    students.add(new StudentModel(4, "irf", "isha"));
    students.add(new StudentModel(5, "irr", "ishqa"));
    return students;


  }
}