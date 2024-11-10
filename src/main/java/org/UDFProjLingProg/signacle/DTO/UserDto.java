package org.UDFProjLingProg.signacle.DTO;

import org.UDFProjLingProg.signacle.Utils.Abstracts.AbstractEntityDTO;
import java.util.UUID;
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
public class UserDto extends AbstractEntityDTO {
    private String firstName;
    private String lastName;
    private String  email;
    private String password;
}
