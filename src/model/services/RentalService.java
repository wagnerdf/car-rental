package model.services;

import model.entities.CarRental;

public class RentalService {

	private Double princeParDay;
	private Double princePerHour;
	
	private BrazilTaxService taxService;

	public RentalService(Double princeParDay, Double princePerHour, BrazilTaxService taxService) {
		this.princeParDay = princeParDay;
		this.princePerHour = princePerHour;
		this.taxService = taxService;
	}
	
	public void processInvoice(CarRental carRental) {
		
	}
	
	
}
