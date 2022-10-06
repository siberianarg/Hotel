package com.siberianarg.hotelzhan.repository;

import com.siberianarg.hotelzhan.entity.Guest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuestRepository extends JpaRepository<Guest, Long> {

}
