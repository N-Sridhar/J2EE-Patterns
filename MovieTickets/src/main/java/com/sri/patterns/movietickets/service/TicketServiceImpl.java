package com.sri.patterns.movietickets.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sri.patterns.movietickets.dao.TicketDao;
import com.sri.patterns.movietickets.bo.Ticket;

@Service
public class TicketServiceImpl implements TicketService {

	@Autowired
	private TicketDao dao;

	@Override
	public void purchaseTicket(Ticket ticket) {
		System.out.println(ticket.toString());
		com.sri.patterns.movietickets.model.Ticket ticketEntity = new com.sri.patterns.movietickets.model.Ticket();
		ticketEntity.setId(ticket.getId());
		ticketEntity.setMovie(ticket.getMovieName());
		ticketEntity.setScreen(ticket.getScreenNo());
		ticketEntity.setSeat(ticket.getSeatNo());
		dao.create(ticketEntity);
	}

}
