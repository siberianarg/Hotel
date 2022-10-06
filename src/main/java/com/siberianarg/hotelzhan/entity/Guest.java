package com.siberianarg.hotelzhan.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity; //
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.Instant;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
public class Guest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // будет инкрементить - автоинкремент
    private Long id;

    private Instant startTime;

    private Instant endTime;

    private String firstName;

    private String secondName;

    private String lastName;
}
