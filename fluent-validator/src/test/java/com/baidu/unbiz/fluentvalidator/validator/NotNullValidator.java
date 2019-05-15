package com.baidu.unbiz.fluentvalidator.validator;

import com.baidu.unbiz.fluentvalidator.ValidationError;
import com.baidu.unbiz.fluentvalidator.Validator;
import com.baidu.unbiz.fluentvalidator.ValidatorContext;
import com.baidu.unbiz.fluentvalidator.ValidatorHandler;

import static com.baidu.unbiz.fluentvalidator.FluentValidator.FIELD;

/**
 * @author zhangxu
 */
public class NotNullValidator extends ValidatorHandler implements Validator {

    @Override
    public boolean validate(ValidatorContext context, Object obj) {
        if (obj == null) {
            context.addError(ValidationError.create("Null is not expected!"));
            return false;
        }
        return true;
    }

}
