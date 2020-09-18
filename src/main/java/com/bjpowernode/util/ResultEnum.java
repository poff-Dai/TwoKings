package com.bjpowernode.util;

/**
 * Company : 枚举  ：如果针对一个变量的取值只能在某一个范围下时，请使用枚举类型来定义。
 * Date : 2020/8/28
 * Description :
 */
/**
 * 枚举中定义的变量类型都是当前枚举对象类型\
 * 1.变量和变量之间使用逗号分开，最后一个变量使用分号结束
 * 2.枚举类就是一个普通的class类
 * 3.枚举类中是默认存在一个无参的构造函数
 */
public enum  ResultEnum {

    SUCCESS("OK",200),
    NOT_FOUND("未找到数据",1004),
    FAILED("操作失败",1005),
    USER_IP_LIMIT("IP受限制",1005),
    USER_LOCK("账户被锁定",1005),
    USER_EXPIRETIME("账户过期",1005),
    NOT_FOUND_USER("账户未注册",1004),
    ADD_FAILED("数据添加失败",1005),
    UPDATE_FAILED("编辑数据失败",1005),
    DELETE_FAILED("数据删除失败",1005),
    UNKNOWN_EXCEPTION("未知异常",1007),
    PARAM_ERROR("参数异常",2001),
    OWNER_PARAM_NOT_NULL("所有者参数不能为空",2001),
    NAME_PARAM_NOT_NULL("名称参数不能为空",2001),
    DATE_PARAM_NOT_NULL("日期参数不能为空",2001),
    STAGE_PARAM_NOT_NULL("阶段参数不能为空",2001),
    CUSTOMER_PARAM_NOT_NULL("客户参数不能为空",2001);
    
    ResultEnum(String message,Integer code){
        this.message = message;
        this.code = code;
    }

    private String message;

    private Integer code;

    public String getMessage() {
        return message;
    }

    public Integer getCode() {
        return code;
    }

    // ResultEnum POST = new ResultEnum（）；

}
