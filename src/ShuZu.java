/**
 * 数组操作
 * @author yangxixi
 *
 */
public class ShuZu {

	public static void main(String[] args) {
		//获取开始时间ms
		long startTime = System.currentTimeMillis();
		final int N = 50;
		int[] nums = new int[N];
		//生成随机数组
		for(int i = 0; i < N; i++) {
			nums[i]=(int)(Math.random()*1000);
		}
		
		//控制台输出随机数组,10个数换行
		for(int i = 0; i < N; i++) {
			System.out.printf("\t%d", nums[i]);
			if((i%10)==9)
				System.out.printf("\n");
		}
		//获取结束时间ms
		long endTime = System.currentTimeMillis();
		System.out.printf("\n用时：%d\tms",endTime-startTime);
		

	}

}
