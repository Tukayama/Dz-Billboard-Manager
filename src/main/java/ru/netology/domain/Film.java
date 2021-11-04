package ru.netology.domain;


import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Film {


    private int id;
    private String name;
    private String type;
    private boolean premiereIs;


}
