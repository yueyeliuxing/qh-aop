package com.aop.evolve.t2;

/**
 * @program: qh-aop
 * @description: 家
 * @author: zhouqi1
 * @create: 2019-01-29 17:32
 **/
public class Home {

    public Person person;

    public Home() {
        person = new Person();
    }

    public static void main(String[] args) {
        Home home = new Home();
        home.person.eat(5);
        home.person.sleep(5);
    }
}
