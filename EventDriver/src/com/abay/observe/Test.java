package com.abay.observe;

public class Test {
	public static void main(String[] args) {
		Stock stock = new Stock("�л��Ƽ�", 1.5f);
		Broker tom = new Broker("Tom");
		Broker leo = new Broker("Leo");
		stock.addObserver(tom);
		stock.addObserver(leo);

		stock.setPrice(1.6f);
		stock.setPrice(1.7f);
		stock.setPrice(1.8f);
	}
}