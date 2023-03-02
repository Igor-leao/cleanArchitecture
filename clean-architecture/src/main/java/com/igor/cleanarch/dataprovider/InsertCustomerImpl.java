package com.igor.cleanarch.dataprovider;

import com.igor.cleanarch.core.domain.Customer;
import com.igor.cleanarch.core.dataprovider.InsertCustomer;
import com.igor.cleanarch.dataprovider.repository.CustomerRepository;
import com.igor.cleanarch.dataprovider.repository.mapper.CustomerEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InsertCustomerImpl implements InsertCustomer {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerEntityMapper customerEntityMapper;

    @Override
    public void insert(Customer customer) {
        var customerEntity = customerEntityMapper.toCustomerEntity(customer);
        customerRepository.save(customerEntity);
    }

}
