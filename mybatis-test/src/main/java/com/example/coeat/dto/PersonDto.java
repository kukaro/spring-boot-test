package com.example.coeat.dto;

public class PersonDto {
    private final int no;
    private final String name;
    private final String id;

    public PersonDto(int no, String name, String id) {
        this.no = no;
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "PersonDto{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
