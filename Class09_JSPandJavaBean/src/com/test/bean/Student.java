package com.test.bean;

import java.util.Date;

/**
 * @author XiaLuo
 * @version 1.0
 * @date 2023/11/24 15:26
 */
public class Student {
    private String name;
    private int age;
    private Date birthday;
    private boolean married;
    private String[] hobby;

    public Student(String name, int age, Date birthday, boolean married, String[] hobby) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
        this.married = married;
        this.hobby = hobby;
    }

    public Student() {
    }

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

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    public String[] getHobby() {
        return hobby;
    }

    public void setHobby(String[] hobby) {
        this.hobby = hobby;
    }
}
