import java.util.Scanner;

public class KDV_hesaplayici
{
    public static void main(String[] args)
    {
        double tutar, kdv_orani;
        Scanner input_value = new Scanner(System.in);
        System.out.println("Ücret tutarını giriniz: ");
        tutar = input_value.nextDouble();

        kdv_orani = tutar>0 && tutar<1000 ? 0.18 : 0.08;

        double kdv_tutar = tutar * kdv_orani;
        double kdvli_tutar = tutar + kdv_tutar;

        System.out.println("KDV'siz tutar: " +tutar);
        System.out.println("KDV oranı: " +kdv_orani);
        System.out.println("KDV tutarı: " +kdv_tutar);
        System.out.println("KDV'li tutar: " +kdvli_tutar);


    }
}
