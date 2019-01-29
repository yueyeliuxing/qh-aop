package com.aop.evolve.t1;

/**
 * @program: qh-aop
 * @description: 认类
 * @author: zhouqi1
 * @create: 2019-01-29 17:29
 **/
public interface Person {

    /**
     * 吃饭
     * @param num 数量
     */
    void eat(int num);

    /**
     * 睡觉
     * @param time 时间
     */
    void sleep(int time);
}
