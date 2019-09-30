package com.stackroute.domain;

import java.util.UUID;

public class Movie {
    private int movieId;
    private Actor actor;
    public Movie() {
        UUID idOne = UUID.randomUUID();
        String str=""+idOne;
        int uid=str.hashCode();
        String filterStr=""+uid;
        str=filterStr.replaceAll("-", "");
        this.movieId = Integer.parseInt(str);
    }
    public void setActor(Actor actor) {
        this.actor = actor;
    }
    public int getMovieId() {
        return movieId;
    }
    public String getActorDetails() {
        System.out.println("Actor: " + actor.getName());
        System.out.println("Gender: " + actor.getGender());
        System.out.println("Age: " + actor.getAge());
        return actor.getName() + "," + actor.getAge() + "," + actor.getGender();
    }
}
