package com.briup.datacenter.utils;

/**
 * @program: datacenter
 * @description: 定义统一的返回值类型
 * @author: zhangcg
 * @create: 2020-12-09 23:45
 **/
public class Message<T> {
    /**
     * 状态码
     */
    private int code;
    /**
     * 返回信息
     */
    private String msg;
    /**
     * 返回的数据类
     */
    private T data;

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public T getData() {
        return data;
    }


    /**
     * 只传入数据默认成功，所以添加默认的code和msg
     * @param data
     */
    private Message(T data) {
        this.code=200;
        this.msg="success";
        this.data=data;
    }

    private Message(CodeMsg cm) {
        if(cm==null){
            return;
        }
        this.code=cm.getCode();
        this.msg=cm.getMsg();
    }


    /**
     * 请求成功时调用
     * @param data
     * @return
     */
    public static <T> Message<T> success(T data){
        return new Message<T>(data);
    }

    /**
     * 失败的时候调用
     * @param cm
     * @param <T>
     * @return
     */
    public static <T> Message<T> error(CodeMsg cm){
        return new Message<T>(cm);
    }
}
