package com.example.FlightServices.Service;

import com.example.FlightServices.Model.Booking;
import com.example.FlightServices.Repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class BookingService {
    @Autowired
    private BookingRepository bookingRepository;

    public Booking createBooking(Booking booking) {
        booking.setBookingDate(LocalDateTime.now());
        booking.setStatus("BOOKED");
        return bookingRepository.save(booking);
    }

    public Booking getBooking(Long id) {
        return bookingRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Booking not found"));
    }

    public List<Booking> getAllBookings(String email) {
        return bookingRepository.findByEmail(email);
    }

    public Booking cancelBooking(Long id) {
        Booking booking = getBooking(id);
        booking.setStatus("CANCELLED");
        return bookingRepository.save(booking);
    }
}
