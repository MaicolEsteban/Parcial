package Lista.Estudiantes.com.co.Repository;

import Lista.Estudiantes.com.co.Entity.Pais;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PaisRepository  extends JpaRepository<Pais, Long> {

    Pais save(Pais pais);
    Optional<Pais> findById(Long id);
}
