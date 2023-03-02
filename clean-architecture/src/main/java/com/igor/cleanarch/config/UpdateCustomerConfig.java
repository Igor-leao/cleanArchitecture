package com.igor.cleanarch.config;

import com.igor.cleanarch.core.usecase.impl.FindCustomerByIdUseCaseImpl;
import com.igor.cleanarch.core.usecase.impl.UpdateCustomerUseCaseImpl;
import com.igor.cleanarch.dataprovider.FindAddressByZipCodeImpl;
import com.igor.cleanarch.dataprovider.UpdateCustomerImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UpdateCustomerConfig {

    @Bean
    public UpdateCustomerUseCaseImpl updateCustomerUseCase(
            FindCustomerByIdUseCaseImpl findCustomerByIdUseCase,
            FindAddressByZipCodeImpl findAddressByZipCode,
            UpdateCustomerImpl updateCustomer

    ) {
        return new UpdateCustomerUseCaseImpl(findCustomerByIdUseCase, findAddressByZipCode, updateCustomer);
    }

}
