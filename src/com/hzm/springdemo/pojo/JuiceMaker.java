package com.hzm.springdemo.pojo;

/**
 * 果汁制造商
 * @author hzm
 */
public class JuiceMaker {
    //搅拌机
    private Blender blender = null;
    /**
     * 水描述
     */
    private String water;
    /**
     * 水果
     */
    private String fruit;
    /**
     * 糖分描述
     */
    private String sugar;
    public String makeJuice(){
        blender = new Blender();
        return blender.mix(water,fruit,sugar);
    }
}
