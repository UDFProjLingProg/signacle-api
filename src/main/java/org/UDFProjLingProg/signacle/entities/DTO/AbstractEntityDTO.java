package org.UDFProjLingProg.signacle.entities.DTO;

import java.io.Serializable;
import java.util.UUID;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public abstract class AbstractEntityDTO implements Serializable {

    protected AbstractEntityDTO() {
    }

    private Long id;

}
