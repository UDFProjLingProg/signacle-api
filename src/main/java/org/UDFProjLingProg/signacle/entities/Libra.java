package org.UDFProjLingProg.signacle.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.UDFProjLingProg.signacle.Utils.Abstracts.AbstractEntity;
import org.UDFProjLingProg.signacle.constants.SchemaConstants;

import java.sql.Timestamp;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
@Table(name = "tb_libra", schema = SchemaConstants.LIBRAS)
@AttributeOverride(name = "id", column = @Column(name = "id_libra"))
public class Libra extends AbstractEntity {

    @Column(nullable = false)
    private String name;

    @Column
    private String description;

    @Column(name = "url_image")
    private String urlImage;

    @Column(name = "url_video")
    private String urlVideo;

    @ManyToOne
    @JoinColumn(name = "id_topic", nullable = false)
    private Topic topic;

}
