package com.tryflysky.calcurator.helper;

import java.util.Deque;

import com.tryflysky.expression.ExpressionDeque;


/**
 * デバッグ用
 *
 * @author syowha
 *
 */
public class ExpressionDequeViewer {




	public void viewElements(ExpressionDeque deque) {

		sysoutElements(deque.getOperands());
		sysoutElements(deque.getOperators());
	}




	private void sysoutElements(Deque<String> deque) {

		for(String value : deque) {

			System.out.print(value + ", ");
		}

		System.out.println();
	}
}
