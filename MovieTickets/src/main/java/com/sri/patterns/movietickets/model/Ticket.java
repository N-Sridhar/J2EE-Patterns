package com.sri.patterns.movietickets.model;

public class Ticket {
	private int id;
	private String movie;
	private String screen;
	private String seat;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMovie() {
		return movie;
	}

	public void setMovie(String movie) {
		this.movie = movie;
	}

	public String getScreen() {
		return screen;
	}

	public void setScreen(String screen) {
		this.screen = screen;
	}

	public String getSeat() {
		return seat;
	}

	public void setSeat(String seat) {
		this.seat = seat;
	}

	@Override
	public String toString() {
		return "Ticket Model [id=" + id + ", movie=" + movie + ", screen=" + screen + ", seat=" + seat + "]";
	}
}
