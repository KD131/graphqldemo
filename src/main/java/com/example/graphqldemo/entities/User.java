package com.example.graphqldemo.entities;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @NonNull
    @Column(name = "first_name", nullable = false, length = 50)
    private String firstName;

    @NonNull
    @Column(name = "last_name", nullable = false, length = 50)
    private String lastName;

    @NonNull
    @Column(name = "email", nullable = false, length = 50)
    private String email;
}