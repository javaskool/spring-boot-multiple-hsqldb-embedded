/**
 * 
 */
package com.javaskool.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaskool.booking.dao.BookingDao;
import com.javaskool.model.booking.Booking;
import com.javaskool.model.user.UserDetails;
import com.javaskool.service.BookingService;
import com.javaskool.user.dao.UserDao;

@Service
public class BookingServiceImpl implements BookingService {
	
	@Autowired
	private UserDao userDao;
	
	@Autowired
	private BookingDao bookingDao;

	public List<Booking> findUserBookings(String emailId) {
		UserDetails userdetails = userDao.findByEmail(emailId);
		List<Booking> bookings = bookingDao.findByCreatedBy(userdetails.getId());
		return bookings;
	}
}
