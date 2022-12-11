package com.lewis.entities;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

public class Customer implements Serializable {

    private static final long serialVersionUID = 1L;


    private String firstName;



    @NotNull(message="is required")
    @Size(min=1, message = "Size must be at least 1")
    private String lastName;



    public Customer() {


    }


    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}

