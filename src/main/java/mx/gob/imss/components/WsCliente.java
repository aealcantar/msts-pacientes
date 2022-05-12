package mx.gob.imss.components;

import mx.gob.imss.vigenciaderechos.Return;
import mx.gob.imss.vigenciaderechos.WSConsVigGpoFamComXNss;
import mx.gob.imss.vigenciaderechos.WSConsVigGpoFamComXNss_Service;
import org.springframework.stereotype.Component;

@Component
public class WsCliente {

    public Return consultaNss(String nss){

        WSConsVigGpoFamComXNss_Service wsService = new WSConsVigGpoFamComXNss_Service();

        WSConsVigGpoFamComXNss wsConsVigGpoFamComXNss = wsService.getWSConsVigGpoFamComXNssPort();

        return wsConsVigGpoFamComXNss.getInfo(nss,"5");

    }
}
