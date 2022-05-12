package mx.gob.imss.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonRootName(value = "busquedanss")
public class BusquedaNss {

    @JsonProperty(value = "beneficiarios")
    private List<BeneficiarioNss> beneficiarioNssList;


}
