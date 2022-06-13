package br.com.imdb.ioasys.imdbservice01.repository;

import br.com.imdb.ioasys.imdbservice01.model.Role;
import br.com.imdb.ioasys.imdbservice01.model.RoleType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
        Optional<Role> findByName(RoleType name);
}
