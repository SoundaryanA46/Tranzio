package in.develop.Controller;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.develop.Model.Bus;
import in.develop.Service.BusService;

@RestController
@CrossOrigin(origins = "*")
public class Controller {
	private final BusService service;

	public Controller(BusService service){
		this.service = service;
	}
	
	@RequestMapping("/hi")
	public String  hello() {
		return "Spring boot world!!..";
	}
	@GetMapping("/track/bus")
		public List<Bus> trackBusDetails(){
			return service.getAllBus();
		}
	
	@GetMapping("/track/bus/{busno}")
	public Bus trackBus(@PathVariable int busno) {
		return service.getBusByNo(busno);
	}
	
	@GetMapping("/bus")
	public List<Bus> getBusDetails(){
		return service.getAllBus();
	}
	
	@GetMapping("/bus/{busNo}")
	public Bus getBusByNo(@PathVariable("busNo") int busno) {
	    return service.getBusByNo(busno);
	}

	@PostMapping("/bus")
	public void addBusDetails(@RequestBody Bus bus) {
		service.addBusDetails(bus);
	}
	@PostMapping("/buses")
	public ResponseEntity<String> addBuses(@RequestBody List<Bus> buses) {
	    // Save all buses
	    service.saveAll(buses);
	    return ResponseEntity.ok("Buses saved successfully");
	}

	@PutMapping("/bus")
	public void updateBusDetails(@RequestBody Bus bus) {
		service.updateBusDetails(bus);
	}
	@DeleteMapping("/bus/{busNo}")
	public void deleteBusDetails(@PathVariable("busNo") int busno) {
	    service.deleteBusDetails(busno);
	}

}
