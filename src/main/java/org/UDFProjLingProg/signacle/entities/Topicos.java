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
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "tb_topics", schema = SchemaConstants.LIBRAS)
public class Topic extends AbstractEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_topico", columnDefinition = "UUID", nullable = false, updatable = false)
    private UUID idTopico;

    @Column(name = "palavra", nullable = false)
    private String palavra;

    @Column(name = "explicacao_palavra")
    private String explicacaoPalavra;

    @Column(name = "imagem", nullable = false)
    private String imagem;

    @Column(name = "video", nullable = false)
    private Integer video;

    @Column(name = "comentario", nullable = false)
    private String comentario;

    @Column(name = "created_date")
    private LocalDateTime createdDate;
}