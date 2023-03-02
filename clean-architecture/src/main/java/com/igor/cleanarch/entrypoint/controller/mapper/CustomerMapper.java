package com.igor.cleanarch.entrypoint.controller.mapper;

import com.igor.cleanarch.core.domain.Customer;
import com.igor.cleanarch.entrypoint.controller.request.CustomerRequest;
import com.igor.cleanarch.entrypoint.controller.response.CustomerResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "address", ignore = true)
    @Mapping(target = "isValidCpf", ignore = true)
    Customer toCustomer(CustomerRequest customerRequest);

    CustomerResponse toCustomerResponse(Customer customer);

}
