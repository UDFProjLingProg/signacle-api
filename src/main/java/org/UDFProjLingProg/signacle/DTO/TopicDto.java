package org.UDFProjLingProg.signacle.DTO;

import java.sql.Timestamp;

import org.UDFProjLingProg.signacle.Utils.Abstracts.AbstractEntityDTO;

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
@EqualsAndHashCode(callSuper = true)
public class TopicDto extends AbstractEntityDTO {

    private String word;
    private String description;
    private String image;
    private String video;
    private String comment;
    private String idCourse;

}
