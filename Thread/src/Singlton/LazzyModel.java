package Singlton;

public class LazzyModel {
	private static volatile LazzyModel lModel;
	
	private LazzyModel() {}
	
	//双重检查加锁
	public static LazzyModel getInstance() {
		if (lModel == null) {
			synchronized(LazzyModel.class) {
				if (lModel == null) {
					lModel = new LazzyModel();   
					//可能会发生指令重排序    volatile 解决
					//  申请一块内存空间
					//  在这块空间实力话对象
					//  lModle的引用指向这块空间     
				}
			}	
		}
		return lModel;
	}

}
