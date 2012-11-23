/*
 * 
 */
package com.abay.pattern.observer;

import java.util.Vector;

/**
 * @author abay
 * 
 * @date 2012-11-21 :����11:04:44
 *  todo : �����Ҫ��һ�Զ�Ĺ�ϵ�� �����߸ı� �� 
 */
public class Observable {
	private boolean change = false;
	private Vector<Observer> obs;

	public Observable() {
		obs = new Vector<Observer>();
	}

	public void setChanged() {
		change = true;
	}

	public void clearChanged() {
		change = false;
	}
	
	public boolean hasChanged(){
		return this.change;
	}

	public void addObserver(Observer obj) {
		if (obj == null)
			throw new NullPointerException();
		if (!obs.contains(obj))
			obs.addElement(obj);
	}

	public void clearObservers() {
	    obs.clear();
	}

	public synchronized void notifyObservers(Object o) {

		if (!hasChanged())
			return;
		
		clearChanged();
		
		for(Observer ob : obs){
			ob.update(this, o);
		}
		
	}
	
	public void notifyObservers(){
		notifyObservers(null);
	}

}
