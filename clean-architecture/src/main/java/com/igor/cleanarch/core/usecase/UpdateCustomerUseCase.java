package com.igor.cleanarch.core.usecase;

import com.igor.cleanarch.core.domain.Customer;

public interface UpdateCustomerUseCase {

    void update(Customer customer, String zipCode);

}
