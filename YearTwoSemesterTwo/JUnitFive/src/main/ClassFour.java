package main;

import java.util.Scanner;

public class ClassFour {

	int[][] matrix = new int[4][4];

	public ClassFour() {
		int i, j;
		Scanner input;

		input = new Scanner(System.in);

		for (i = 0; i < 4; i++) {
			for (j = 0; j < 4; j++) {
				System.out.println("Please enter row " + i + " col " + j);
				matrix[i][j] = input.nextInt();
			}
		}
	}

	public ClassFour(int init) {
		int i, j;
		Scanner input;

		input = new Scanner(System.in);

		for (i = 0; i < 4; i++) {
			for (j = 0; j < 4; j++) {
				matrix[i][j] = init;
			}
		}
	}

	public ClassFour Add(ClassFour b) {
		ClassFour C = new ClassFour(1);
		int i, j;

		for (i = 0; i < 4; i++) {
			for (j = 0; j < 4; j++) {
				System.out.println("Please enter row " + i + " col " + j);
				C.matrix[i][j] = matrix[i][j] + b.matrix[i][j];
			}
		}
		return C;
	}

	public ClassFour Subtract(ClassFour b) {
		ClassFour C = new ClassFour(1);
		int i, j;

		for (i = 0; i < 4; i++) {
			for (j = 0; j < 4; j++) {
				System.out.println("Please enter row " + i + " col " + j);
				C.matrix[i][j] = matrix[i][j] - b.matrix[i][j];
			}
		}
		return C;
	}

	@Override
	public boolean equals(Object obj) {
	    if (this == obj) return true; // same reference
	    if (obj == null) return false; // null check
	    if (getClass() != obj.getClass()) return false; // type check

	    ClassFour other = (ClassFour) obj;
	    for (int i = 0; i < 4; i++) {
	        for (int j = 0; j < 4; j++) {
	            if (matrix[i][j] != other.matrix[i][j]) {
	                return false;
	            }
	        }
	    }
	    return true;
	}

	public int[][] getMatrix() {
		return matrix;
	}

	public void setMatrix(int[][] matrix) {
		this.matrix = matrix;
	}
}