package com.aop.evolve.t3;

/**
 * @program: qh-aop
 * @description: 认类
 * @author: zhouqi1
 * @create: 2019-01-29 17:29
 **/
public class Person {

    private Servant servant;

    public Person() {
        servant = new Servant();
    }

    /**
     * 吃饭
     * @param num 数量
     */
    public void eat(int num){

        servant.broadcastStartEat();

        System.out.println(String.format("this person eat %s catty feed", num));

        servant.broadcastEndEat();
    }

    /**
     * 睡觉
     * @param time 时间
     */
    public void sleep(int time){
        servant.broadcastStartSleep();

        System.out.println(String.format("this person sleep %s day", time));

        servant.broadcastEndSleep();
    }
}
