package in.develop.Repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.develop.Model.Bus;

@Repository
public interface BusRepo extends JpaRepository<Bus,Integer> {
	Optional<Bus> findByBusNo(int busNo);
}
