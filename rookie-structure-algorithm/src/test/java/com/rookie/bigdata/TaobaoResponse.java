package com.rookie.bigdata;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * @Classname TaobaoResponse
 * @Description TODO
 * @Author rookie
 * @Date 2021/9/15 21:09
 * @Version 1.0
 */
public class TaobaoResponse
        implements Serializable {
    private Member member;

    public Member getMember() {
        return this.member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    @JsonProperty("bind_code")
    private String bindCode;

    public String toString()
    {
        return "BindResponse{bindCode='" + this.bindCode + '\'' + '}';
    }

    public String getBindCode()
    {
        return this.bindCode;
    }

    public void setBindCode(String bindCode) {
        this.bindCode = bindCode;
    }

//    public static TaobaoResponse fail()
//    {
//        BindQueryResponse taobaoResponse = new BindQueryResponse();
//        taobaoResponse.setBindCode(BindQueryEnum.QUERY_MEM_OTHER.getCode());
//        taobaoResponse.setBindable(false);
//        return taobaoResponse;
//    }
}
