package org.UDFProjLingProg.signacle.entities.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.UDFProjLingProg.signacle.entities.DTO.AbstractEntityDTO;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class LibraDto extends AbstractEntityDTO{
    private String nameVideo;

    private String urlVideo;

    private Integer description;
}
