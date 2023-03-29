package com.rookie.bigdata;

/**
 * @Classname Member
 * @Description TODO
 * @Author rookie
 * @Date 2021/9/15 21:10
 * @Version 1.0
 */
public class Member
{
    private int point;
    private int level;
    private String mobile;
    private String nick;
    private String extend;

    public String getNick()
    {
        return this.nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getExtend() {
        return this.extend;
    }

    public void setExtend(String extend) {
        this.extend = extend;
    }

    public int getPoint() {
        return this.point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public int getLevel() {
        return this.level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getMobile() {
        return this.mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String toString()
    {
        return "Member{point=" + this.point + ", level=" + this.level + ", mobile='" + this.mobile + '\'' + ", nick='" + this.nick + '\'' + ", extend='" + this.extend + '\'' + '}';
    }
}
