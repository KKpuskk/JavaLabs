package ru.ivt5.v3.gen;

import ru.ivt5.v3.Figure;
import ru.ivt5.v3.iface.HasArea;

public class PairBox<T extends Figure> implements HasArea {
    private T contentFirst;
    private T contentSecond;

    public PairBox(T contentFirst, T contentSecond) {
        this.contentFirst = contentFirst;
        this.contentSecond = contentSecond;
    }

    public T getContentFirst() {
        return contentFirst;
    }

    public void setContentFirst(T contentFirst) {
        this.contentFirst = contentFirst;
    }

    public T getContentSecond() {
        return contentSecond;
    }

    public void setContentSecond(T contentSecond) {
        this.contentSecond = contentSecond;
    }

    @Override
    public double getArea() {
        return contentFirst.getArea() + contentSecond.getArea();
    }

    public boolean isAreaEqual(PairBox<?> other) {
        return this.getArea() == other.getArea();
    }

    public static boolean isAreaEqual(PairBox<?> box1, PairBox<?> box2) {
        return box1.getArea() == box2.getArea();
    }
}
