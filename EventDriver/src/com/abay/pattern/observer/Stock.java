/*
 * 
 */
package com.abay.pattern.observer;

/**
 * @author abay
 * 
 * @date 2012-11-21 :обнГ11:20:30
 *
 */
public class Stock extends Observable{
	
	private int price = 0;
	private String _name;
	
	public Stock(String name){
		_name = name;
	}
	
	public String getStockName(){
		return _name;
	}
	
	public void setPrice(int price){
		if (this.price != price){
			this.setChanged();
			this.notifyObservers(price);
			this.price = price;
		}
	}

}
