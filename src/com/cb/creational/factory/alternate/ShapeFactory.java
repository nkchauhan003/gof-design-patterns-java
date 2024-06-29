package com.cb.creational.factory.alternate;

import com.cb.creational.factory.Circle;
import com.cb.creational.factory.Rectangle;
import com.cb.creational.factory.Shape;
import com.cb.creational.factory.Square;

public class ShapeFactory {
    private static ShapeFactory instance;

    private ShapeFactory() {
        // private constructor to prevent instantiation
    }

    public static synchronized ShapeFactory getInstance() {
        if (instance == null) {
            instance = new ShapeFactory();
        }
        return instance;
    }

    public static Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }

        // handle other shapes or return null
        return null;
    }
}