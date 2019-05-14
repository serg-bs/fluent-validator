package com.baidu.unbiz.fluentvalidator;

import com.baidu.unbiz.fluentvalidator.util.CollectionUtil;

import java.util.ArrayList;

/**
 * 带有全信息的复杂验证结果
 *
 * @author zhangxu
 */
public class ComplexResult extends GenericResult<ValidationError> {

    @Override
    public String toString() {
        return String.format("Result{isSuccess=%s, errors=%s, timeElapsedInMillis=%s}", isSuccess(), errors,
                timeElapsed);
    }

    private int timeElapsed;

    public int getTimeElapsed() {
        return timeElapsed;
    }

    public void setTimeElapsed(int timeElapsed) {
        this.timeElapsed = timeElapsed;
    }

    public void addResult(ComplexResult complexResult){
        if(!complexResult.isSuccess()){
            this.setIsSuccess(false);
        }
        if(!CollectionUtil.isEmpty(complexResult.getErrors())){
            if (CollectionUtil.isEmpty(this.getErrors())){
                this.setErrors(new ArrayList<ValidationError>());
            }

            this.getErrors().addAll(complexResult.getErrors());
        }

    }

}
