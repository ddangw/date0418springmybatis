package com.qd.entity;

/**
 * 标记如果是：1表示执行成功
 * 0表示数据库连接成功，但执行错误
 * -1表示异常
 */
public class ResultData {
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    private int code;
    private String msg;
    private Object data;

    public ResultData(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public ResultData() {
    }
    //添加数据成功,code为1时
    public static ResultData addcg(String msg){
        return new ResultData(1,msg,null);
    }
    //添加数据失败，code为0时
    public static ResultData addsb(String msg){
        return new ResultData(0,msg,null);
    }
    //数据库连接异常,code为-1时
    public static ResultData addsjk(String msg){
        return new ResultData(-1,msg,null);
    }
    //查询成功时
    public static ResultData selectcg(String msg,Object data){
        return new ResultData(1,msg,data);
    }
    //查询shibai时
    public static ResultData selectsb(String msg,Object data){
        return new ResultData(-1,msg,data);
    }

}
