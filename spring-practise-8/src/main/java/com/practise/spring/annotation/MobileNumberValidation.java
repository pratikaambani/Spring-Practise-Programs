package com.practise.spring.annotation;

import org.hibernate.validator.internal.xml.binding.ValidatedByType;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 * Created by Pratik Ambani on 10/09/2017.
 */
@Documented
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = MobileNumberValidator.class)
public @interface MobileNumberValidation {

    String message()
            default "{Wrong Number !!}";

    Class<?>[] groups()
            default {};

    Class<? extends Payload>[] payload()
            default {};

    String value()
            default "{nothing}";

}
