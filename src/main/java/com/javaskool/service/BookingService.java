/**
 * 
 */
package com.javaskool.service;

import java.util.List;

import com.javaskool.model.booking.Booking;

public interface BookingService {

	List<Booking> findUserBookings(String emailId);
}
