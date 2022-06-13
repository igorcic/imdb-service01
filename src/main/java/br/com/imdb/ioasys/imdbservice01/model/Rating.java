package br.com.imdb.ioasys.imdbservice01.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.persistence.*;
import java.util.Objects;



@AllArgsConstructor
@Entity
@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
@Setter
@RequiredArgsConstructor
@Table(name = "ratings")
@ToString
public class Rating {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long ratingId;

    @JoinColumn(name = "movie_id", nullable = false)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @ManyToOne(optional = false)
    @ToString.Exclude
    private Movie movie;

    @JoinColumn(name = "user_id", nullable = false)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @ManyToOne(optional = false)
    @ToString.Exclude
    private User user;

    @Column(nullable = false)
    private int stars = 0;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Rating that = (Rating) object;
        return ratingId.equals(that.ratingId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ratingId);
    }
}
