package com.aop.evolve.t1;

/**
 * @program: qh-aop
 * @description: 认类
 * @author: zhouqi1
 * @create: 2019-01-29 17:29
 **/
public class ZqPerson implements Person {

    /**
     * 吃饭
     * @param num 数量
     */
    public void eat(int num){
        System.out.println(String.format("this person eat %s catty feed", num));
    }

    /**
     * 睡觉
     * @param time 时间
     */
    public void sleep(int time){
        System.out.println(String.format("this person sleep %s day", time));
    }
}
