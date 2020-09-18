package com.bjpowernode.exception;

import com.bjpowernode.util.ResultEnum;

/**
 * poff.Dai
 * 2020/9/17
 */
public class ResultException extends RuntimeException {
    private ResultEnum resultEnum;

    private String message;

    private Integer code;

    public ResultException(String message,Integer code){
        this.message = message;
        this.code = code;
    }

    //目的：获取枚举中的message信息和code状态码
    public ResultException(ResultEnum resultEnum){
        this.resultEnum = resultEnum;
    }

    @Override
    public String getMessage() {
        if (resultEnum !=null){
            this.message = resultEnum.getMessage();
        }

        return message;
    }

    public Integer getCode() {
        if (resultEnum !=null){
            this.code = resultEnum.getCode();
        }
        return code;
    }

}
