package edu.eci.cvds.patterns.shapes;

import edu.eci.cvds.patterns.shapes.concrete.Hexagon;
import edu.eci.cvds.patterns.shapes.concrete.Pentagon;
import edu.eci.cvds.patterns.shapes.concrete.Quadrilateral;
import edu.eci.cvds.patterns.shapes.concrete.Triangle;

public class ShapeFactory {
    public static Shape create(RegularShapeType type) {
        Shape resp;

        switch (type) {
            case Quadrilateral:
                resp = new Quadrilateral();
                break;

            case Hexagon:
                resp = new Hexagon();
                break;

            case Pentagon:
                resp = new Pentagon();
                break;
            
            default: resp = new Triangle();
        }

        return resp;
    }
}
