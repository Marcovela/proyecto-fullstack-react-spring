package com.example.prueba_spring_1.entity;

import com.example.prueba_spring_1.enums.UserRole;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity // clase es una entidad JPA que se mapeará a una tabla en la base de datos.
@Table(name = "users") //Especifica el nombre de la tabla en la base de datos
@Builder
@AllArgsConstructor // genera un constructor con todos los parametros
@NoArgsConstructor // genera un constructor sin parametros
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // la clave o campo principal se generara automaticamente en la base de datos
    private Long id;

    @NotBlank(message = "Name is required")
    private String name;

    @Column(unique = true)
    @NotBlank(message = "Email is required")
    private String email;

    @NotBlank(message = "Password number is required")
    private String password;

    @Column(name = "phone_number")
    @NotBlank(message = "Phone number is required")
    private  String phoneNumber;

    private UserRole role;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<OrderItem> orderItemList;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "user")
    private Address address;

    @Column(name = "created_at")
    private final LocalDateTime createdAt = LocalDateTime.now();
}
