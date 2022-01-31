package com.example.webprimer.service;

import com.example.webprimer.dto.Customer;

import java.util.List;


public interface CustomerService {

    Iterable<Customer> getAll();

    void save(Customer customer);


}
