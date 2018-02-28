package com.mr.test;

public class Woman {
    private String name;
    private String age;
    public Woman(String name, String age) {

        this.name=name;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void printMessage(){
        System.out.println("name="+this.name);
        System.out.println("age="+this.age);
    }

    public static void main(String[] args) {
        Woman woman = new Woman("xiaozhou","18");
        woman.printMessage();
    }

}