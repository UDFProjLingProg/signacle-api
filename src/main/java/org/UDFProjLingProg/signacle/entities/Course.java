package org.UDFProjLingProg.signacle.entities;

import org.UDFProjLingProg.signacle.Utils.Abstracts.AbstractEntity;
import org.UDFProjLingProg.signacle.constants.SchemaConstants;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "tb_course", schema = SchemaConstants.LIBRAS)
public class Course extends AbstractEntity {

    private String name;
    @Column(name = "url_image")
    private String urlImage;
    @Column(name = "url_video")
    private String urlVideo;

}
