package org.UDFProjLingProg.signacle.DTO;

import java.sql.Timestamp;

import org.UDFProjLingProg.signacle.Utils.Abstracts.AbstractEntityDTO;

<<<<<<< HEAD
=======
import java.util.UUID;
import org.UDFProjLingProg.signacle.Utils.Abstracts.AbstractEntityDTO;
>>>>>>> main
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
<<<<<<< HEAD

public class TopicDto {
=======
public class TopicDto extends AbstractEntityDTO {

>>>>>>> main
    private String word;
    private String description;
    private String image;
    private String video;
    private String comment;

}
