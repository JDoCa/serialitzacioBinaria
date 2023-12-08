package domenech.jordi.dam.mp05.uf1.p02.serialitzacio.binaria.controllers;

import java.io.IOException;
import java.util.List;

import domenech.jordi.dam.mp05.uf1.p02.serialitzacio.binaria.model.domain.Cotxe;
import domenech.jordi.dam.mp05.uf1.p02.serialitzacio.binaria.model.service.CotxeSerialitzacioBinariaService;
import domenech.jordi.dam.mp05.uf1.p02.serialitzacio.binaria.view.FormulariCotxeView;
import domenech.jordi.dam.mp05.uf1.p02.serialitzacio.binaria.view.UtilitatsSortidaView;

public class CotxeSerialitzacioController {

    private CotxeSerialitzacioController() {
        
    }

    public static CotxeSerialitzacioController getInstance() {
        if (instance == null) {
            instance = new CotxeSerialitzacioController();
        }
        return instance;
    }

    private static CotxeSerialitzacioController instance = null;

    FormulariCotxeView formulariCotxeView = FormulariCotxeView.getInstance();
    CotxeSerialitzacioBinariaService service = CotxeSerialitzacioBinariaService.getInstance();
    UtilitatsSortidaView utilitatsSortidaView = UtilitatsSortidaView.getInstance();

    public void serialitzaUnCotxe() {
        try {
            utilitatsSortidaView.show("Serialitza un cotxe", true);
            Cotxe cotxe = formulariCotxeView.getCotxe();
            service.serialitzaUnCotxe(cotxe);
            utilitatsSortidaView.show("Cotxe serialitzat correctament", false);
        } catch (IOException e) {
            utilitatsSortidaView.show(e.getMessage(), true);
        }
    }

    public void serialitzaLlistaCotxes() {
        try {
            utilitatsSortidaView.show("Serialitza una llista de cotxes", true);
            List<Cotxe> cotxes = formulariCotxeView.getCotxes();
            service.serialitzaLlistaCotxes(cotxes);
            utilitatsSortidaView.show("Llista de cotxes serialitzada correctament", false);
        } catch (IOException e) {
            utilitatsSortidaView.show(e.getMessage(), true);
        }
    }

    public void deserialitzaUnCotxe() {
        try {
            utilitatsSortidaView.show("Deserialitza un cotxe", true);
            Cotxe cotxe = service.deserialitzaUnCotxe();
            utilitatsSortidaView.show(cotxe.toString(), false);
        } catch (IOException | ClassNotFoundException e) {
            utilitatsSortidaView.show(e.getMessage(), true);
        }
    }

    public void deserialitzaLlistaCotxes() {
        try {
            utilitatsSortidaView.show("Deserialitza una llista de cotxes", true);
            List<Cotxe> cotxes = service.deserialitzaLlistaCotxes();
            utilitatsSortidaView.show(cotxes.toString(), false);
        } catch (IOException | ClassNotFoundException e) {
            utilitatsSortidaView.show(e.getMessage(), true);
        }
    }
}
