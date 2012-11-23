/*
 * 
 */
package com.abay.pattern.observer;

/**
 * @author abay
 * 
 * @date 2012-11-21 :ÏÂÎç11:27:21
 *
 */
public class Test {
	
	public static void main(String[] args) {
		Stock stock = new Stock ("ĞÇÍøÈñ½İ");
		Broker abel = new Broker ("abel");
		Broker abay = new Broker ("abay");
		
		stock.addObserver(abel);
		stock.addObserver(abay);
		
		
		stock.setPrice(15);
		stock.setPrice(16);
		stock.setPrice(17);
		
	}

}
