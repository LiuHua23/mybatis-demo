package com.hwa.mybatis.consts;

/**
 * @author LiuHua
 * @date 2018/5/10
 */
public enum  GenderEnum {
    MALE("男"),
    FEMALE("女");

    private String desc;

    private GenderEnum(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }
}
