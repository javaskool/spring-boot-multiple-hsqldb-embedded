package com.javaskool.booking.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.javaskool.model.booking.Booking;

public interface BookingDao extends CrudRepository<Booking, Long> {
	
	List<Booking> findByCreatedBy(Long userId);

}
