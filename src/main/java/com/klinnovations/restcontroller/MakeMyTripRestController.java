package com.klinnovations.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.klinnovations.request.Passenger;
import com.klinnovations.response.Ticket;
import com.klinnovations.service.MakeMyTripService;

@RestController
@RequestMapping("/api")
public class MakeMyTripRestController {

    @Autowired
    private MakeMyTripService service;

    @GetMapping("/get-ticket")
    public ResponseEntity<Ticket> getTicketForm(@RequestParam Integer ticketNum) {
        Ticket ticketByNum = service.getTicketByNum(ticketNum);
        if (ticketByNum != null) {
            return ResponseEntity.ok(ticketByNum);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/ticket")
    public ResponseEntity<Ticket> getEmptyTicketForm() {
        return ResponseEntity.ok(new Ticket());
    }

    @PostMapping("/book-ticket")
    public ResponseEntity<String> bookTicket(@RequestBody Passenger passenger) {
        Ticket ticket = service.bookTicket(passenger);
        String message = "Your Ticket Booked With Id: " + ticket.getTicketNum();
        return ResponseEntity.status(HttpStatus.CREATED).body(message);
    }

    @GetMapping("/")
    public ResponseEntity<Passenger> loadForm() {
        return ResponseEntity.ok(new Passenger());
    }
}
