package com.briup.datacenter.utils;

/**
 * @program: datacenter
 * @description: 错误码汇总
 * @author: zhangcg
 * @create: 2020-12-09 23:42
 **/
public class CodeMsg {
    private int code;
    private String msg;

    public CodeMsg(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    //通用的错误码

    //正确
    public static CodeMsg SUCCESS = new CodeMsg(200, "OK");
    //已接受
    public static CodeMsg SUCCESS_UNTREATED = new CodeMsg(202, "Accepted");

    //部分成功
    public static CodeMsg SUCCESS_PORTION = new CodeMsg(206, "Partial Content");

    //错误的请求
    public static CodeMsg REQ_ERROR = new CodeMsg(400, "BadRequest");

    //未授权
    public static CodeMsg SERVER_UNAUTHORIZED = new CodeMsg(401, "Unauthorized");
    //未满⾜前提条件
    public static CodeMsg SERVER_PRECONDITION = new CodeMsg(412, "PreconditionFailed");
    //删除部件时，存在关联的数据集
    public static CodeMsg PART_ERROR = new CodeMsg(408, "There are associated data sets");
    //参数校验异常：%s
    public static CodeMsg BIND_ERROR = new CodeMsg(414, "Request-URITooLarge");
    //服务器内部错误
    public static CodeMsg SERVER_ERROR = new CodeMsg(500, "InternalServerError");
    //文件名字重复
    public static CodeMsg NAME_REPETITION = new CodeMsg(506, "NameRepetitionError");

    //名字不能包含中文
    public static CodeMsg NAME_NOCHINESE = new CodeMsg(507, "NoChinese");
    //zip目录结构异常
    public static CodeMsg ZIP_ANOMALY = new CodeMsg(508,"DataSet zip file structure exception: there are directory files in the second level directory");

    public CodeMsg fillArgs(Object... args) {
        int code = this.code;
        String message = String.format(this.msg, args);
        return new CodeMsg(code, message);
    }

    @Override
    public String toString() {
        return "CodeMsg{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                '}';
    }
}
