package com.ltp.gradesubmission;

import java.util.Arrays;
import java.util.List;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class Scorevalid implements ConstraintValidator<Score, String> {

    List<String> scores = Arrays.asList(
        "A", "B", "C", "D", "E", "F"
    );

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        
        for(String string : scores)
        {
            if(value.equals(string)) return true;
        }
       return false;
    }
    
}
