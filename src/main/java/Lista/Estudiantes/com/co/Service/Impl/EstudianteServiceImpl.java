package Lista.Estudiantes.com.co.Service.Impl;

import Lista.Estudiantes.com.co.Entity.Estudiante;
import Lista.Estudiantes.com.co.Exception.ExceptionsExistingStudent;
import Lista.Estudiantes.com.co.Repository.EstudianteRepository;
import Lista.Estudiantes.com.co.Service.EstudianteService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstudianteServiceImpl  implements EstudianteService {

    @Autowired
    private EstudianteRepository estudianteRepository;

    Logger logger = LoggerFactory.getLogger(EstudianteService.class);


    @Override
    public Estudiante save(Estudiante estudiante) {
        logger.info("[save(...)] - ingresamos correctamente al metodo {}",estudiante);
        Estudiante estudianteIn = estudianteRepository.save(estudiante);
        logger.info("esto guardo en el impl {}",estudianteIn);
        return estudianteIn;
    }

    @Override
    public Estudiante actualizar(Estudiante estudiante) {
        Optional<Estudiante> estudianteOut = estudianteRepository.findByCedula(estudiante.getCedula());
            if (estudianteOut.isPresent()){
                return estudianteOut.get();
            }

        throw new ExceptionsExistingStudent("no esta");



    }


    @Override
    public List<Estudiante> lista() {
    logger.info("[lista(...)] - ingresamos correctamente al metodo {}");
    List<Estudiante> lista = estudianteRepository.findAll();
    return lista;
    }

    @Override
    public void eliminarEstudiante(Long id) {
     estudianteRepository.deleteById(id);
    }
}
