package org.UDFProjLingProg.signacle.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import org.UDFProjLingProg.signacle.Utils.Abstracts.AbstractEntity;
import org.UDFProjLingProg.signacle.constants.SchemaConstants;

import java.sql.Timestamp;
import jakarta.persistence.Table;
import lombok.Builder;
import org.UDFProjLingProg.signacle.Utils.Abstracts.AbstractEntity;
import org.UDFProjLingProg.signacle.constants.SchemaConstants;

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
