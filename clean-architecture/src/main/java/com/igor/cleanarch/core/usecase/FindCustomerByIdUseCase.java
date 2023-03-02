package com.igor.cleanarch.core.usecase;

import com.igor.cleanarch.core.domain.Customer;

public interface FindCustomerByIdUseCase {

    Customer find(final String id);

}
