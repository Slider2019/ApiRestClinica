package med_voll.api;

import jakarta.validation.Valid;
import med_voll.api.medico.DatosRegistroMedico;
import med_voll.api.medico.Medico;
import med_voll.api.medico.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    @Autowired
    private MedicoRepository medicoRepository;

    @PostMapping
    public void registrarMedico(@RequestBody @Valid DatosRegistroMedico datosRegistroMedico){
        medicoRepository.save(new Medico(datosRegistroMedico));
    }

    @GetMapping
    public List<Medico> listadoMedicos(){
        return medicoRepository.findAll();
    }
}
