package com.siberianarg.hotelzhan.service;

import com.siberianarg.hotelzhan.Dto.RequestGuestDto;
import com.siberianarg.hotelzhan.Dto.ResponseGuestDto;
import com.siberianarg.hotelzhan.entity.Guest;
import com.siberianarg.hotelzhan.repository.GuestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GuestService {

    @Autowired
    private GuestRepository guestRepository; // DI

    public void add(RequestGuestDto requestGuestDto) {
        Guest guest = new Guest();
//        guest.setId();
        guest.setStartTime(requestGuestDto.getStartTime());
        guest.setEndTime(requestGuestDto.getEndTime());
        guest.setFirstName(requestGuestDto.getFirstName());
        guest.setSecondName(requestGuestDto.getSecondName());
        guest.setLastName(requestGuestDto.getLastName());

        if ("Antoha".equals(requestGuestDto.getFirstName())) {
            throw new RuntimeException("Antoha ashole");
        }

        guestRepository.save(guest);


    }

    public List<ResponseGuestDto> getAll() {


        List<Guest> guests = guestRepository.findAll();
        List<ResponseGuestDto> responseGuestDtos = new ArrayList<>();
        for (int i = 0; i < guests.size(); i++) {
            Guest guest = guests.get(i);
            ResponseGuestDto responseGuestDto = new ResponseGuestDto();
            responseGuestDto.setId(guest.getId());
            responseGuestDto.setStartTime(guest.getStartTime());
            responseGuestDto.setEndTime(guest.getEndTime());
            responseGuestDto.setFirstName(guest.getFirstName());
            responseGuestDto.setSecondName(guest.getSecondName());
            responseGuestDto.setLastName(guest.getLastName());


            responseGuestDtos.add(responseGuestDto);

        }

        return responseGuestDtos;


    }
}
