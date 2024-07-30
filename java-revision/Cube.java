/*
Create a Cube class that represents a cube. Create a public Cube (edgeLength) constructor for the class, that takes the length of the cube's edge as its parameter.
Make a volume() method for the cube, which calculates and returns the cube's volume. 
The volume of the cube is calculated with the formula edgeLength * edgeLength * edgeLength. 
Moreover, make a toString() method for the cube, which returns a string representation of it - "The length of the edge is l and the volume v", where l is the length and v the volume - both the length and volume must be represented as integers.
*/

public class Cube {
    private int edgeLength; // volume does not need to be a parameter

    public Cube (int edgeLength) { 
        this.edgeLength = edgeLength;
    }

    public int volume() {
        return edgeLength * edgeLength * edgeLength; // volume method should calculate the volume without storing it as a field(?)
    }

    public String toString() { 
        return "the length of the edge is " + edgeLength + " and the volume " + volume(); // toString method should calculate the volume dynamically instead of using a potentially outdated volume field(?)
    }
}
