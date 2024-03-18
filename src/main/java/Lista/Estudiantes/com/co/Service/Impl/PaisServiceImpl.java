package Lista.Estudiantes.com.co.Service.Impl;

import Lista.Estudiantes.com.co.Entity.Pais;
import Lista.Estudiantes.com.co.Repository.PaisRepository;
import Lista.Estudiantes.com.co.Service.PaisService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PaisServiceImpl implements PaisService {

    Logger logger = LoggerFactory.getLogger(PaisServiceImpl.class);

    @Autowired
        private PaisRepository paisRepository;

    @Override
    public Pais save(Pais pais) {
        logger.info("[save(...)] - Ingresamos correctamente al metodo {}",pais);
        Pais paisOut = paisRepository.save(pais);
        logger.info("[save (...)] - valores de retorno base de datos {}", pais);
        return paisOut;
    }

    @Override
    public Pais update(Long id) {
        logger.info("[update(...)] - ingresamos correctamente al metodo {}",id);
        Optional<Pais> pais = paisRepository.findById(id);
        if (pais.isPresent()){
          return  pais.get();
        }
        return null;
    }
}
