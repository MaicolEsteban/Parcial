package Lista.Estudiantes.com.co.Api;

import Lista.Estudiantes.com.co.Entity.Pais;
import Lista.Estudiantes.com.co.Service.PaisService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
public class PaisApi {

    Logger logger = LoggerFactory.getLogger(PaisApi.class);

    @Autowired
      private PaisService paisService;

    @PostMapping("/paisAgregar")
    public ResponseEntity<Pais> save(@RequestBody Pais pais){
        logger.info("[save(...)] - ingresamos correctamente al metodo {}",pais);
        Pais paisOut = paisService.save(pais);

        return ResponseEntity.ok().body(paisOut);
    }

    @PutMapping("/Actualizar")
    public ResponseEntity<Pais> update(@RequestBody Pais pais){
        logger.info("[update(...)] - ingresamos correctamente al metodo {}",pais);
        Pais paisOut = paisService.update(pais.getId());
        return null;
    }
}
