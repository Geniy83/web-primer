package com.example.webprimer.dto;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.Optional;

@Entity
//@Table(name="customer", schema = "public")
public class Customer {

    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long customer_id;

    @NotBlank
    private String first_name, last_name, phone;

    @Email
    private String email;

    public Customer() {
    }

    public Customer(Long customer_id, String first_name, String last_name, String phone, String email) {
        this.customer_id = customer_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.phone = phone;
        this.email = email;
    }

    public Long getCustomerId() {
        return customer_id;
    }

    public void setCustomerId(Long customer_id) {
        this.customer_id = customer_id;
    }

    public String getFirstName() {
        return first_name;
    }

    public void setFirstName(String first_name) {
        this.first_name = first_name;
    }

    public String getLastName() {
        return last_name;
    }

    public void setLastName(String last_name) {
        this.last_name = last_name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
