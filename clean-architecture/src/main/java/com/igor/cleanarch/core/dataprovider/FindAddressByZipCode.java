package com.igor.cleanarch.core.dataprovider;

import com.igor.cleanarch.core.domain.Address;

public interface FindAddressByZipCode {

    Address find(final String zipCode);

}
