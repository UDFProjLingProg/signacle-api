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
    private String url_image;
    private String url_video;
    private Timestamp created_date;
}