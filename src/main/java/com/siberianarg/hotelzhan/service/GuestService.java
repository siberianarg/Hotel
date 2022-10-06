package com.siberianarg.hotelzhan.service;

import com.siberianarg.hotelzhan.Dto.RequestGuestDto;
import com.siberianarg.hotelzhan.entity.Guest;
import com.siberianarg.hotelzhan.repository.GuestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GuestService {

    @Autowired
    private GuestRepository guestRepository; // DI


    public Void create(RequestGuestDto requestGuestDto) {
        Guest guest = new Guest();
        guest.setFirstName(requestGuestDto.getFirstName());
        guest.setLastName(requestGuestDto.getLastName());
        guest.setSecondName(requestGuestDto.getSecondName());
        guest.setStartTime(requestGuestDto.getStartTime());
        guest.setEndTime(requestGuestDto.getEndTime());

        guestRepository.save(guest);
        return null;
    }
}
