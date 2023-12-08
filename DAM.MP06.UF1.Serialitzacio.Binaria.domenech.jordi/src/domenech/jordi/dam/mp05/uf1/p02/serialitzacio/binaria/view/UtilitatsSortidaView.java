package domenech.jordi.dam.mp05.uf1.p02.serialitzacio.binaria.view;

public class UtilitatsSortidaView {

    private UtilitatsSortidaView() {}

    private static UtilitatsSortidaView instance = null;

    public static UtilitatsSortidaView getInstance() {
        if (instance == null) {
            instance = new UtilitatsSortidaView();
        }
        return instance;
    }

    public void show(String missatge, boolean isError) {
        if (!isError) {
            System.out.println(missatge);
        } else {
            System.err.println(missatge);
        }
    }
}
