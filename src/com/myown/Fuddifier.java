package com.myown;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.reflect.Field;

public class Fuddifier implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        return o;
    }

    @Override
    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        Field[]  fields = o.getClass().getDeclaredFields();
        try {
            for (int i =0; i<fields.length;  i++){
                if (fields[i].getType().equals(java.lang.String.class)){
                    fields[i].setAccessible(true);
                    String original = (String) fields[i].get(o);
                    fields[i].set(o, fuddify(original));

                }
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return o;
    }
    private String fuddify(String orig){
        if (orig == null) return orig;
        return orig.replaceAll("(r|l)", "w").replaceAll("(R|L)","W");
    }
}
