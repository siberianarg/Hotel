package com.siberianarg.hotelzhan.Dto;

import lombok.Data;

import java.time.Instant;

@Data
public class RequestGuestDto {

    private Instant startTime;

    private Instant endTime;

    private String firstName;

    private String secondName;

    private String lastName;
}
