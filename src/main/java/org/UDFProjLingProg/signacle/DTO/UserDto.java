package org.UDFProjLingProg.signacle.DTO;

import lombok.*;
import lombok.experimental.SuperBuilder;
import org.UDFProjLingProg.signacle.Utils.Abstracts.AbstractEntityDTO;

@Data
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class UserDto extends AbstractEntityDTO {
    private String fullName;
    private String  email;
}
