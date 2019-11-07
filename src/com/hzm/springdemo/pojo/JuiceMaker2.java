package com.hzm.springdemo.pojo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * 果汁制造商2
 * @author hzm
 */
public class JuiceMaker2 implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {

    private String beverageShop = null;
    /**
     * 果汁配料
     */
    private Source source = null;

    public String makeJuice2(){
        String juice = "这是一杯由"+beverageShop+"饮品店,提供的"+source.getSize()+source.getFruit()+source.getSugar();
        return juice;
    }

    @Override
    public void setBeanName(String s) {
        System.out.println(this.getClass().getName()+"-----"+"setBeanName"+s);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println(this.getClass().getName()+"-----"+"setBeanFactory"+beanFactory);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println(this.getClass().getName()+"-----"+"setApplicationContext"+applicationContext);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(this.getClass().getName()+"-----"+"afterPropertiesSet");

    }

    @Override
    public void destroy() throws Exception {
        System.out.println(this.getClass().getName()+"-----"+"destroy");

    }

    private void init() {
        System.out.println(this.getClass().getName()+"开始自定义的初始化方法");
    }

    private void myDestroy() {
        System.out.println(this.getClass().getName()+"开始自定义的销毁方法");
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
