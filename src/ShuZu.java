/**
 * �������
 * @author yangxixi
 *
 */
public class ShuZu {

	public static void main(String[] args) {
		//��ȡ��ʼʱ��ms
		long startTime = System.currentTimeMillis();
		final int N = 50;
		int[] nums = new int[N];
		//�����������
		for(int i = 0; i < N; i++) {
			nums[i]=(int)(Math.random()*1000);
		}
		
		//����̨����������,10��������
		for(int i = 0; i < N; i++) {
			System.out.printf("\t%d", nums[i]);
			if((i%10)==9)
				System.out.printf("\n");
		}
		//��ȡ����ʱ��ms
		long endTime = System.currentTimeMillis();
		System.out.printf("\n��ʱ��%d\tms",endTime-startTime);
		

	}

}
