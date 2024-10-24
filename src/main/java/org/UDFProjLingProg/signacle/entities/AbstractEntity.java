package org.UDFProjLingProg.signacle.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import org.UDFProjLingProg.signacle.constants.UtilsConstants;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import java.util.UUID;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@ToString
@MappedSuperclass
public class AbstractEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "created_date", nullable = false)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = UtilsConstants.DATE_TIME_PATTERN)
    private LocalDateTime created;

}