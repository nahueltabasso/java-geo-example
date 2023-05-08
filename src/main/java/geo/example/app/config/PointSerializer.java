package geo.example.app.config;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import org.locationtech.jts.geom.Point;

import java.io.IOException;

public class PointSerializer extends JsonSerializer<Point>{


    @Override
    public void serialize(Point point, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeStartObject();
        jsonGenerator.writeFieldName("x");
        jsonGenerator.writeNumber(point.getX());
        jsonGenerator.writeFieldName("y");
        jsonGenerator.writeNumber(point.getY());
        jsonGenerator.writeEndObject();
    }
}
