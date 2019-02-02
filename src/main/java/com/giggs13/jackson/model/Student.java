package com.giggs13.jackson.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class Student {

    private int id;
    private String firstName;
    private String lastName;
    private boolean active;
    private Address address;
    private String[] languages;

    @Getter
    @Setter
    @NoArgsConstructor
    @ToString
    private static class Address {

        private String street;
        private String city;
        private String state;
        private String zip;
        private String country;
    }
}
