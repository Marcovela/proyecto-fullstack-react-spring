package com.example.prueba_spring_1.repository;

import com.example.prueba_spring_1.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepo extends JpaRepository<Address, Long> {
}
