package br.com.imdb.ioasys.imdbservice01.model;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;



@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
public class Movie {
    @Id
    private Long movieId;


    private String name;



    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", shape = JsonFormat.Shape.STRING)
    private LocalDateTime createdDate;

    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", shape = JsonFormat.Shape.STRING)
    private  LocalDateTime lastModified;
}
