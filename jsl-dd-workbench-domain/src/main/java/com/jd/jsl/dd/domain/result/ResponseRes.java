package com.jd.jsl.dd.domain.result;

import lombok.Data;

/**
 * @author wujia215
 * @date 2020/3/2315:04
 */
@Data
public class ResponseRes {


    private int code;
    private String msg;
    private Object data;

    public ResponseRes(int code, Object data) {
        this.code = code;
        this.data = data;
    }

    public ResponseRes(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public ResponseRes(ResCode code, Object data){
        this.code = code.getCode();
        this.msg = code.getMsg();
        this.data = data;
    }

    public void setResCode(ResCode code) {
        this.code = code.getCode();
        this.msg = code.getMsg();
    }

    public ResponseRes(ResCode code, String msg, Object data) {
        this.code = code.getCode();
        this.msg = msg;
        this.data = data;
    }

}

