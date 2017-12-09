package io.jsd.training.algorithms.practice.backtracking;

public class Sudoku {

	private final int[] grid; // 0..80 (9 * row + col)

	public Sudoku() {
		this.grid = new int[81];
	}

	public Sudoku(String string) {
		this.grid = new int[81];
		for (int i = 0; i < 81; i++)
			this.grid[i] = string.charAt(i) - '0';
	}

	int row(int c) {
		return c / 9;
	}

	int col(int c) {
		return c % 9;
	}

	int group(int c) {
		return 3 * (row(c) / 3) + col(c) / 3;
	}

	public boolean sameZone(int c1, int c2) {
		return row(c1) == row(c2) || col(c1) == col(c2) || group(c1) == group(c2);
	}

	// v�rifie que la valeur dans p est compatible avec les autres cases
	public boolean check(int p) {
		for (int c = 0; c < 81; c++)
			if (c != p && sameZone(p, c) && this.grid[p] == this.grid[c])
				return false;
		return true;
	}

	// essaye de r�soudre la grille courante et renvoie un bool�en indiquant le succ�s
	public boolean solve() {
		for (int c = 0; c < 81; c++)
			if (this.grid[c] == 0) {
				for (int v = 1; v < 10; v++) {
					this.grid[c] = v;
					if (check(c) && solve())
						return true;
				}
				this.grid[c] = 0;
				return false;
			}
		return true;
	}

	public void print() {
		for (int i = 0; i < 9; i++) {
			if (i % 3 == 0)
				System.out.println("+---+---+---+");
			for (int j = 0; j < 9; j++) {
				if (j % 3 == 0)
					System.out.print("|");
				System.out.print(this.grid[9 * i + j]);
			}
			System.out.println("|");
		}
		System.out.println("+---+---+---+");
	}

}

/*
 * exp�rience : maintenir la liste des cases � remplir (par ex. dans une pile) n'am�liore en rien les performances
 */