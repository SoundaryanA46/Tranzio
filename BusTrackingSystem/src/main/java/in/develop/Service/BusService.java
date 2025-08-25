package in.develop.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.develop.Model.Bus;
import in.develop.Repo.BusRepo;

@Service
public class BusService {
	
	private final  BusRepo repo;
	
	public BusService(BusRepo repo) {
		this.repo = repo;
	}

	public List<Bus> getAllBus() {
		return repo.findAll();
	}

	public Bus getBusByNo(int busno) {
	    return repo.findByBusNo(busno)
	               .orElseThrow(() -> new RuntimeException("Bus not found with busNo: " + busno));
	}

	public void addBusDetails(Bus bus) {
		repo.save(bus);
	}
	
	 public void saveAll(List<Bus> buses) {
		    repo.saveAll(buses); // Now saves to DB
		}

	public void updateBusDetails(Bus updatedBus) {
        Bus existingBus = repo.findByBusNo(updatedBus.getBusNo())
                .orElseThrow(() -> new RuntimeException("Bus not found with busNo: " + updatedBus.getBusNo()));
        updatedBus.setId(existingBus.getId()); // Ensure JPA knows this is an update
        repo.save(updatedBus); // Will update all fields
	}

	  public void deleteBusDetails(int busno) {
	        Bus bus = repo.findByBusNo(busno)
	                .orElseThrow(() -> new RuntimeException("Bus not found with busNo: " + busno));
	        repo.delete(bus);
	    }
}
