package intro;

interface ShapeDemo {
    int side = 10; //automatically final static

    int calculateArea(int side); //Abstract method
    // does not have body
    // must be overridden in child class of current interface
    // if not overridden that class will become abstract class
    // abstract class - object can not be created
}

interface ShapeTriangle {
    int calculateArea(int base, int height);
}
