package Inheritence;

public class demo {
    public static void main(String[] args) {
        FatherLion fatherLion = new FatherLion();
        SonLion sonLion = new SonLion();

        fatherLion.name = "Lion King";
        sonLion.name = "Simba";

        System.out.println("Name of father lion is " + fatherLion.name);
        System.out.println("Name of son lion is " + sonLion.name);

        fatherLion.makeNoise(); // Father make noise!
        sonLion.makeNoise(); // Son Lion make noise!



    }
}









