package com.baidu.unbiz.fluentvalidator;

import com.baidu.unbiz.fluentvalidator.able.ListAble;
import com.baidu.unbiz.fluentvalidator.validator.element.ValidatorElement;

import java.util.List;

/**
 * 多个{@link Validator}组成的调用链
 *
 * @author zhangxu
 */
public class ValidatorChainExt implements ListAble<ValidatorElement> {

    /**
     * 验证器list
     */
    private List<ValidatorElement> validators;

    private String fieldName;

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    /**
     * get validators
     *
     * @return validators
     */
    public List<ValidatorElement> getValidators() {
        return validators;
    }

    /**
     * set validators
     *
     * @param validators
     */
    public void setValidators(List<ValidatorElement> validators) {
        this.validators = validators;
    }

    @Override
    public List<ValidatorElement> getAsList() {
        return validators;
    }

    @Override
    public String toString() {
        return "ValidatorChain{" +
                "validators=" + validators +
                '}';
    }
}
