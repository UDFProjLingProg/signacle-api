package org.UDFProjLingProg.signacle.DTO;

import org.UDFProjLingProg.signacle.Utils.Abstracts.AbstractEntityDTO;
import java.util.UUID;

public class UserDto extends AbstractEntityDTO {
    private String username;
    private String password;
    private String name;
    private UUID id_role;
}
