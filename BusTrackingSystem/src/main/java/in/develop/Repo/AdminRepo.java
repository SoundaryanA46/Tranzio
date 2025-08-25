package in.develop.Repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.develop.Model.Admin;


@Repository
public interface AdminRepo  extends JpaRepository<Admin,Long> {
	Optional<Admin> findByUsername(String username);
}
