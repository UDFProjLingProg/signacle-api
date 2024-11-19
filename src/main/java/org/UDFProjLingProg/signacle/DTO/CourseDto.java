package org.UDFProjLingProg.signacle.DTO;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import org.UDFProjLingProg.signacle.Utils.Abstracts.AbstractEntityDTO;

import java.time.LocalDateTime;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class CourseDto extends AbstractEntityDTO {

  private String name;
  private String urlImage;
  private String urlVideo;
  private LocalDateTime createdDate;

}