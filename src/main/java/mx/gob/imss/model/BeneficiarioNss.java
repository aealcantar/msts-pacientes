package mx.gob.imss.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonRootName(value = "beneficiario")
public class BeneficiarioNss {

    @JsonProperty
    private String nss;

    @JsonProperty
    private String paciente;

    @JsonProperty
    private String Parentesco;

    @JsonProperty
    private String agregadoMedico;

    @JsonProperty
    private String unidadMedica;

    @JsonProperty
    private String curp;

    @JsonProperty
    private String fechaNacimiento;

    @JsonProperty
    private String turno;

    @JsonProperty
    private String consultorio;

    @JsonProperty
    private int edad;

    @JsonProperty
    private String sexo;

}
