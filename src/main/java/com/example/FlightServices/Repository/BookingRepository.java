package com.example.FlightServices.Repository;

import com.example.FlightServices.Model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookingRepository extends JpaRepository<Booking, Long>{
    List<Booking> findByEmail(String email);
}
