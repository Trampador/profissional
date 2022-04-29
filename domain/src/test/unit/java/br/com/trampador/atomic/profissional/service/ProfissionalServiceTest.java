package br.com.trampador.atomic.profissional.service;

import br.com.trampador.atomic.profissional.domain.Profissional;
import br.com.trampador.atomic.profissional.port.ProfissionalRepository;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class ProfissionalServiceTest {
    @Test
    public void testServiceGetProfissional() {
        var repository = mock(ProfissionalRepository.class);
        var sut = new ProfissionalService(repository);

        when(repository.getProfissional()).thenReturn(new Profissional("test-id", 20));

        Profissional domainModel = sut.getProfissional();

        assertEquals("test-id", domainModel.getId());
        assertEquals(Integer.valueOf(20), domainModel.getVersion());
    }
}
