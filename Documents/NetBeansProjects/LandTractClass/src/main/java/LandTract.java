/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hari's
 */
public class LandTract {

    private double Length;
    private double Width;
    private double Area;

    public LandTract() {
        Area = 0.0;
    }

    public LandTract(double Le, double Wi) {
        Length = Le;
        Width = Wi;
    }

    public double getlength(double Length) {
        return Length;
    }

    public double getwidth(double Width) {
        return Width;
    }

    public double getArea() {
        Area = Length * Width;
        return Area;
    }

    public boolean equals(LandTract Lan2) {
        return this.Area == Lan2.Area;
    }

    public String toString(double Area) {
        return "Area:" + Area;
    }
}
