package org.UDFProjLingProg.signacle.entities;

import jakarta.persistence.*;
import lombok.*;
import org.UDFProjLingProg.signacle.Utils.Abstracts.AbstractEntity;
import org.UDFProjLingProg.signacle.constants.SchemaConstants;

import java.sql.Timestamp;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "tb_libra", schema = SchemaConstants.LIBRAS)
public class Libras extends AbstractEntity {

    @Column(nullable = false)
    private String name;

    @Column
    private String description;

    @Column(name = "url_image")
    private String urlImage;

    @Column(name = "url_video")
    private String urlVideo;

    @Column(name = "created_date", nullable = false)
    private Timestamp createdDate;

    @ManyToOne
    @JoinColumn(name = "fk_topic", nullable = false)
    private Topic topic;

}
