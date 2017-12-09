package DataLinkLayer;

import java.time.LocalDateTime;

public class Shift {
	private int id;
	private Cashier cashier;
	private Station station;
	private double startingBalance;
	private double endingBalance;
	private LocalDateTime startingDate;
	private LocalDateTime endingDate;
	
	public double getEndingBalance() {
		return endingBalance;
	}
	public void setEndingBalance(double endingBalance) {
		this.endingBalance = endingBalance;
	}
	public LocalDateTime getEndingDate() {
		return endingDate;
	}
	public void setEndingDate(LocalDateTime endingDate) {
		this.endingDate = endingDate;
	}
	public int getId() {
		return id;
	}
	public Cashier getCashier() {
		return cashier;
	}
	public Station getStation() {
		return station;
	}
	public double getStartingBalance() {
		return startingBalance;
	}
	public LocalDateTime getStartingDate() {
		return startingDate;
	}
	
	public Shift(Cashier cashier, Station station, double startingBalance, LocalDateTime startingDate) {
		super();
		this.cashier = cashier;
		this.station = station;
		this.startingBalance = startingBalance;
		this.startingDate = startingDate;
	}
	
	public Shift(int id) {
		// get shift
	}
	
}
