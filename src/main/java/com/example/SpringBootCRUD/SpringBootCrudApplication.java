package com.example.SpringBootCRUD;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//import java.util.Deque;
//import java.util.HashSet;
//import java.util.LinkedList;

@SpringBootApplication
public class SpringBootCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCrudApplication.class, args);
	}

}

//public class LruCache {
//
//	private final int CACHE_SIZE;
//	private Deque<Integer> values;
//	private HashSet<Integer> valuesReference;
//
//	LruCache(int capacity) {
//		CACHE_SIZE = capacity;
//		values = new LinkedList<>();
//		valuesReference = new HashSet<>();
//	}
//
//	public void addd(int value) {
//		if (!valuesReference.contains(value)) {
//			if (values.size() == CACHE_SIZE) {
//				int last = values.removeLast();
//				valuesReference.remove(last);
//			}
//		} else {
//			values.remove(value);
//		}
//		values.push(value);
//		valuesReference.add(value);
//	}
//}