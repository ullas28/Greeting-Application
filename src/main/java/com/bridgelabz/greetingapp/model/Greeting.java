package com.bridgelabz.greetingapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;


@Entity
@Table(name = "Greeting")
@Getter
@AllArgsConstructor

public class Greeting {

    @Id
    @Column(name = "id",nullable = false)

    private final long id;

    private final String message;

    public Greeting(){
        id = 0;
        message = "";
    }
}
