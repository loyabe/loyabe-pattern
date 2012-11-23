package com.abay.observe;
import java.util.Observable;
/**
 * @bef  被观察对象
 * @author abay
 * 2012.11.20
 */

public class Stock extends Observable {
	private String name;
	private float price;

	public Stock(String name, float price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		
		if(this.price < price){
			this.setChanged();
			this.notifyObservers(price);
			this.price = price;
		}
	}
}
