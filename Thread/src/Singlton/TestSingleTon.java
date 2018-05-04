package Singlton;

public class TestSingleTon {

	public static void main(String[] args) {
		HungryModel hungryModel = HungryModel.getInstance();
		HungryModel hungryModel1 = HungryModel.getInstance();
		System.out.println(hungryModel.hashCode());
		System.out.println(hungryModel1.hashCode());
		
		LazzyModel lazzyModel = LazzyModel.getInstance();
		LazzyModel lazzyModel1 = LazzyModel.getInstance();
		System.out.println(lazzyModel.hashCode());
		System.out.println(lazzyModel1.hashCode());
		
		

	}

}
