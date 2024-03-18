package Lista.Estudiantes.com.co.Api;


import Lista.Estudiantes.com.co.Entity.Estudiante;
import Lista.Estudiantes.com.co.Service.EstudianteService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@CrossOrigin
public class EstudianteApi {

    Logger logger = LoggerFactory.getLogger(EstudianteApi.class);

    @Autowired
    private EstudianteService estudianteService;

    @PostMapping("/estudiante")
    public ResponseEntity<Estudiante> agregar(@RequestBody Estudiante estudiante){
        logger.info("[agregar(...)] - ingresamos  correctamente al metodo {}",estudiante);
        Estudiante estudianteOut = estudianteService.save(estudiante);
        logger.info("[agregar(...)] - valores de retorno {}",estudianteOut);
        return ResponseEntity.ok().body(estudianteOut);
    }

    @PutMapping("/actualizarEstudiante")
    public ResponseEntity<Estudiante> actualizar(@RequestBody Estudiante estudiante){
        logger.info("[actualizar(...)] - ingresamos correctamente al metodo {}",estudiante);
        Estudiante estudianteOut = estudianteService.actualizar(estudiante);
        logger.info("estudiante devuelto {}",estudianteOut);
        estudianteOut.setNombre(estudiante.getNombre());
        estudianteOut.setApellido(estudiante.getApellido());
        estudianteOut.setEdad(estudiante.getEdad());
        estudianteOut.setCedula(estudiante.getCedula());
        estudianteOut.setGrado(estudiante.getGrado());
        logger.info("estudianteOut {}",estudianteOut);
        estudianteService.save(estudianteOut);


        return ResponseEntity.ok().body(estudianteOut);
    }

    @GetMapping("/obtenerLista")
    public ResponseEntity<List<Estudiante>> Lista(){
        logger.info("[lista(...)] - Ingresamos correctamente al metodo ");
        List<Estudiante> estudiante = estudianteService.lista();
        return ResponseEntity.ok().body(estudiante);
    }

    @DeleteMapping("/{id}")
    public void eliminarEstudiante(@PathVariable Long id){
    estudianteService.eliminarEstudiante(id);
    }

}
