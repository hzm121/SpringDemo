package com.hzm.springdemo.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * bean的后置处理器实现
 * @author hzm
 */
public class BeanPostProcessorImp implements BeanPostProcessor
{
    @Override
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        System.out.println(o.getClass().getName()+"---"+s+"开始实例化");
        return o;
    }

    @Override
    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        System.out.println(o.getClass().getName()+"----"+s+"完成实例化");
        return o;

    }
}
