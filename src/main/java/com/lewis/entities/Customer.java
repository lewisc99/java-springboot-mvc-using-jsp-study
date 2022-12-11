package com.lewis.entities;

import org.springframework.beans.factory.annotation.Required;

import javax.validation.constraints.*;
import java.io.Serializable;
import java.sql.Driver;

public class Customer implements Serializable {

    private static final long serialVersionUID = 1L;


    private String firstName;



    @NotNull(message="is required")
    @Size(min=1, message = "Size must be at least 1")
    private String lastName;


    @Min(value = 0, message = "must be greater than or equal to zero")
    @Max(value = 10, message = "must be less than or equal to 10")
    private  int freePasses;


    @Pattern(regexp="^[a-zA-Z0-9]{5}",message="only 5 char/digits")
    @NotNull(message = "is required")
    private  String postalCode;

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

    public int getFreePasses() {
        return freePasses;
    }

    public void setFreePasses(int freePasses) {
        this.freePasses = freePasses;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
}

