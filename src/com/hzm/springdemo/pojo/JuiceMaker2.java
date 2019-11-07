package com.hzm.springdemo.pojo;

/**
 * 果汁制造商2
 * @author hzm
 */
public class JuiceMaker2 {

    private String beverageShop = null;
    /**
     * 果汁配料
     */
    private Source source = null;

    public String makeJuice2(){
        String juice = "这是一杯由"+beverageShop+"饮品店,提供的"+source.getSize()+source.getFruit()+source.getSugar();
        return juice;
    }

    public String getBeverageShop() {
        return beverageShop;
    }

    public void setBeverageShop(String beverageShop) {
        this.beverageShop = beverageShop;
    }

    public Source getSource() {
        return source;
    }

    public void setSource(Source source) {
        this.source = source;
    }
}
