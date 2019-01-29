package com.aop.evolve.t4;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @program: qh-aop
 * @description: 人代理
 * @author: zhouqi1
 * @create: 2019-01-29 17:41
 **/
public class PersonProxy {

    public static Person getProxy(Person person){
        return (Person)Proxy.newProxyInstance(person.getClass().getClassLoader(), person.getClass().getInterfaces(), new PersonInvocationHandler(person));
    }

    private static class PersonInvocationHandler implements InvocationHandler {

        private Person person;

        public PersonInvocationHandler(Person person) {
            this.person = person;
        }

        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            return method.invoke(person, args);
        }
    }
}
