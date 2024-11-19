package org.UDFProjLingProg.signacle.Utils.Abstracts;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.experimental.SuperBuilder;
import org.UDFProjLingProg.signacle.constants.UtilsConstants;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@SuperBuilder
@JsonIgnoreProperties({"createdBy", "updatedBy", "created", "updated", "excluded"})
@JsonInclude(JsonInclude.Include.NON_NULL)
public abstract class AbstractEntityDTO implements Serializable {

    protected AbstractEntityDTO() {
    }

    private UUID id;

    private UUID createdBy;

    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = UtilsConstants.DATE_TIME_PATTERN)
    private LocalDateTime created;

}

