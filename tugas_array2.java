package com.mycompany.java_new;

public class tugas_array2 {
    public static void main(String[] args){
		int[] angka = new int[100];

		int x = 1;
		//memberi nilai pada tiap index,
		for (int i = 0; i < angka.length; i++) {
			angka[i] = x;
			x++;
		}

		int total = 0;
		//menjumlahkan nilai 1-100
		for (int i = 0; i < angka.length; i++) {
			total+=angka[i];
		}

		System.out.println(total);
	}
}
