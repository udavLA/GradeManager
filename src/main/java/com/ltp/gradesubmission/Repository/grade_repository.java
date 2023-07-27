package com.ltp.gradesubmission.Repository;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;
import com.ltp.gradesubmission.Grade;

@Repository
public class grade_repository {
    private List<Grade> stud_grades = new ArrayList<>();

    public Grade getGrade(int index)
    {
        return stud_grades.get(index);
    }

    public void addGrade(Grade grade){
        stud_grades.add(grade);
    }

    public void updateGrade(Grade grade, int index)
    {
        stud_grades.set(index, grade);
    }

    public List<Grade> getGrades ()
    {
        return stud_grades;
    }

}
