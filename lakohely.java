import java.io.File;
import java.util.Scanner;

class lakohelyekBeallitasa{
    private String cim;
    private int haloszobak_szama;
    private int alapterulet;
    private int ar;

    public void setCim(String s){
        cim = s;
    }

    public String getCim(){
        return cim;
    }
    
    public void setHalo(int h){
        haloszobak_szama = h;
    }

    public int getHalo(){
        return haloszobak_szama;
    }

    public void setTerulet(int t){
        alapterulet = t;
    }

    public int getTerulet(){
        return alapterulet;
    }

    public void setAr(int a){
        ar = a;
    }

    public int getAr(){
        return ar;
    }
    
    
    public double getTeruletAr(){
        return ar; //ar / alapterulet;
    }
    

    public double getHaloAr(){
        return ar; //ar / haloszobak_szama;
    }
    

    public void megjelenit(){
        System.out.println(getCim());
        System.out.println("Hálószobák száma:"+ getHalo());
        System.out.println("Alapterülete:"+ getTerulet() +"m2");
        System.out.println("Ára:"+getAr()+"Ft");
        System.out.println("Ár négyzetméterenként:"+ getTeruletAr()+"Ft");
        System.out.println("Ár hálószobánként:"+getHaloAr() + "Ft");
    }

}

class Haz extends lakohelyekBeallitasa{
    private int hitelTorlesztoreszlet;
    private int ingatlanadoKoltsege;

    public void setHitelTorlesztoreszlet(int h){
        hitelTorlesztoreszlet = h;
    }

    public int getHitelTorlesztoreszlet(){
        return hitelTorlesztoreszlet;
    }

    public void setIngatlanadoKoltsege(int i){
        ingatlanadoKoltsege = i;
    }

    public int getIngatlanadoKoltsege(){
        return ingatlanadoKoltsege;
    }
    /*
    public void hazMegjelenit(){
        System.out.println(getCim());
        System.out.println("Hálószobák száma:"+ getHalo());
        System.out.println("Alapterülete:"+ getTerulet() +"m2");
        System.out.println("Ára:"+getAr()+"Ft");
        System.out.println("Ár négyzetméterenként:"+ getTeruletAr()+"Ft");
        System.out.println("Ár hálószobánként:"+getHaloAr() + "Ft");
        System.out.println("Ár négyzetméterenként 1 honapra:"+ getTeruletAr() / 12+"Ft");
        System.out.println("Ár hálószobánként 1 honapra:"+getHaloAr() / 12 + "Ft");
    }
    */

    @Override
    public void megjelenit(){
        System.out.println(getCim());
        System.out.println("Hálószobák száma:"+ getHalo());
        System.out.println("Alapterülete:"+ getTerulet() +"m2");
        System.out.println("Ára:"+getAr()+"Ft");
        System.out.println("Ár négyzetméterenként:"+ getTeruletAr()+"Ft");
        System.out.println("Ár hálószobánként:"+getHaloAr() + "Ft");
        System.out.println("Ár négyzetméterenként 1 honapra:"+ getTeruletAr() / 12+"Ft");
        System.out.println("Ár hálószobánként 1 honapra:"+getHaloAr() / 12 + "Ft");
    }
}

class Lakas extends lakohelyekBeallitasa{
    private int berleiDij;

    public void setBerletiDij(int b){
        berleiDij = b;
    }

    public int getBreletiDij(){
        return berleiDij;
    }
    @Override
    public void megjelenit(){
        System.out.println(getCim());
        System.out.println("Hálószobák száma:"+ getHalo());
        System.out.println("Alapterülete:"+ getTerulet() +"m2");
        System.out.println("Ára:"+getAr()+"Ft");
        System.out.println("Ár négyzetméterenként:"+ getTeruletAr()+"Ft");
        System.out.println("Ár hálószobánként:"+getHaloAr() + "Ft");
        System.out.println("Ár négyzetméterenként 1 honapra:"+ getTeruletAr() / 12+"Ft");
        System.out.println("Ár hálószobánként 1 honapra:"+getHaloAr() / 12 + "Ft");
    }
}

class lakasDijakkal extends Lakas{
    @Override
    public void megjelenit(){
        System.out.println(getCim());
        System.out.println("Hálószobák száma:"+ getHalo());
        System.out.println("Alapterülete:"+ getTerulet() + "m2");
        System.out.println("Ára:"+getAr()+"Ft");
        System.out.println("Ár négyzetméterenként:"+ getTeruletAr()+"Ft");
        System.out.println("Ár hálószobánként:"+getHaloAr() + "Ft");
        System.out.println("Ár négyzetméterenként 1 honapra:"+ getTeruletAr() / 12 +"Ft");
        System.out.println("Ár hálószobánként 1 honapra:"+getHaloAr() / 12 + "Ft");
        System.out.println("Negyedevente befizetendo:"+ getBreletiDij());
    }
}
   
public class lakohely {
    public static void main(String[] args) {
        lakohelyekBeallitasa lako1 = new lakohelyekBeallitasa();
        lakohelyekBeallitasa lako2 = new lakohelyekBeallitasa();
        lakohelyekBeallitasa lako3 = new lakohelyekBeallitasa();

        Haz haz1 = new Haz();
        Lakas lakas1 = new Lakas();

        lakasDijakkal lakas2 = new lakasDijakkal();

        lako1.setCim("Pipacs utca 10/A");
        lako1.setHalo(2);
        lako1.setTerulet(98);
        
        lako2.setCim("Akácos út 6");
        lako2.setHalo(3);
        lako2.setTerulet(160);
        
        lako3.setCim("Bükki utca 12");
        lako3.setHalo(5);
        lako3.setTerulet(400);

        haz1.setCim("Akacos ut 5");
        haz1.setHalo(4);
        haz1.setTerulet(200);
        haz1.setHitelTorlesztoreszlet(40000);
        haz1.setIngatlanadoKoltsege(50000);

        lakas1.setCim("Valami utca valami szam");
        lakas1.setHalo(1);
        lakas1.setTerulet(50);
        lakas1.setBerletiDij(80000);
        
        lakas1.setCim("Valami utca valami szam2");
        lakas1.setHalo(3);
        lakas1.setTerulet(55);
        lakas1.setBerletiDij(90000);

        Scanner lakoScanner = new Scanner(System.in);
        
        int lakoAr1 = lakoScanner.nextInt();
        lako1.setAr(lakoAr1);

        int lakoAr2 = lakoScanner.nextInt();
        lako2.setAr(lakoAr2);

        int lakoAr3 = lakoScanner.nextInt();
        lako3.setAr(lakoAr3);

        int hazAr = lakoScanner.nextInt();
        haz1.setAr(hazAr);

        int lakasAr = lakoScanner.nextInt();
        lakas1.setAr(lakasAr);

        int lakasAr2 = lakoScanner.nextInt();
        lakas2.setAr(lakasAr2);

        lakoScanner.close();


        lako1.megjelenit();
        System.out.println();

        lako2.megjelenit();
        System.out.println();

        lako3.megjelenit();
        System.out.println();

        haz1.megjelenit();
        System.out.println();

        lakas1.megjelenit();
        System.out.println();

        lakas2.megjelenit();
        System.out.println();
    
    }
}