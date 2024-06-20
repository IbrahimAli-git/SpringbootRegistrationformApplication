package com.app.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "customers")
public class Customer {
    private int id;
    @Id
    private LocalDate registered;
    private String email_address;
    private String title;
    private String first_name;
    private String last_name;
    private String address_line_1;
    private String address_line_2;
    private String city;
    private String postcode;
    private String phone_number;
}
