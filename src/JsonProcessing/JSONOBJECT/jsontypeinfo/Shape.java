package JsonProcessing.JSONOBJECT.jsontypeinfo;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY)
@JsonSubTypes({
        @JsonSubTypes.Type(value = Rectangle.class),
        @JsonSubTypes.Type(value = Circle.class)})
public abstract class Shape {
}