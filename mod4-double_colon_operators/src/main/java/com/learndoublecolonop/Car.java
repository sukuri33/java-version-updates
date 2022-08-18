package com.learndoublecolonop;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Car {

    private String make;
    private int model;

    public Car(int model) {
        this.model = model;
    }

}
