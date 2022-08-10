package com.dorr.dev.pattern.princple.structure.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JDKProxy {


    private Object target;

    public JDKProxy(Object target) {
        this.target = target;
    }


    private void beforeDynamic(){

        System.out.println("====================");
    }


    private void afterGynamic(){
        System.out.println("====================");
        System.out.println();
    }

    public Object getProxyInstance() {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(),
                new InvocationHandler() {  //实现InvocationHandler接口
                    @Override
                    //重写invoke方法
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        beforeDynamic();
                        Object invoke = method.invoke(target, args);
                        afterGynamic();
                        return invoke;
                    }
                });


    }}
