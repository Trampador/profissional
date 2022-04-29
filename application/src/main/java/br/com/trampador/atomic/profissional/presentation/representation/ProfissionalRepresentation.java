package br.com.trampador.atomic.profissional.presentation.representation;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
public class ProfissionalRepresentation {
    private String id;
    private Integer version;

    @Deprecated
    public ProfissionalRepresentation() {}
}
