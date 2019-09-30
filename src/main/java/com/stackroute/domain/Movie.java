package com.stackroute.domain;

public class Movie {
    private Actor actor;
    public void setActor(Actor actor) {
        this.actor = actor;
    }
    public String getActorDetails() {
        System.out.println("Actor: " + actor.getName());
        System.out.println("Gender: " + actor.getGender());
        System.out.println("Age: " + actor.getAge());
        return actor.getName() + "," + actor.getAge() + "," + actor.getGender();
    }
}
