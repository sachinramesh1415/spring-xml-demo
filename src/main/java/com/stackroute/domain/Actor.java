package com.stackroute.domain;

import java.util.UUID;

public class Actor {
    private int actorId;
    private String name;
    private String gender;
    private int age;
    public Actor() {
        UUID idOne = UUID.randomUUID();
        String str=""+idOne;
        int uid=str.hashCode();
        String filterStr=""+uid;
        str=filterStr.replaceAll("-", "");
        this.actorId = Integer.parseInt(str);
    }
    public int getActorId() {
        return actorId;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getGender() {
        return gender;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
}
