import java.nio.charset.StandardCharsets;
import java.util.Locale;

public class lab2 {
    public static void main (String[] args){
        char Array[ ] = {'І','н','с','т','и','т','у','т',':',' ','Н','Л','Т','У',' ','І','Д','Т','Д',' ','2','1','К','Н'};
        String s1 = new String(Array,0,22);
        System.out.println(s1);
        String s2 = "";
        for (int i = s1.length() - 1; i >= 0; i--) {
            s2 = s2 + s1.charAt(i);
        }
        System.out.println(s2);
        String s3 = new String(s1.toUpperCase());
        System.out.println(s3);
        if(s3.equals(s1))
            System.out.println("Рядки рівні");
        else
            System.out.println("Рядки не рівні");
        String s5 = new String( s1.substring(15,19));
        System.out.println(s5);
        String s6 = s1+" "+s3;
        System.out.println(s6);
        System.out.print("Перше і останнє входження букви Д в s1  ");
        System.out.println(s1.indexOf('Д')+" "+s1.lastIndexOf('Д'));
        StringBuffer sB1= new StringBuffer("Похмурський Дмитро Іванович 25 11 2001");
        System.out.println(sB1);
        sB1.delete(28,34);
        System.out.println(sB1);
        sB1.insert(28,"11 ");
        System.out.println(sB1);
        sB1.insert(35," Ч ");
        System.out.println(sB1);
        System.out.println("Довжина рядка в символах "+sB1.length()+ " Довжина рядка в байтах "+sB1.toString().getBytes().length);
        sB1.delete(27,38);
        System.out.println(sB1);
        sB1.reverse();
        System.out.println(sB1);







    }
}
