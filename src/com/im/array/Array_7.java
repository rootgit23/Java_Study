package com.im.array;

public class Array_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] ar = {4,7,1,3,9};
		
		for(int i=0; i<ar.length; i++) {
			for(int j=1; j<ar.length; j++) {
				if(ar[i]<ar[j]) {
					int tmp = ar[j];
					ar[j] = ar[i];
					ar[i] = tmp;
				}
			}
		}
	}

}
