package Lista.Estudiantes.com.co.Service;

import Lista.Estudiantes.com.co.Entity.Estudiante;

import java.util.List;

public interface EstudianteService {

    Estudiante save (Estudiante estudiante);

    Estudiante actualizar(Estudiante estudiante);
    List<Estudiante> lista();
    void eliminarEstudiante(Long id);
}
