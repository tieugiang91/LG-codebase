package factory_pattern;

public class PolygonFactory {
    public Polygon getPolygon(String type) {
        if(type == null){
            return null;
        }
        if(type.equals("TRIANGLE")){
            return new Triangle();
        } else if(type.equals("SQUARE")){
            return new Square();
        } else if(type.equals("RECTANGLE")){
            return new Rectangle();
        }
        return null;
    }

}
