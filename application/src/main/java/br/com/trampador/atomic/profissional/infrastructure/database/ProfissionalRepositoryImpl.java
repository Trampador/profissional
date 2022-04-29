package br.com.trampador.atomic.profissional.infrastructure.database;

import br.com.trampador.atomic.profissional.domain.Profissional;
import br.com.trampador.atomic.profissional.port.ProfissionalRepository;
import org.springframework.stereotype.Repository;

/**
 * Implementacao do repositorio do dominio <code>Profissional</code>.
 */
@Repository
public class ProfissionalRepositoryImpl implements ProfissionalRepository {
    public Profissional getProfissional() {
        return new Profissional("id", 1);
    }
}
