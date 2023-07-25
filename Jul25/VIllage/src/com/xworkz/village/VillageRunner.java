package com.xworkz.village;

import com.xworkz.village.inner.OldVillage;
import com.xworkz.village.outer.NewVIllage;

public class VillageRunner {
	
	public static void main(String[] args) {
		OldVillage oldVillage  = new OldVillage();
		oldVillage.exit();
		
		NewVIllage newVIllage = new NewVIllage();
		newVIllage.enter();
		newVIllage.exit();
	}

}
