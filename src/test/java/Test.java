

/**
 * Create by 六
 * Date:18-6-21
 */
public class Test {
    public static void main(String[] args) {
        int[] a=new int[20];
        a[0]=1;
        for(int i=0;i<a.length;i++){
            a[i]=i+1;
        }
        for (int b=0;b<a.length;b++){
            System.out.println(a[b]);
        }

    }
}
