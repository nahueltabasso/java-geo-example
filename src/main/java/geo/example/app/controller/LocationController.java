package geo.example.app.controller;

import geo.example.app.models.entity.Location;
import geo.example.app.models.repository.LocationRepository;
import org.locationtech.jts.geom.Coordinate;
import org.locationtech.jts.geom.GeometryFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/location")
public class LocationController {

    @Autowired
    private LocationRepository locationRepository;

    @PostMapping
    public ResponseEntity<?> add() {
        GeometryFactory factory = new GeometryFactory();

        Location location = new Location();
        location.setName("admin");
        location.setCoordinate(factory.createPoint(new Coordinate(-32.978742, -60.678253)));
        location = locationRepository.save(location);
        return ResponseEntity.ok().body(location);
    }
}
