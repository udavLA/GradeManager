package com.ltp.gradesubmission;

import java.util.UUID;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

public class Grade {

    @NotBlank(message = "Name can`t be blank")
    private String name;

    @Score(message = "Grade must be a letter")
    @NotBlank(message = "Grade can`t be blank")
    private String score;

    @Min(value = 0, message = "Score should be higher than -1")
    @Max(value = 100, message = "Score should be lower than 100")
    @NotBlank(message = "Score can`t be blank")
    private String score_bolon;

    @NotBlank(message = "Subject can`t be blank")
    private String subj;


    private String stud_id;
    


    public Grade() {
        this.stud_id = UUID.randomUUID().toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getSubj() {
        return subj;
    }

    public void setSubj(String subj) {
        this.subj = subj;
    }


 public String getScore_bolon() {
        return score_bolon;
    }

    public void setScore_bolon(String score_bolon) {
        this.score_bolon = score_bolon;
    }

    public String getStud_id() {
        return this.stud_id;
    }

    public void setStud_id(String stud_id) {
        this.stud_id = stud_id;
    }
  
   
    
}
