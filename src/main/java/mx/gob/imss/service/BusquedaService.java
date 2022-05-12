package mx.gob.imss.service;

import mx.gob.imss.model.BusquedaNss;

public interface BusquedaService {

    BusquedaNss buscaNSS(String nss);

    String buscaNSScompleta(String nss);

}
