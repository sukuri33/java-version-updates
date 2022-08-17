package com.learngenerics.customgenerics;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @param <T> Type - any type
 * extends Player - reducing the type acceptance scope to Player and its subclass only
 * Otherwise, this class will accept other object types from classes like String/Integer/Apple/Animal
 */
public class Team<T extends Player> {
    private String name;
    private List<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player){

        if (members.contains(player)){
            System.out.println(((Player)player).getName()+" is already in the team");
            return false;
        }else{
            members.add(player);
            System.out.println(((Player)player).getName()+" is added to "+ name +" team");
            return true;
        }
    }
}
