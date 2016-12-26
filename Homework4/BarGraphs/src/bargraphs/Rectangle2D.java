/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bargraphs;

/**
 * Class representing a Rectangle
 *
 * @author Aaron
 */
public class Rectangle2D {

    public static class Float extends Rectangle2D {

        /**
         * Accessor to get X
         *
         * @return double X
         */
        public double getX() {
            return x;
        }

        /**
         * Accessor to get Y
         *
         * @return double Y
         */
        public double getY() {
            return y;
        }

        /**
         * Accessor to get Width
         *
         * @return double Width of Rectangle
         */
        public double getWidth() {
            return width;
        }

        /**
         * Accessor to get Height
         *
         * @return double Height of Rectangle
         */
        public double getHeight() {
            return height;
        }

        /**
         * Mutator for setting x,y,width, and height
         *
         * @param x float representing x of rectangle
         * @param y float representing y of rectangle
         * @param w float representing width of rectangle
         * @param h float representing height of rectangle
         */
        public void setRect(float x, float y, float w, float h) {
            this.x = x;
            this.y = y;
            this.width = w;
            this.height = h;
        }

        /**
         * Mutator for setting x,y,width, and height
         *
         * @param x double representing x of rectangle
         * @param y double representing y of rectangle
         * @param w double representing width of rectangle
         * @param h double representing height of rectangle
         */
        public void setRect(double x, double y,
                double w, double h) {
            this.x = (float) x;
            this.y = (float) y;
            this.width = (float) w;
            this.height = (float) h;
        }
    }

    public float x;
    public float y;
    public float width;
    public float height;

}
