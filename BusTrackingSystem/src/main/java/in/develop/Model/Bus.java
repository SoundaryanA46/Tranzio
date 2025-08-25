package in.develop.Model;

import java.util.List;
import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "bus_details")
public class Bus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bus_id")
    private int id;

    @Column(name = "bus_no", nullable = false, unique = true)
    private int busNo;

    @Column(nullable = false)
    private String place;

    @Column(nullable = false)
    private String time;

    @Column
    private String url;

    @ElementCollection
    @CollectionTable(
        name = "bus_routes",
        joinColumns = @JoinColumn(name = "bus_id") // Foreign key linking to bus_details
    )
    @Column(name = "route_name", nullable = false)
    private List<String> routes;
}
