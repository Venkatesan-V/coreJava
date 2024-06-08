package z27forEachEx;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Runner {

	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(1,3,5,7,9);
//	before java 1.5 To print all elements from list
		for (int index = 0; index < list.size(); index++) {
//			System.out.println(list.get(index));			
		}
		System.out.println("-----------------------------");
		
//	after 1.5 To print all elements from list
		for (Integer listEle : list) {
//			System.out.println(listEle);
		}
		System.out.println("-----------------------------");
		
		Consumer<Object> consumer = input->System.out.println(input);
//		from 1.8 version
//		list.forEach(consumer);
		list.forEach(input->System.out.println(input));
		
	}
}
