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
    @Id
    private int id;
    private LocalDate registered = LocalDate.now();
    private String email_address;
    private String title;
    private String first_name;
    private String last_name;
    private String address_line_1;
    private String address_line_2;
    private String city;
    private String postcode;
    private String phone_number;


    @Override
    public String toString() {
        return "Customer{" +
                "email_address='" + email_address + '\'' +
                ", title='" + title + '\'' +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", address_line_1='" + address_line_1 + '\'' +
                ", address_line_2='" + address_line_2 + '\'' +
                ", city='" + city + '\'' +
                ", postcode='" + postcode + '\'' +
                ", phone_number='" + phone_number + '\'' +
                '}';
    }
}
