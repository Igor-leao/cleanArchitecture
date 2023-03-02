package com.igor.cleanarch.dataprovider.client.mapper;

import com.igor.cleanarch.core.domain.Address;
import com.igor.cleanarch.dataprovider.client.response.AddressResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {

    Address toAddress(AddressResponse addressResponse);

}
