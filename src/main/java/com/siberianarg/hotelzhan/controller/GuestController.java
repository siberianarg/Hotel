package com.siberianarg.hotelzhan.controller;

import com.siberianarg.hotelzhan.Dto.RequestGuestDto;
import com.siberianarg.hotelzhan.Dto.ResponseGuestDto;
import com.siberianarg.hotelzhan.service.GuestService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("api/v1/guest") // начало endpoint
@RequiredArgsConstructor
public class GuestController {
    @Autowired
    private GuestService guestService;

    @PostMapping("add")
    private void add(@RequestBody RequestGuestDto requestGuestDto) {
        guestService.add(requestGuestDto);
    }

    @GetMapping("getAll")
    private List<ResponseGuestDto> getAll() {
        return guestService.getAll();
    }

}
