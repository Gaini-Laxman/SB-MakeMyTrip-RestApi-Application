package com.klinnovations.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.klinnovations.request.Passenger;
import com.klinnovations.response.Ticket;

@Service
public class MakeMyTripServiceImpl implements MakeMyTripService {

	private static final String BOOK_TICKET_URL = "http://localhost:8080/ticket";
	private static final String GET_TICKET_URL = "http://localhost:8080/ticket/{ticketNum}";

	private final WebClient webClient;

	public MakeMyTripServiceImpl(WebClient.Builder webClientBuilder) {
		this.webClient = webClientBuilder.baseUrl("http://localhost:8080").build();
	}

	@Override
	public Ticket bookTicket(Passenger passenger) {
		ResponseEntity<Ticket> respEntity = webClient.post().uri(BOOK_TICKET_URL).bodyValue(passenger).retrieve()
				.toEntity(Ticket.class).block();

		return respEntity.getBody();
	}

	@Override
	public Ticket getTicketByNum(Integer ticketNumber) {
		ResponseEntity<Ticket> respEntity = webClient.get().uri(GET_TICKET_URL, ticketNumber).retrieve()
				.toEntity(Ticket.class).block();

		return respEntity.getBody();
	}
}
