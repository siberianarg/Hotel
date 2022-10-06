package com.siberianarg.hotelzhan.controller;

import com.siberianarg.hotelzhan.Dto.RequestGuestDto;
import com.siberianarg.hotelzhan.service.GuestService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("api/v1/guest") // начало endpoint
@RequiredArgsConstructor
public class GuestController {
    @Autowired
    private GuestService guestService;

    @PostMapping("add")
    private Void add(@RequestBody RequestGuestDto requestGuestDto) {

        return guestService.create(requestGuestDto);
    }
}
