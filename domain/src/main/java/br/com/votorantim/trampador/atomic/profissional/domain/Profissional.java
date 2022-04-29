package br.com.votorantim.trampador.atomic.profissional.domain;

import lombok.*;

/**
 * Classe de entidade de dominio <code>Profissional</code>.
 */
@Data
@AllArgsConstructor
public class Profissional {
    private String id;
    private Integer version;
}
