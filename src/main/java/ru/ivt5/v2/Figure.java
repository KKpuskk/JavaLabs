package ru.ivt5.v2;

import ru.ivt5.v2.iface.HasArea;
import ru.ivt5.v2.iface.Movable;
import ru.ivt5.v2.iface.Resizable;
import ru.ivt5.v2.iface.Stretchable;

public abstract class Figure implements Movable, HasArea, Stretchable, Resizable {
    private Point pointTopLeft;
    public Figure(Point point){pointTopLeft = point;}

    public Point getPointTopLeft(){return pointTopLeft;}

    public  void setPointTopLeft(Point pointTopLeft) {this.pointTopLeft = pointTopLeft;}

    public void moveTo (Point point){pointTopLeft = point;}

    public abstract  boolean isInside(int x, int y);

    public boolean isInside(Point point) {return false;}

    public abstract double getPerimeter();

}
