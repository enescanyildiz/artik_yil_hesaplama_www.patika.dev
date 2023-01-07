import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int yil;
        System.out.print("Lütfen Hesaplanacak Yılı Giriniz: ");
        yil=input.nextInt();
        input.close();
        if(yil<0)
        {
            System.out.println("Girilen Değer Hatalı!");
        }
        else
        {
        if(yil%100==0)
        {

            if (yil%400==0)
            {
                System.out.println(yil+" Artık Yıldır.");
            }
            else
            {
                System.out.println(yil+" Artık Yıl Değildir.");
            }

        } else if (yil%4==0)
        {
            System.out.println(yil+" Artık Yıldır.");
        }
        else
        {
            System.out.println(yil+" Artık Yıl Değildir.");
        }
    }
    }
}