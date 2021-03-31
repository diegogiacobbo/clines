package br.com.caelum.clines.api.users;

import br.com.caelum.clines.shared.domain.User;
import br.com.caelum.clines.shared.infra.Mapper;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends Repository<User, String> {

    List<User> findAll();

    Optional<User> findById(Long id);

    void save(User user);

    Optional<User> findByEmail(String email);
}
