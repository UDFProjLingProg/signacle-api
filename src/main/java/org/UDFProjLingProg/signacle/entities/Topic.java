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
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "tb_topics", schema = SchemaConstants.LIBRAS)
public class Topic extends AbstractEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_topic", columnDefinition = "UUID", nullable = false, updatable = false)
    private UUID idTopic;

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

    // Método para retornar a palavra
    public String getWord() {
        return word;
    }

    // Método para retornar a descrição
    public String getDescription() {
        return description;
    }

    // Método para retornar a imagem
    public String getImage() {
        return image;
    }

    // Método para retornar o vídeo
    public Integer getVideo() {
        return video;
    }

    // Método para retornar o comentário
    public String getComment() {
        return comment;
    }
}
