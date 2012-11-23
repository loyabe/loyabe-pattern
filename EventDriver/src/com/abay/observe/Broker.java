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
	public void update(Observable observable, Object arg) {//ע��˴���update�������յ��� ״̬�ı�Ķ��󡢸ı��״̬ ����������
        //����ζ�����ǿ��������ַ�ʽ��ȥ�ı����Ϣ��һ���Ǳ��۲��ߡ��ơ����۲���(�磺arg)����һ���ǹ۲��ߴӱ��۲��ߡ��������������۲����й����������磺name��
		if (observable instanceof Stock && arg instanceof Float) {
			System.out.println(this.name + " ˵ : "
					+ ((Stock) observable).getName() + "�ǵ� " + arg + "Ԫ�� ��");
		}
	}
}

