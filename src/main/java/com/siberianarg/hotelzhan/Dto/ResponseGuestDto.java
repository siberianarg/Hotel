package com.siberianarg.hotelzhan.Dto;

import lombok.Data;

import java.time.Instant;

@Data
public class ResponseGuestDto {

    private Long id;

    private Instant startTime;

    private Instant endTime;

    private String firstName;

    private String secondName;

    private String lastName;
}
