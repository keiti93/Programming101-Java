package week05.Monday;

import java.util.Iterator;

import week04.Friday.Circle;

public class Vector {
    private float[] coordinates;

    public Vector(float... coordinates) {
        this.coordinates = coordinates;
    }

    public Vector(Vector v) {
        this.coordinates = v.coordinates;
    }

    public float get(int i) {
        return this.coordinates[i];
    }

    public void set(int i, float element) {
        this.coordinates[i] = element;
    }

    public int getDim() {
        return this.coordinates.length;
    }

    public float getLength() {
        float result = 0;
        int i = 0;
        while (i != this.coordinates.length) {
            result += this.coordinates[i] * this.coordinates[i];
            i++;
        }
        return (float) Math.sqrt(result);
    }

    public Vector add(Vector v) {
        if (this.getDim() != v.getDim()) {
            System.out.println("The vectors cannot be added.");
        }
        float[] result = new float[v.coordinates.length];
        for (int i = 0; i < coordinates.length; i++) {
            result[i] = coordinates[i] + v.coordinates[i];
        }
        return new Vector(result);
    }

    public Vector substract(Vector v) {
        if (this.getDim() != v.getDim()) {
            System.out.println("The vectors cannot be substracted.");
        }
        float[] result = new float[v.coordinates.length];
        for (int i = 0; i < coordinates.length; i++) {
            result[i] = coordinates[i] - v.coordinates[i];
        }
        return new Vector(result);
    }

    public int dotProduct(Vector v) {
        if (this.getDim() != v.getDim()) {
            System.out.println("The vectors cannot be multyplied.");
        }
        int result = 0;
        for (int i = 0; i < coordinates.length; i++) {
            result += coordinates[i] * v.coordinates[i];
        }
        return result;
    }

    public String toString() {
        String result = "[";
        for (int i = 0; i < this.coordinates.length - 1; i++) {
            result += this.coordinates[i] + ", ";
        }
        return result + this.coordinates[this.coordinates.length - 1] + "]";
    }

    public int hashCode() {
        int hash = 17;
        for (int i = 0; i < this.coordinates.length - 1; i++) {
            hash = hash * 23 + new Float(this.coordinates[i]).hashCode();
        }
        return hash;
    }

    public boolean equals(Vector v) {
        boolean flag = true;
        if (this.getDim() != v.getDim()) {
            return false;
        }
        for (int i = 0; i < this.coordinates.length; i++) {
            if (this.coordinates[i] != v.coordinates[i]) {
                flag = false;
            }
        }
        return flag;

    }

    public static void main(String[] args) {
        Vector v = new Vector(1, 2, 5, 6, 7);
        Vector w = new Vector(2, 3, 4, 5, 6);
        System.out.println(v.toString());
        v.set(2, 666);
        System.out.println(v.toString());
        System.out.println(v.get(4));
        System.out.println(v.getDim());
        System.out.println(v.equals(w));
        System.out.println(v.add(w));
        System.out.println(v.dotProduct(w));
    }
}
