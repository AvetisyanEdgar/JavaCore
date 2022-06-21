package book.chapter8;

public class Box {
    double width;
    double height;
    double depth;

    Box(double w, double h, double d) {
        this.depth = d;
        this.width = w;
        this.height = h;
    }

    Box() {
        width = -1;
        height = -1;
        depth = -1;
    }

    Box(Box ob) {
        width = ob.width;
        depth = ob.depth;
        height = ob.height;
    }

    Box(double len) {
        depth = width = height = len;
    }

    double volume() {
        return height * width * depth;
    }

}

