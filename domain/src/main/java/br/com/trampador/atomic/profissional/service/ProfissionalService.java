package br.com.trampador.atomic.profissional.service;

import br.com.trampador.atomic.profissional.domain.Profissional;
import br.com.trampador.atomic.profissional.port.ProfissionalRepository;
import lombok.RequiredArgsConstructor;

/**
 * Classe de servico de dominio.
 */
@RequiredArgsConstructor
public class ProfissionalService {
    private final ProfissionalRepository repository;

    public Profissional getProfissional() {
        return repository.getProfissional();
    }
}
