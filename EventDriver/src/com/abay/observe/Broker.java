package com.abay.observe;

import java.util.Observable;
import java.util.Observer;

/**
 * @author abay
 * @date 2012-11-21
 */

public class Broker implements Observer {
	private String name;

	public Broker(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public void update(Observable observable, Object arg) {//注意此处，update方法接收到了 状态改变的对象、改变的状态 两个参数，
        //这意味着我们可以有两种方式过去改变的信息，一中是被观察者”推“给观察者(如：arg)，另一种是观察者从被观察者”拉“过来（被观察者有公开方法，如：name）
		if (observable instanceof Stock && arg instanceof Float) {
			System.out.println(this.name + " 说 : "
					+ ((Stock) observable).getName() + "涨到 " + arg + "元了 ！");
		}
	}
}

