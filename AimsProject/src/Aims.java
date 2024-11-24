

public class Aims {

	public static void main(String[] args) 
	{
		Cart testCart = new Cart(); //Create new cart
		
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("Wonder Women", "Captain America","The Flash", 73, 35.65f);
	
		testCart.addDigitalVideoDisc(dvd1);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc( "Superman", "Batman", "abc", 75, 26.95f);
		
		testCart.addDigitalVideoDisc(dvd2);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Raz", "Doraemon", 18.9f);
		
		testCart.addDigitalVideoDisc(dvd3);
		
		testCart.removeDigitalVideoDisc(dvd3);
		
		System.out.println("Total cost is: ");
		
		System.out.println(testCart.totalCost());
	}

}