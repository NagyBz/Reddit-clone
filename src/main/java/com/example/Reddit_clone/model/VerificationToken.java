package com.example.Reddit_clone.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;


import javax.persistence.*;
import java.time.Instant;

import static javax.persistence.GenerationType.IDENTITY;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name= "token")
public class VerificationToken {
    @javax.persistence.Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    private String Token;

    @OneToOne(fetch = FetchType.LAZY)
    private User user;
    private Instant expiryDate;

}
