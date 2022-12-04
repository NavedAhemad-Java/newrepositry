package com.bikkadIt.Bank.model;

import jakarta.persistence.Embeddable;

@Embeddable
public class Mango {

	
	private int idz;
	private int prize;
	private String variety;
	public int getIdz() {
		return idz;
	}
	public void setIdz(int idz) {
		this.idz = idz;
	}
	public int getPrize() {
		return prize;
	}
	public void setPrize(int prize) {
		this.prize = prize;
	}
	public String getVariety() {
		return variety;
	}
	public void setVariety(String variety) {
		this.variety = variety;
	}
	@Override
	public String toString() {
		return "Mango [idz=" + idz + ", prize=" + prize + ", variety=" + variety + "]";
	}
	
	
}
