package com.neotech.review06;

public class Forest {

	public static void main(String[] args) {

		Wolf wol = new Wolf();

		wol.legs = 4;
		wol.name = "WOLF";
		wol.displayInfo();

		Fox fx = new Fox();

		fx.legs = 4;
		fx.name = "FOX";
		fx.furColor= "BLACK";
		fx.displayInfo();

		Bear bea = new Bear();

		bea.legs = 4;
		bea.name = "BEAR";
		bea.displayInfo();
	}

}
