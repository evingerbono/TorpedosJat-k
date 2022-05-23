
package main;

public class torpedoteszt {
    public static void main(String[] args) {
        System.out.println("Teszt");
        
        new torpedoteszt().tesztLoves(4);
    }
    public String tesztLoves(int poz){
        Hajo hajo = new Hajo();
        String t = hajo.talalat(poz);
        assert t.equals("Talűlt") : "Nem jó a találat ellneőrzése";
        return "";
    }
}
