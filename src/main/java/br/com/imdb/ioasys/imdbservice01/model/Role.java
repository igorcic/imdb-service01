package br.com.imdb.ioasys.imdbservice01.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import javax.persistence.*;
import java.util.Objects;
import java.util.UUID;

@AllArgsConstructor
@Entity
@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
@Setter
@RequiredArgsConstructor
@Table(name = "roles")
@ToString
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID roleId;

    @Enumerated(EnumType.STRING)
    @Column(length = 16, nullable = false, unique = true)
    private RoleType name;

    @JsonIgnore
    public String getAuthority() {
        return this.name.toString();
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Role roleModel = (Role) object;
        return roleId.equals(roleModel.roleId) && name == roleModel.name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), roleId, name);
    }
}

