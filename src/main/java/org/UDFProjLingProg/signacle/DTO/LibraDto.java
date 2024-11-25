package org.UDFProjLingProg.signacle.DTO;

import lombok.*;
import org.UDFProjLingProg.signacle.Utils.Abstracts.AbstractEntityDTO;

import java.util.UUID;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class LibraDto extends AbstractEntityDTO {
  private String name;

  private String description;

  private String urlImage;

  private String urlVideo;

  private String idTopic;
}
