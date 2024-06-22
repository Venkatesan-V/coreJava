package com.tweleth.arrays;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListIterateEx {

	public static void main(String[] args) {


		LinkedList <String> carList = new LinkedList<String>();

		carList.add("maruti");
		carList.add("hyundai");
		carList.add("tata");
		carList.add("mahindra");
		carList.add("skoda");
		carList.add("honda");
		carList.add("mercedes");
		carList.add("ford");
		System.out.println(carList);

		System.out.println("=========ForLoop============");
		for (int i=0; i<carList.size(); i++) {
			System.out.println(carList.get(i));
		}
		System.out.println("=========ForEach============");
		for (String carNames : carList) {
			System.out.println(carNames);
		}

		System.out.println("============Using List Iterator==============");

		System.out.println("======Forward======");

		ListIterator<String> iteratorCar = carList.listIterator();
		while (iteratorCar.hasNext()) {
			System.out.println(iteratorCar.next());
		}
		System.out.println("======Reverse======");
		while (iteratorCar.hasPrevious()) {
			System.out.println(iteratorCar.previous());
		}

		System.out.println("============Using Iterator==============");
		Iterator<String> iterateCars = carList.listIterator();
		while (iterateCars.hasNext()) {
			System.out.println(iterateCars.next());
		}


	}
}