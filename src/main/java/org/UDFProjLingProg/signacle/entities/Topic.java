package org.UDFProjLingProg.signacle.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.UDFProjLingProg.signacle.Utils.Abstracts.AbstractEntity;
import org.UDFProjLingProg.signacle.constants.SchemaConstants;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
@Table(name = "tb_topics", schema = SchemaConstants.LIBRAS)
@AttributeOverride(name = "id", column = @Column(name = "id_topic"))
public class Topic extends AbstractEntity {

  @Column(name = "word", nullable = false)
  private String word;

  @Column(name = "description")
  private String description;

  @Column(name = "image", nullable = false)
  private String image;

  @Column(name = "video", nullable = false)
  private String video;

  @Column(name = "comment", nullable = false)
  private String comment;

  @ManyToOne
  @JoinColumn(name = "id_course")
  private Course course;
}
