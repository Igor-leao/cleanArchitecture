package com.igor.cleanarch.core.dataprovider;

import com.igor.cleanarch.core.domain.Customer;

import java.util.Optional;

public interface FindCustomerById {

    Optional<Customer> find(final String id);

}
