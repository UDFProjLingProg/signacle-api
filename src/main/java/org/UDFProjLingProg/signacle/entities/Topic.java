package org.UDFProjLingProg.signacle.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;
import org.UDFProjLingProg.signacle.Utils.Abstracts.AbstractEntity;
import org.UDFProjLingProg.signacle.constants.SchemaConstants;

import java.util.UUID;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "tb_topics", schema = SchemaConstants.LIBRAS)
public class Topic extends AbstractEntity {

    @Column(name = "word", nullable = false)
    private String word;

    @Column(name = "description")
    private String description;

    @Column(name = "image", nullable = false)
    private String image;

    @Column(name = "video", nullable = false)
    private Integer video;

    @Column(name = "comment", nullable = false)
    private String comment;

    @Column(name = "created_date", nullable = false)
    private LocalDateTime createdDate;

}
