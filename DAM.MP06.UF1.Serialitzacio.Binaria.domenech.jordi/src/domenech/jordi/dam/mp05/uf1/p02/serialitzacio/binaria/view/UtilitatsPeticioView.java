package domenech.jordi.dam.mp05.uf1.p02.serialitzacio.binaria.view;

import java.util.Scanner;

public class UtilitatsPeticioView {

    private UtilitatsPeticioView() {
        scanner = new Scanner(System.in);
    }

    private static UtilitatsPeticioView instance = null;

    public static UtilitatsPeticioView getInstance() {
        if (instance == null) {
            instance = new UtilitatsPeticioView();
        }
        return instance;
    }

    private Scanner scanner;

    String getParaulaString(String missatgePeticio) {
        System.out.println(missatgePeticio);
        return scanner.next();
    }

    String getFraseString(String missatgePeticio) {
        System.out.println(missatgePeticio);
        return scanner.nextLine();
    }

    int getInt(String missatgePeticio) {
        System.out.println(missatgePeticio);
        return scanner.nextInt();
    }

    short getShort(String missatgePeticio) {
        System.out.println(missatgePeticio);
        return scanner.nextShort();
    }

    byte getByte(String missatgePeticio) {
        System.out.println(missatgePeticio);
        return scanner.nextByte();
    }

    float getFloat(String missatgePeticio) {
        System.out.println(missatgePeticio);
        return scanner.nextFloat();
    }
}
