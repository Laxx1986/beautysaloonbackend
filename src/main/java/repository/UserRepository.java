package repository;

import jakarta.transaction.Transactional;
import model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Transactional
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String userName);
}
