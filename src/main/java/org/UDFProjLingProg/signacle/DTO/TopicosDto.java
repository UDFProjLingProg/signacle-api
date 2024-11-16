package org.UDFProjLingProg.signacle.DTO;

import java.util.UUID;
import org.UDFProjLingProg.signacle.Utils.Abstracts.AbstractEntityDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class TopicDto extends AbstractEntityDTO {

    private UUID idTopico;
    private String palavra;
    private String explicacaoPalavra;
    private String imagem;
    private Integer video;
    private String comentario;
}