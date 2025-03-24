package com.example.prueba_spring_1.service.interf;

import com.example.prueba_spring_1.dto.AddressDto;
import com.example.prueba_spring_1.dto.Response;

public interface AddressService {
    Response saveAndUpdateAddress(AddressDto addressDto);
}
