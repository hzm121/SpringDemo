package com.hzm.springdemo.pojo;

/**
 * 搅拌机
 * @author hzm
 */
public class Blender {
    /**
     * 搅拌
     * @param water 水
     * @param fruit 水果
     * @param sugar 糖
     * @return 果汁
     */
    public String mix(String water,String fruit,String sugar){
        String juice = "这是一杯由液体："+water+"\n水果："+fruit+"\n糖量："+sugar+"\n组成的果汁";
        return juice;
    }
}
