package com.example.prueba_spring_1.service.impl;

import com.example.prueba_spring_1.dto.AddressDto;
import com.example.prueba_spring_1.dto.Response;
import com.example.prueba_spring_1.entity.Address;
import com.example.prueba_spring_1.entity.User;
import com.example.prueba_spring_1.repository.AddressRepo;
import com.example.prueba_spring_1.service.interf.AddressService;
import com.example.prueba_spring_1.service.interf.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AddressServiceImpl implements AddressService {
    // implements se usa para relaciona clase con una o mas interfaces
    private final AddressRepo addressRepo;
    private final UserService userService;

    @Override
    public Response saveAndUpdateAddress(AddressDto addressDto) {
        User user = userService.getLoginUser();
        Address address = user.getAddress();

        if (address == null) {
            address = new Address();
            address.setUser(user);
        }
        if (addressDto.getStreet() != null)
            address.setStreet(addressDto.getStreet());
        if (addressDto.getCity() != null)
            address.setCity(addressDto.getCity());
        if (addressDto.getState() != null)
            address.setState(addressDto.getState());
        if (addressDto.getZipCode() != null)
            address.setZipCode(addressDto.getZipCode());
        if (addressDto.getCountry() != null)
            address.setCountry(addressDto.getCountry());

        addressRepo.save(address);

        String message = (user.getAddress() == null) ? "Address successfully created" : "Address successfully updated";
        return Response.builder()
                .status(200)
                .message(message)
                .build();
    }
}
