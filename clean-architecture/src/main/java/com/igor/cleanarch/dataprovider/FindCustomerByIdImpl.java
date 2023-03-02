package com.igor.cleanarch.dataprovider;

import com.igor.cleanarch.core.domain.Customer;
import com.igor.cleanarch.core.dataprovider.FindCustomerById;
import com.igor.cleanarch.dataprovider.repository.CustomerRepository;
import com.igor.cleanarch.dataprovider.repository.mapper.CustomerEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class FindCustomerByIdImpl implements FindCustomerById {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerEntityMapper customerEntityMapper;

    @Override
    public Optional<Customer> find(String id) {
        var customerEntity = customerRepository.findById(id);
        return customerEntity.map(entity -> customerEntityMapper.toCustomer(entity));
    }

}
