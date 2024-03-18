package Lista.Estudiantes.com.co.Repository;

import Lista.Estudiantes.com.co.Entity.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface EstudianteRepository extends JpaRepository<Estudiante, Long> {


    Optional<Estudiante> findByCedula(Long cedula);

    Estudiante save (Estudiante estudiante);

    List<Estudiante> findAll();

    void deleteById(Long id);


}
