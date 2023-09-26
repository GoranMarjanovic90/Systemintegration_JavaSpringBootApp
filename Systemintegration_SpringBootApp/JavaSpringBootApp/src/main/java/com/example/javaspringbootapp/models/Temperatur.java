package com.example.javaspringbootapp.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Temperatur {
    @Id
    @GeneratedValue
    protected Long id;

    protected String temp;

    //protected Timestamp datum;
    protected String datum;

}
