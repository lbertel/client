package com.ps.apps.clients.domain;

import java.util.Objects;

public final class Client {

    private final String id;
    private final String dni;
    private final String name;
    private final String surname;
    private final Integer age;
    private final String address;

    public Client(String id, String dni, String name, String surname, Integer age, String address) {
        this.id = id;
        this.dni = dni;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public String getDni() {
        return dni;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Integer getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(id, client.id) &&
            Objects.equals(dni, client.dni) &&
            Objects.equals(name, client.name) &&
            Objects.equals(surname, client.surname) &&
            Objects.equals(age, client.age) &&
            Objects.equals(address, client.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, dni, name, surname, age, address);
    }
}
