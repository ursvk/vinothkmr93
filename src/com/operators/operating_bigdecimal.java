package com.operators;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class operating_bigdecimal {
//To Convert Long Decimal Numbers to small scale value
	public static void main(String[] args) {

		int tik = 1500;
		BigDecimal movie_ticket_cost = BigDecimal.valueOf(tik).setScale(2);
		BigDecimal Num_of_People = BigDecimal.valueOf(7);
BigDecimal ticket_per_person = movie_ticket_cost.divide(Num_of_People,RoundingMode.HALF_UP );
System.out.println("Ticket Amount per Person: "+ticket_per_person);
	}
}
