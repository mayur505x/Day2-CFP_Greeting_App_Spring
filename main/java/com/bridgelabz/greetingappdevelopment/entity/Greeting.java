package com.bridgelabz.greetingappdevelopment.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Data
@AllArgsConstructor
@Table(name = "Greeting_Table")
public class Greeting {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    private String message;

    public Greeting() {

    }
}