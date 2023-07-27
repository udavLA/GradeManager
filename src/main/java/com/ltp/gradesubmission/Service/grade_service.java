package com.ltp.gradesubmission.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ltp.gradesubmission.Grade;
import com.ltp.gradesubmission.constant;
import com.ltp.gradesubmission.Repository.grade_repository;


@Service
public class grade_service {

   @Autowired
    grade_repository graderepo;

    public Grade getGrade(int index)
    {
        return graderepo.getGrade(index);
    }

    public void addGrade(Grade grade)
    {
        graderepo.addGrade(grade);
    }

    public void updateGrade(Grade grade, int index)
    {
        graderepo.updateGrade(grade, index);
    }

    public List<Grade> getGrades ()
    {
        return graderepo.getGrades();
    }


    public int getGradeId(String id)
    {

        for (int i = 0; i < getGrades().size(); i++)
        {
          if (getGrades().get(i).getStud_id().equals(id)) 
            return i;   
        }
        return constant.NOT_FOUND;
    }

    public Grade getGradeById(String id){

        int index = getGradeId(id);
        return index ==  constant.NOT_FOUND ? new Grade() : getGrade(index);
    }

    public void submit_grade(Grade grade)
    {
        int id = getGradeId(grade.getStud_id());

        if(id == constant.NOT_FOUND)
        {
        addGrade(grade);
        } else
            {
                updateGrade(grade, id);
            }
    }
}
