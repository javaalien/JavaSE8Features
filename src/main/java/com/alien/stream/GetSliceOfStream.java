package com.alien.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

// How to get Slice of a Stream in Java?

public class GetSliceOfStream {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		for (int i = 10; i <= 19; i++)
			list.add(i);

		Stream<Integer> intStream = list.stream();
		System.out.println("List: " + list);

		Stream<Integer> sliceOfIntStream = getSliceOfStream(intStream, 3, 7);

		System.out.println("\nSlice of Stream:");
		sliceOfIntStream.forEach(System.out::println);

	}

	private static Stream<Integer> getSliceOfStream(Stream<Integer> stream, int i, int j) {

		return stream.skip(i).limit(j - i + 1);
	}

}
