package br.com.trampador.atomic.profissional.config;

import br.com.trampador.atomic.profissional.service.ProfissionalService;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import br.com.trampador.atomic.profissional.port.ProfissionalRepository;

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
