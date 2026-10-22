package com.gzu.ctts.common;


public class Result {


    private Integer code;

    private String message;

    private Object data;



    public Result(Integer code,String message,Object data){

        this.code=code;
        this.message=message;
        this.data=data;

    }



    public static Result success(Object data){

        return new Result(
                200,
                "success",
                data
        );

    }



    public Integer getCode() {
        return code;
    }


    public String getMessage() {
        return message;
    }


    public Object getData() {
        return data;
    }

}