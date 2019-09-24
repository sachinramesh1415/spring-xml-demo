package com.stackroute.domain;

public class Movie {
    private Actor actor;
    public void setActor(Actor actor) {
        this.actor = actor;
    }
    public void display() {
        System.out.println("Actor: " + actor.getName());
        System.out.println("Gender: " + actor.getGender());
        System.out.println("Age: " + actor.getAge());
    }
}
