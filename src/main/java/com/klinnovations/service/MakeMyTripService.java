package com.klinnovations.service;

import com.klinnovations.request.Passenger;
import com.klinnovations.response.Ticket;

public interface MakeMyTripService {
	public Ticket bookTicket(Passenger passenger);

	public Ticket getTicketByNum(Integer ticketNumber);
}
