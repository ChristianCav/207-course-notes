/**
 * Exercise 05.
 */
public class Rectangle {
  private double width;
  private double height;

  /**
   * Initialize a Rectangle.
   *
   * @param w any double
   * @param h any double
   */
  public Rectangle(double w, double h) {
    this.width = w;
    this.height = h;
  }

  /**
   * Return the area.
   *
   * @return the area of the rectangle
   */
  public double area() {
    return width * height;
  }

  /**
   * Scales the rectangle.
   *
   * @param factor the scaling factor
   */
  public void scale(double factor) {
    width = width * factor;
    height = height * factor;
  }

  /**
   * Returns whether this Rectangle has a larger area than the other rectangle.
   *
   * @param other any Rectangle
   * @return true if this rectangle is larger than the other, false otherwise
   */
  public boolean isLargerThan(Rectangle other) {
    if (area() > other.area()) {
      return true;
    } else {
      return false;
    }
  }
}