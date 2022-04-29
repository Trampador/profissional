package br.com.votorantim.trampador.atomic.profissional.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import br.com.votorantim.trampador.atomic.profissional.service.ProfissionalService;
import br.com.votorantim.trampador.atomic.profissional.port.ProfissionalRepository;

/**
 * Classe base de configuracao.
 */
@Configuration
public class ProfissionalConfiguration {
    @Bean
    public ProfissionalService profissionalService(ProfissionalRepository repository) {
        return new ProfissionalService(repository);
    }
}
