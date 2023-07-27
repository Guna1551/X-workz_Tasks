package com.xworkz.jul27.runner;

import com.xworkz.jul27.app.Assets;

public class AssetsRunner {

	public static void main(String[] args) {
		
		Assets asset1 = new Assets("Ram", "Land", 10000000);
		
		Assets asset2 = new Assets("Ram", "Land", 10000000);
		
		boolean ref = asset1.equals(asset2);
		
		System.out.println("Both are Same : "+ref);

	}

}
