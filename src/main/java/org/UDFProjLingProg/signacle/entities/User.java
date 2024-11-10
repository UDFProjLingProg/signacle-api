package org.UDFProjLingProg.signacle.entities;

import org.UDFProjLingProg.signacle.Utils.Abstracts.AbstractEntity;
import org.UDFProjLingProg.signacle.constants.SchemaConstants;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_users", schema = SchemaConstants.LIBRAS)
@AttributeOverride(name = "id", column = @Column(name = "id_user"))
public class User extends AbstractEntity {
    @Column(name= "first_name")
    private String firstName;

    @Column(name= "last_name")
    private String lastName;

    @Column(name= "email")
    private String email;

    @Column(name= "password")
    private String password;
}

