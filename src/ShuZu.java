/**
 * �������
 * @author yangxixi
 *
 */
public class ShuZu {

	public static void main(String[] args) {
		//��ȡ��ʼʱ��ms
		long startTime = System.currentTimeMillis();
		final int M = 52;
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
		
		System.out.println();
		
		//�������ʾ��
		//�������ʾ�ƻ�ɫ
		String[] Hua = new String[]{"����","����","����","÷��"};
		//��������
		String[] PaiMian = new String[]{"A","2","3","4","5","6","7","8","8","10","J","Q","K"};
		
		//1-52,�̱�ʾ��ɫ��������ʾ����
	    
		
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
		//�����
		for(int i = 0; i < M; i++) {
			System.out.printf("\t%s%s",Hua[Pai[i]/13],PaiMian[Pai[i]%13]);
			if((i%13) == 12) {
				System.out.println();
			}
			
		}
		System.out.printf("\n\n");
		
		//���������ϴ��
		for(int i = 0; i < 10000; i++) {
			//ѡ�������ƣ�����
			int K = (int)(Math.random()*52);
			int Q = (int)(Math.random()*52);
			
			int temp = Pai[K];
			Pai[K] = Pai[Q];
			Pai[Q] = temp;
		}
		
		//ϴ�ƺ������
		for(int i = 0; i < M; i++) {
			System.out.printf("\t%s%s",Hua[Pai[i]/13],PaiMian[Pai[i]%13]);
			if((i%13) == 12) {
				System.out.println();
			}
			
		}
		//��ȡ����ʱ��2ms
		long endTime2 = System.currentTimeMillis();
		System.out.printf("\n��ʱ��%d\tms",endTime2-endTime);

		
	}	

}
