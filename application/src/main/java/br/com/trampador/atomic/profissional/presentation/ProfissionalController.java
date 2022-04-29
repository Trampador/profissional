package br.com.trampador.atomic.profissional.presentation;

import br.com.trampador.atomic.profissional.mapper.ProfissionalMapper;
import br.com.trampador.atomic.profissional.service.ProfissionalService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import br.com.trampador.atomic.profissional.presentation.representation.ProfissionalRepresentation;

/**
 * Adaptador para HTTP do dominio <code>Profissional</code>.
 */
@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/v1/profissional")
public class ProfissionalController {
    @Autowired
    private ProfissionalService profissionalService;

    @GetMapping
    public ProfissionalRepresentation getProfissional() {
        return ProfissionalMapper.toRepresentation(profissionalService.getProfissional());
    }
}
