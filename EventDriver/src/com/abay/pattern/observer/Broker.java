/*
 * 
 */
package com.abay.pattern.observer;

/**
 * @author abay
 * 
 * @date 2012-11-21 :����11:23:10
 *
 */
public class Broker implements Observer{

	private String name ;
	
	public Broker(String _name){
		name = _name;
	}
	
	/* (non-Javadoc)
	 * @see com.abay.event.Observer#update(com.abay.event.Observable, java.lang.Object)
	 */
	@Override
	public void update(Observable obs, Object o) {
		// TODO Auto-generated method stub
		Stock stock = (Stock) obs;
		System.out.println(this.name +" �����  ��" +  stock.getStockName() + " ��Ʊ �۸� " + o.toString());
	}

	
	
}
