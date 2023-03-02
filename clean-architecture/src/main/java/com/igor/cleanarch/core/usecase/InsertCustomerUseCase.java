package com.igor.cleanarch.core.usecase;

import com.igor.cleanarch.core.domain.Customer;

public interface InsertCustomerUseCase {

    void insert(Customer customer, String zipCode);

}
