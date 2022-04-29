package br.com.trampador.atomic.profissional.port;

import br.com.trampador.atomic.profissional.domain.Profissional;

/**
 * Interface de repositorio base do Dominio <code>Profissional</code>.
 */
public interface ProfissionalRepository {
    Profissional getProfissional();
}
