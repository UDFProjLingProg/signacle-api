package org.UDFProjLingProg.signacle.DTO;

import lombok.*;
import org.UDFProjLingProg.signacle.Utils.Abstracts.AbstractEntityDTO;

@Data
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class UserDto extends AbstractEntityDTO {
    private String name;
    private String  email;
}
