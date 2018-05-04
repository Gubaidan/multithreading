package Singlton;

public class HungryModel {
	private static HungryModel ins = new HungryModel();

	//私有的构造方法
	private HungryModel() {	}
	
	public static HungryModel getInstance() {
		return ins;
	}

}
 