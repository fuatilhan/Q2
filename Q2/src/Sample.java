import java.util.Scanner;

public class Sample {
    public static void main(String[] args) {
        int toplam=0;


        Scanner scan=new Scanner(System.in);
        System.out.println("Bir a sayısı giriniz....");
        int a=scan.nextInt();
        System.out.println("a dan büyük olmak şartıyla bir b sayısı giriniz..");
        
        int b=scan.nextInt();
        System.out.println("b den küçük olma şartıyla bir x sayısı giriniz...");
        int x=scan.nextInt();
        for(int i=a;i<=b;i++){

            if(i%x==0){
                toplam+=i;
            }
        }
        System.out.println(toplam);
    }
}
