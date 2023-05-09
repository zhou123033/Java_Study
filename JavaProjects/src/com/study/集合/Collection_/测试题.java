package com.study.集合.Collection_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class 测试题 {
    /**
     * 创建3个Dog {name, age} 对象，放入到ArrayList中，赋给 List 引用
     * 用迭代器和增强for循环两种方式来遍历
     * 重写Dog的toString方法，输出name和age
     */
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Dog("小黑", 3));
        list.add(new Dog("大黄", 100));
        list.add(new Dog("大壮", 8));

        //使用for增强
        for(Object dog : list) {
            System.out.println("dog=" + dog);
        }

        //使用迭代器
        System.out.println();
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object dog = iterator.next();
            System.out.println("dog=" + dog);
        }
    }
}

class Dog {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

}
