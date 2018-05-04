package ConcurrentSty;

import java.util.Arrays;
import java.util.List;

import org.omg.Messaging.SyncScopeHelper;
/**
 * lambda 表达式 
 * @author gubaidan
 *
 */
public class cp_10_1_LamdaThread {

	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		System.out.println(add(values));

	}
	
	public static int add (List<Integer> values) {
		values.parallelStream().forEach(System.out :: println); //并行打印 list
		return values.parallelStream().mapToInt(a -> a).sum();
	}

}
