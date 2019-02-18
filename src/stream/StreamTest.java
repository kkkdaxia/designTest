package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class StreamTest {

	public static void main(String[] args) {
		/*
		Student stuA = new Student(1, "A", "M", 184);
		Student stuB = new Student(2, "B", "G", 163);
		Student stuC = new Student(3, "C", "M", 175);
		Student stuD = new Student(4, "D", "G", 158);
		Student stuE = new Student(5, "E", "M", 170);
		List<Student> list = new ArrayList<>();
		list.add(stuA);
		list.add(stuB);
		list.add(stuC);
		list.add(stuD);
		list.add(stuE);
		
		//旧方法
		Iterator<Student> iterator = list.iterator();
		while(iterator.hasNext()) {
		    Student stu = iterator.next();
		    if (stu.getSex().equals("G")) {
		        System.out.println(stu.toString());
		    }
		}
		
		//新方法
		list.stream()
		.filter(student->student.getSex().equals("G"))
		.forEach(student->System.out.println(student.toString()));
		
		java.util.stream.Stream.
				iterate(1,item->item+1)
				.limit(10)
				.forEach(System.out::println);
		
		java.util.stream.Stream
			.concat(java.util.stream.Stream.of(1,4,5),java.util.stream.Stream.of(2,3,8))
			.forEach(inte->System.out.println(inte+","));
		*/
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		numbers.parallelStream()
		       .forEachOrdered(System.out::println);  
	}


}
