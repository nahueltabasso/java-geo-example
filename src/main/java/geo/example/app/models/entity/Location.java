package geo.example.app.models.entity;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import geo.example.app.config.PointSerializer;
import org.locationtech.jts.geom.Point;

import javax.persistence.*;

@Entity
@Table(name = "locations")
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column(columnDefinition = "POINT")
    @JsonSerialize(using = PointSerializer.class)
    private Point coordinate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Point getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(Point coordinate) {
        this.coordinate = coordinate;
    }
}
