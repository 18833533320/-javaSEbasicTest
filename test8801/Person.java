package com.mc.test8801;

import java.util.Scanner;

public class Person {

    private String name;

    private String gender;

    private int age;

    private boolean married;//�涨�ѻ飺false.δ�飺true

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

     //��������ĸ�����Ϣ

    System.out.println("���������������");

    String name=sc.next();

    System.out.println("����������Ա�");

    String gender=sc.next();

    System.out.println("������������䣺");

    int age=sc.nextInt();

    System.out.println("���������ѻ�/false. δ��/true");

    boolean married=sc.nextBoolean();

    if(gender.equals(p.getGender())){

    return "ͬ�Բ��ܽ��";
    
    }
    
    else if(age<22||p.getAge()<20){

    return "δ���������";

    }
    else if(married==false||p.isMarried()==false){

    return "һ���ѻ鲻�ܽ��";

    }

    return null;

    }

public static void main(String[] args) {

    Person p=new Person("���","Ů",32,true);

    System.out.println(marryWith(p));

    }

}