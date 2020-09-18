package com.bjpowernode.util;
import com.bjpowernode.exception.ResultException;



/**统一结果类
 * Company : BJPowernode
 * Date : 2020/8/28
 * Description :
 */
public class Result {
    private String message;

    private Integer code;

    private Object data;
    /**
     * 统一处理构造函数，带有返回结果构造函数
     * @return
     */
    public Result(String message, Integer code, Object data) {
        this.message = message;
        this.code = code;
        this.data = data;
    }

    /**
     * 不带有返回值data类型
     * @return
     */
    public Result(String message, Integer code) {
        this.message = message;
        this.code = code;
    }

    public Result(Object data) {
        this.message = "OK";
        this.code = 200;
        this.data = data;
    }

    public Result() {
        this.message = "OK";
        this.code = 200;
    }




    /**
     * 自定义成功方法并且带有返回值data
     * @return
     */
    public static Result OK(Object data){
        return new Result(data);
    }

    public static Result OK(){
        return new Result();
    }

    /**
     * 成功，无返回值data
     * @param message
     * @param code
     * @return
     */
    public static Result OK(String message, Integer code){
        return new Result(message,code);
    }


    /**
     * 业务出现问题时
     * @return
     */
    public static Result build(String message, Integer code){
        return new Result(message,code);
    }

    /**
     * 异常信息
     * @return
     */
    public static Result build(ResultException execption){
        return new Result(execption.getMessage(),execption.getCode());
    }





    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
