package com.bjpowernode.handle;

/**
 * Company : BJPowernode
 * Date : 2020/8/31
 * Description :
 */

import com.bjpowernode.exception.ResultException;
import com.bjpowernode.exception.ResultException;
import com.bjpowernode.util.Result;
import com.bjpowernode.util.ResultEnum;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 异常统一处理类
 *
 */
@ControllerAdvice
public class ResultExeceptionAdvice {

    /**
     *该方法用来拦截到controller的异常信息，进行统一处理
     */
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result handleExceptionAdvice(Exception e){
        ResultException resultExecption = null;

        if (e instanceof ResultException){
            resultExecption = (ResultException)e;
            return Result.build(resultExecption);
        }else {
            return Result.build(new ResultException(ResultEnum.UNKNOWN_EXCEPTION));
        }
    }
}
