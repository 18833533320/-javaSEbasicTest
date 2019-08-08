package com.mc.test8801;

import java.util.Scanner;

public class Person {

    private String name;

    private String gender;

    private int age;

    private boolean married;//规定已婚：false.未婚：true

public String getName() {

    return name;

    }

public void setName(String name) {

    this.name = name;

    }

public String getGender() {

    return gender;

    }

public void setGender(String gender) {

    this.gender = gender;

    }

public int getAge() {

    return age;

    }

public void setAge(int age) {

    this.age = age;

    }

public boolean isMarried() {

    return married;

    }

public void setMarried(boolean married) {

    this.married = married;

    }

public Person(String name,String gender,int age,boolean married){

    this.name=name;

    this.age=age;

    this.gender=gender;

    this.married=married;

    }

public static String marryWith(Person p){

     Scanner sc=new Scanner(System.in);

     //这里是你的个人信息

    System.out.println("请输入你的姓名：");

    String name=sc.next();

    System.out.println("请输入你的性别");

    String gender=sc.next();

    System.out.println("请输入你的年龄：");

    int age=sc.nextInt();

    System.out.println("请输入婚否：已婚/false. 未婚/true");

    boolean married=sc.nextBoolean();

    if(gender.equals(p.getGender())){

    return "同性不能结婚";
    
    }
    
    else if(age<22||p.getAge()<20){

    return "未到结婚年龄";

    }
    else if(married==false||p.isMarried()==false){

    return "一方已婚不能结婚";

    }

    return null;

    }

public static void main(String[] args) {

    Person p=new Person("凤姐","女",32,true);

    System.out.println(marryWith(p));

    }

}