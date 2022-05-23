
package main;

public class torpedoteszt {
    public static void main(String[] args) {
        System.out.println("Teszt");
        
        new torpedoteszt().tesztLovesTalalat(4);
    }
    public String tesztLovesTalalat(int poz){
        Hajo hajo = new Hajo(new int[] {2,3,4});
        String t = hajo.talalat(poz);
        assert t.equals("Talűlt") : "Nem jó a találat ellneőrzése";
        return "";
    }
}
