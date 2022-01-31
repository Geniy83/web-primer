package com.example.webprimer.cotroller;

import com.example.webprimer.dao.CustomerRepository;
import com.example.webprimer.dto.Customer;
import com.example.webprimer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/customer")
@CrossOrigin()
public class CustomerRestController {

    private final CustomerService customerService;

    @Autowired
    public CustomerRestController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    public Iterable<Customer> findAll() {
        return customerService.getAll();
    }

    @PostMapping()
    public Customer save(@RequestBody Customer customer) {
        customerService.save(customer);
        System.out.println(customer.toString());
        return customer;
    }

}
