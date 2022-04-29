package br.com.votorantim.trampador.atomic.profissional.port;

import br.com.votorantim.trampador.atomic.profissional.domain.Profissional;

/**
 * Interface de repositorio base do Dominio <code>Profissional</code>.
 */
public interface ProfissionalRepository {
    Profissional getProfissional();
}
