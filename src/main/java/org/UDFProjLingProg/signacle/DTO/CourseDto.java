package org.UDFProjLingProg.signacle.DTO;

import java.sql.Timestamp;

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
@EqualsAndHashCode(callSuper = false)

public class CourseDto extends AbstractEntityDTO{

    private String name;
    private String urlImage;
    private String urlVideo;
    private Timestamp createdDate;
}