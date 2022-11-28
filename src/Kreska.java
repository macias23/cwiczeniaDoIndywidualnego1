import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Kreska {
    public static void dodawaniePisemne(int a, int b){
        StringBuilder aSb=new StringBuilder();
        StringBuilder bSb=new StringBuilder();
        aSb.append(a);
        bSb.append(b);
        if(aSb.length()>bSb.length()){
            int roznica=aSb.length()-bSb.length();
            for (int i = 0; i <roznica ; i++) {
                bSb.insert(i,0);
            }
        }
        if(bSb.length()>aSb.length()){
            int roznica=bSb.length()-aSb.length();
            for (int i = 0; i <roznica ; i++) {
                aSb.insert(i,0);
            }
        }
        aSb.reverse();
        bSb.reverse();
        List wynik=new ArrayList<>();
        int przeniesienie=0;
        for (int i = 0; i <aSb.length(); i++) {
            int liczbaA= Integer.parseInt(String.valueOf(aSb.charAt(i)));
            int liczbaB=Integer.parseInt(String.valueOf(bSb.charAt(i)));
            int cyfraWynik=liczbaB+liczbaA+przeniesienie;
            if(cyfraWynik>=10){
                przeniesienie=1;
                cyfraWynik=cyfraWynik-10;
            }
            else przeniesienie=0;
            wynik.add(cyfraWynik);
        }
        if (przeniesienie!=0) wynik.add(przeniesienie);
        aSb.reverse();
        bSb.reverse();

        Collections.reverse(wynik);
        String doWydruku=Arrays.toString(wynik.toArray());
        doWydruku=doWydruku.replace("[","").replace(",",
                "").replace("]","").replace(" ","");
        if(doWydruku.length()>bSb.length()){
            int roznica=doWydruku.length()-bSb.length();
            for (int i = 0; i <roznica ; i++) {
                bSb.insert(i,0);
            }
        }
        if(doWydruku.length()>aSb.length()){
            int roznica=doWydruku.length()- aSb.length();
            for (int i = 0; i <roznica ; i++) {
                aSb.insert(i,0);
            }
        }
        int i=0;
        while(aSb.charAt(i)=='0'){
            aSb.setCharAt(i,' ');
            i++;
        }
        i=0;
        while(bSb.charAt(i)=='0'){
            bSb.setCharAt(i,' ');
            i++;
        }
        System.out.println(bSb.toString());
        System.out.println(aSb.toString());
        System.out.println(doWydruku);

    }


    public static void main(String[] args) {
        dodawaniePisemne(9712,10234);
    }
}
