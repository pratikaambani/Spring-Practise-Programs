package com.practise.spring.annotation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * Created by Pratik Ambani on 10/09/2017.
 */
public class MobileNumberValidator implements ConstraintValidator<MobileNumberValidation, String> {

    private String moNo;
    @Override
    public void initialize(MobileNumberValidation constraintAnnotation) {
        moNo = constraintAnnotation.value();
    }

    @Override
    public boolean isValid(String moNo, ConstraintValidatorContext constraintValidatorContext) {
        return (moNo != null) ? moNo.startsWith("+91") : false;
    }
}
