package com.hzm.springdemo.pojo;

/**
 * 果汁配料
 * @author hzm
 * */
public class Source {
    /**
     *水果类型
     */
    private String fruit;
    /**
     *糖分描述
     */
    private String sugar;
    /**
     * 被杯子大小
     */
    private String size;
    public void init(){
        System.out.println(this.getClass().getName()+"开始自定义的初始化方法");
    }
    public void destroy(){
        System.out.println(this.getClass().getName()+"开始自定义的销毁方法");
    }

    public String getFruit() {
        return fruit;
    }

    public void setFruit(String fruit) {
        this.fruit = fruit;
    }

    public String getSugar() {
        return sugar;
    }

    public void setSugar(String sugar) {
        this.sugar = sugar;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
