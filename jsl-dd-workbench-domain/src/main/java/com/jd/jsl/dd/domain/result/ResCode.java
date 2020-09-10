package com.jd.jsl.dd.domain.result;

import lombok.Getter;

/**
 * @author wujia215
 * @date 2020/3/2315:04
 */
public final class ResCode {

    public static final ResCode SUCCESS = new ResCode(0, "请求成功");
    public static final ResCode FAILED = new ResCode(1,"请求失败");


    /**********************************************************************************/
    @Getter private int code;
    @Getter  private String msg;

    private ResCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    @Override
    public String toString() {
        return this.code + ":"+ this.msg;
    }

}

