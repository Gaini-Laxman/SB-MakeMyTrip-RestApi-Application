package com.klinnovations.response;

public class Ticket {

	private Integer ticketNum;

	private String status;

	private Double ticketCost;

	private String name;

	private String from;

	private String to;

	private String doj;

	private String trainNumber;

	private String trainName;

	public Ticket() {

	}

	public Ticket(Integer ticketNum, String status, Double ticketCost, String name, String from, String to, String doj,
			String trainNumber, String trainName) {
		super();
		this.ticketNum = ticketNum;
		this.status = status;
		this.ticketCost = ticketCost;
		this.name = name;
		this.from = from;
		this.to = to;
		this.doj = doj;
		this.trainNumber = trainNumber;
		this.trainName = trainName;
	}

	public Integer getTicketNum() {
		return ticketNum;
	}

	public void setTicketNum(Integer ticketNum) {
		this.ticketNum = ticketNum;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Double getTicketCost() {
		return ticketCost;
	}

	public void setTicketCost(Double ticketCost) {
		this.ticketCost = ticketCost;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getDoj() {
		return doj;
	}

	public void setDoj(String doj) {
		this.doj = doj;
	}

	public String getTrainNumber() {
		return trainNumber;
	}

	public void setTrainNumber(String trainNumber) {
		this.trainNumber = trainNumber;
	}

	public String getTrainName() {
		return trainName;
	}

	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}

}
