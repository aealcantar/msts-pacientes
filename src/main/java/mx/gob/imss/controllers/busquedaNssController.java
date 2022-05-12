package mx.gob.imss.controllers;

import mx.gob.imss.service.BusquedaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/api/v1/mts-pacientes")
public class busquedaNssController {

    @Autowired
    BusquedaService busquedaService;

    @CrossOrigin
    @GetMapping(value = "/busquedanss/{nss}", produces = "application/json")
    public ResponseEntity obtenInformacionNss(@PathVariable(value = "nss", required = true) String nss) {

        return new ResponseEntity<>(busquedaService.buscaNSS(nss), HttpStatus.OK);

    }

    @CrossOrigin
    @GetMapping(value = "/busquedanssc/{nss}", produces = "application/json")
    public ResponseEntity obtenInformacionNssCompleta(@PathVariable(value = "nss", required = true) String nss) {

        return new ResponseEntity<>(busquedaService.buscaNSScompleta(nss), HttpStatus.OK);

    }

}
