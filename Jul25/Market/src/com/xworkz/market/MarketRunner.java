package com.xworkz.market;

import com.xworkz.market.base.SuperMarket;
import com.xworkz.market.online.OnlineMarket;

public class MarketRunner {

	public static void main(String[] args) {
		
		OnlineMarket onlineMarket = new OnlineMarket();
		onlineMarket.buy();
		onlineMarket.sell();
		
		SuperMarket superMarket = new SuperMarket();
		superMarket.buy();
		
	}

}
