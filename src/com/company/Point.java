package com.company;

public class Point {
    private double x = 0.0f;
    private double y = 0.0f;

    public Point(){
        // default constructor
    }

    public Point ( double x, double y ){
        this.x = x;
        this.y = y;
    }

    public double getDistanceToPoint ( Point b ){
        /*
                | < --- xb ----- O ( xb, yb )
                |           D   /|
                | <--- xa --> O( xa , ya )
                |             ^  |
                |         ya  |  | yb
         ------ o ---------------------
                |

           D<ab> = sqrt( ( xb - xa )^ + ( yb - ya )^ )   if the difference is equal to or less than 0 D is ZERO, next -> flip
        */
        double D = Math.sqrt( Math.pow(( b.getX() - this.getY() ), 2) + Math.pow(( b.getY() - this.getY() ), 2) );
        // if zero reverse check
        return(
                ( Double.compare( D, 0 ) == 0 )?
                        ( Math.sqrt( Math.pow(( this.getX() - b.getX() ), 2) + Math.pow(( this.getY() - b.getY()), 2 ) ) )
                        :D
        );
    }

    public boolean equals( Point b ){
        return ( Double.compare(b.getX() , this.getX() ) == 0 && Double.compare(b.getY() , this.getY() ) == 0 );
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}