package com.alien.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

//How to convert a List of objects into a Map by considering duplicated keys and store them in sorted order?

public class ConvertToMapAndSort {

	public static void main(String[] args) {

		List<Notes> noteLst = new ArrayList<>();
		noteLst.add(new Notes(1, "note1", 11));
		noteLst.add(new Notes(2, "note2", 22));
		noteLst.add(new Notes(3, "note3", 33));
		noteLst.add(new Notes(4, "note4", 44));
		noteLst.add(new Notes(5, "note5", 55));
		noteLst.add(new Notes(6, "note4", 66));

		LinkedHashMap<String, Integer> notesRecords = noteLst.stream()
			.sorted(Comparator.comparing(Notes::getTagId)
			.reversed()).collect(Collectors
			.toMap(Notes::getTagName, Notes::getTagId, (oldValue, newValue) -> oldValue, LinkedHashMap::new));

		 System.out.println("Notes : " + notesRecords);
		
	}
}

class Notes {
	int id;
	String tagName;
	int tagId;

	public Notes(int id, String tagName, int tagId) {
		super();
		this.id = id;
		this.tagName = tagName;
		this.tagId = tagId;
	}

	public Notes() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTagName() {
		return tagName;
	}

	public void setTagName(String tagName) {
		this.tagName = tagName;
	}

	public int getTagId() {
		return tagId;
	}

	public void setTagId(int tagId) {
		this.tagId = tagId;
	}

}
