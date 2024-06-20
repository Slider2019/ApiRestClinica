package med_voll.api.medico;

import jakarta.validation.constraints.NotNull;
import med_voll.api.direccion.DatosDireccion;

public record DatosActualizarMedico(@NotNull Long id, String nombre, String documento, DatosDireccion direccion) {
}
