package br.com.imdb.ioasys.imdbservice01.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import javax.persistence.*;
import java.util.Objects;



@AllArgsConstructor
@Entity
@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
@Setter
@RequiredArgsConstructor
@ToString
public class Genre {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long genreId;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private GenreOpcion genre;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Genre that = (Genre) object;
        return genreId.equals(that.genreId) && genre == that.genre;
    }

    @Override
    public int hashCode() {
        return Objects.hash(genreId, genre);
    }
}


