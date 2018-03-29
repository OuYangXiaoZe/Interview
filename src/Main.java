
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main p = new Main();
        p.solve();
    }

    private void solve() {	
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        for (int i=1; i<=num; i++){
            int n = in.nextInt();
            // ��¼n�ݽ���
            int[] array = new int[n+1];
            // ǰi�ݽ��ӵ�����֮��
            int[] sum = new int[n+1];
            array[0] = 0;
            sum[0] = 0;
            for (int j=1; j<=n; j++) {
                array[j] = in.nextInt();
                sum[j] = sum[j-1] + array[j];
            }
            // ��̬�滮����
            int[][] f = new int[n+1][n+1];
            for (int j=1; j<=n; j++)
                // ��¼�Խ���Ԫ��
                f[j][j] = array[j];
            int k=1;
            while (k <= n-1){
                // �ӶԽ���Ԫ�ؿ�ʼ���㣬������Ų��ֱ�����㵽f[1][n]
                for (int j=1; j+k<=n; j++){
                    f[j][j+k] = sum[j+k] - sum[j-1] - Math.min(f[j][j+k-1], f[j+1][j+k]);
                }
                k++;
            }
            System.out.println("Case #"+i+": "+f[1][n]+" "+(sum[n]-f[1][n]));
        }
        in.close();
    }
}
