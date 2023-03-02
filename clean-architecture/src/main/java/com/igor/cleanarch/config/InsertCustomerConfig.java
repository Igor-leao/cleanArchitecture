package com.igor.cleanarch.config;

import com.igor.cleanarch.core.usecase.impl.InsertCustomerUseCaseImpl;
import com.igor.cleanarch.dataprovider.FindAddressByZipCodeImpl;
import com.igor.cleanarch.dataprovider.InsertCustomerImpl;
import com.igor.cleanarch.dataprovider.SendCpfForValidationImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertCustomerConfig {

    @Bean
    public InsertCustomerUseCaseImpl insertCustomerUseCase(
            FindAddressByZipCodeImpl findAddressByZipCode,
            InsertCustomerImpl insertCustomer,
            SendCpfForValidationImpl sendCpfForValidation
    ) {
        return new InsertCustomerUseCaseImpl(findAddressByZipCode, insertCustomer, sendCpfForValidation);
    }

}
