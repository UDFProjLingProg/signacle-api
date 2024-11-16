package org.UDFProjLingProg.signacle.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.AttributeOverride;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.UDFProjLingProg.signacle.constants.SchemaConstants;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "tb_roles", schema = SchemaConstants.LIBRAS)
@AttributeOverride(name = "id", column = @Column(name = "id_role"))
public class Roles {

    @Id
    @GeneratedValue
    @Column(name = "id_role")
    private Long id;
    @Column(unique = true, nullable = false)
    private String name;
    @ManyToMany(mappedBy = "roles")
    @JsonIgnore
    private List<User> users;

}
