package com.igor.cleanarch.dataprovider.repository.mapper;

import com.igor.cleanarch.core.domain.Customer;
import com.igor.cleanarch.dataprovider.repository.entity.CustomerEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {

    CustomerEntity toCustomerEntity(Customer customer);

    Customer toCustomer(CustomerEntity customerEntity);

}
