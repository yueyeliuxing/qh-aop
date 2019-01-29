package com.aop.evolve.t2;

/**
 * @program: qh-aop
 * @description: 认类
 * @author: zhouqi1
 * @create: 2019-01-29 17:29
 **/
public class Person {

    /**
     * 吃饭
     * @param num 数量
     */
    public void eat(int num){

        System.out.println("this person start eat !");

        System.out.println(String.format("this person eat %s catty feed", num));

        System.out.println("this person end eat !");
    }

    /**
     * 睡觉
     * @param time 时间
     */
    public void sleep(int time){
        System.out.println("this person start sleep !");

        System.out.println(String.format("this person sleep %s day", time));

        System.out.println("this person end sleep !");
    }
}
