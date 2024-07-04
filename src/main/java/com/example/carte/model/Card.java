package com.example.carte.model;

import jakarta.persistence.*;

@Entity
@Table(name = "card")

public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(name = "color")
    private String color;

    @Column(name = "name")
    private String name;

    @Column(name = "value")
    private int value;

    public Card(){}

    public Card(String color, String name, int value){
        super();
        this.color = color;
        this.name = name;
        this.value = value;
    }

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getValue(){
        return value;
    }

    public void setValue(int value){
        this.value = value;
    }
}
