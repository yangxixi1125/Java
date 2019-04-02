/**
 * 数组操作
 * @author yangxixi
 *
 */
public class ShuZu {

	public static void main(String[] args) {
		//获取开始时间ms
		long startTime = System.currentTimeMillis();
		final int M = 52;
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
		
		System.out.println();
		
		//用数组表示牌
		//用数组表示牌花色
		String[] Hua = new String[]{"红桃","黑桃","方块","梅花"};
		//定义牌面
		String[] PaiMian = new String[]{"A","2","3","4","5","6","7","8","8","10","J","Q","K"};
		
		//1-52,商表示花色，余数表示牌面
	    
		
		int[] Pai = new int[M];
		for(int i = 0; i < M; i++) {
			Pai[i] = i;
		}
		
		for(int i = 0; i < M; i++) {
			System.out.printf("\t%d", Pai[i]);
			if((i%13) == 12)
				System.out.printf("\n");
		}
		System.out.printf("\n\n");
		//牌输出
		for(int i = 0; i < M; i++) {
			System.out.printf("\t%s%s",Hua[Pai[i]/13],PaiMian[Pai[i]%13]);
			if((i%13) == 12) {
				System.out.println();
			}
			
		}
		System.out.printf("\n\n");
		
		//利用随机数洗牌
		for(int i = 0; i < 10000; i++) {
			//选出两张牌，交换
			int K = (int)(Math.random()*52);
			int Q = (int)(Math.random()*52);
			
			int temp = Pai[K];
			Pai[K] = Pai[Q];
			Pai[Q] = temp;
		}
		
		//洗牌后牌输出
		for(int i = 0; i < M; i++) {
			System.out.printf("\t%s%s",Hua[Pai[i]/13],PaiMian[Pai[i]%13]);
			if((i%13) == 12) {
				System.out.println();
			}
			
		}
		//获取结束时间2ms
		long endTime2 = System.currentTimeMillis();
		System.out.printf("\n用时：%d\tms",endTime2-endTime);

		
	}	

}
