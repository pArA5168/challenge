package com.array.main;

import com.array.field.Field;

public class Main {

	public static void main(String[] args) {
		Field field = new Field(3, 3);
		field.setupField();
		field.printField();
		field.rotateCw();
		field.printField();
		field.rotateCw();
		field.printField();
		field.rotateCw();
		field.printField();
		field.rotateCw();
		field.printField();
	}

}