package io.jsd.training.algorithms.practice.sorting;

import java.util.Arrays;

// Tri fusion
// Complexity : O(n log n)
public class MergeSort extends Sorting {

	// merge a1[l..m[ and a1[m..r[ into a2[l..r[
	private void merge(int[] a1, int[] a2, int l, int m, int r) {
		int i = l, j = m;
		for (int k = l; k < r; k++)
			if (i < m && (j == r || a1[i] <= a1[j]))
				a2[k] = a1[i++];
			else
				a2[k] = a1[j++];
	}

	// recursive, top-down mergesort
	public void mergesortrec(int[] a, int[] tmp, int l, int r) {
		if (l >= r - 1)
			return;
		int m = l + (r - l) / 2;
		mergesortrec(a, tmp, l, m);
		mergesortrec(a, tmp, m, r);
		if (a[m - 1] <= a[m])
			return; // optim
		for (int i = l; i < r; i++)
			tmp[i] = a[i];
		merge(tmp, a, l, m, r);
	}

	public void mergesort(int[] a) {
		mergesortrec(a, new int[a.length], 0, a.length);
	}

	// exercice : �viter la copie de a vers tmp
	public void mergesort2rec(int[] a, int[] tmp, int l, int r, boolean inplace) {
		if (l >= r - 1)
			return;
		int m = l + (r - l) / 2;
		mergesort2rec(a, tmp, l, m, !inplace);
		mergesort2rec(a, tmp, m, r, !inplace);
		if (inplace)
			merge(tmp, a, l, m, r);
		else
			merge(a, tmp, l, m, r);
	}

	public void mergesort2(int[] a) {
		mergesort2rec(a, Arrays.copyOf(a, a.length), 0, a.length, true);
	}

	// bottom-up mergesort
	public void bottomUpMergesort(int[] a) {
		int n = a.length;
		int[] tmp = new int[n];
		for (int len = 1; len < n; len *= 2)
			for (int lo = 0; lo < n - len; lo += 2 * len) {
				int mid = lo + len;
				int hi = Math.min(n, mid + len);
				for (int i = lo; i < hi; i++)
					tmp[i] = a[i];
				merge(tmp, a, lo, mid, hi);
			}
	}

	// natural mergesort

	// returns hi such that a[lo..hi[ is sorted
	public int findRun(int[] a, int lo) {
		while (++lo < a.length && a[lo - 1] <= a[lo])
			;
		return lo;
	}

	public void naturalMergesort(int[] a) {
		int n = a.length;
		if (n <= 1)
			return;
		int[] tmp = new int[n];
		while (true) {
			for (int lo = 0; lo < n - 1;) {
				// find first run a[lo..mid[
				int mid = findRun(a, lo);
				if (mid == n) {
					if (lo == 0)
						return;
					break;
				}
				// find second run a[mid..hi[
				int hi = findRun(a, mid);
				// merge
				for (int i = lo; i < hi; i++)
					tmp[i] = a[i];
				merge(tmp, a, lo, mid, hi);
				lo = hi;
			}
		}
	}

	public void merge2(int[] tmp, int[] a, int lo, int mid, int hi) {
		for (int i = lo; i < hi; i++)
			tmp[i] = a[i];
		merge(tmp, a, lo, mid, hi);
	}

	public void naturalMergeSort(int[] t) {
		if (t.length < 2)
			return;

		int b = 0;
		int[] bounds = new int[t.length];
		int count = 0;

		while (b < t.length) {
			bounds[count] = b;
			count++;
			b = findRun(t, b);
		}

		if (count < 2)
			return;

		// for (int i = 0; i < count; i++)
		// System.out.print(bounds[i] + " ");
		// System.out.println();

		int[] tmp = new int[t.length];

		for (int len = 1; len < count; len *= 2) {
			for (int l = 0; l + len < count; l += 2 * len) {
				int m = l + len;
				if (m + len < count) {
					merge2(tmp, t, bounds[l], bounds[m], bounds[m + len]);
				} else {
					merge2(tmp, t, bounds[l], bounds[m], t.length);
				}
			}
		}
	}

}
