package br.com.votorantim.trampador.atomic.profissional.mapper;

import br.com.votorantim.trampador.atomic.profissional.domain.Profissional;
import br.com.votorantim.trampador.atomic.profissional.presentation.representation.ProfissionalRepresentation;

public class ProfissionalMapper {
  public static ProfissionalRepresentation toRepresentation(Profissional profissional) {
    ProfissionalRepresentation representation = new ProfissionalRepresentation(profissional.getId(), profissional.getVersion());
    return representation;
  }
}
