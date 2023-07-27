package com.ltp.gradesubmission.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.ltp.gradesubmission.Grade;
import com.ltp.gradesubmission.Service.grade_service;
import javax.validation.Valid;



@Controller
public class grade_controller {

 @Autowired
  grade_service gradeserv;
    

  @GetMapping("/")
  public String getForm(Model model, @RequestParam(required = false) String stud_id)
  {
    model.addAttribute("grade", gradeserv.getGradeById(stud_id));
    return "form";
  }


  @PostMapping("/handleSubmit")
  public String submit_grade_form(@Valid Grade grade, BindingResult result)
  { 
    if (result.hasErrors())  return "form";
    gradeserv.submit_grade(grade);
    return "redirect:/grades";
  }
  
    @GetMapping("/grades")
    public String getGrades(Model model)
    {
        model.addAttribute("grades", gradeserv.getGrades());
        return "grades";
    }
    
   
    
}
