package com.maplestory;

public class MagicShield {
    private double radius;
    private double thickness;
    private String elementType;

    private static final double DEFAULT_RADIUS = 1.0;
    private static final double DEFAULT_THICKNESS = 5.0;
    private static int shieldCount = 0;

public MagicShield() {
    this.radius = DEFAULT_RADIUS;
    this.thickness = DEFAULT_THICKNESS;
    this.elementType = "Neutral";
    shieldCount ++;
    }

public MagicShield(double radius, double thickness, String elementType){
    this.radius = radius;
    this.thickness =  thickness;
    this.elementType = elementType;
    shieldCount ++;
}

public double getRadius() {
    return this.radius;
}

public void setRadius(double radius) {
  if (radius < 0){
    throw new IllegalArgumentException("Invalid radius.");
    } else {this.radius = radius;
  }}

public double getThickness() {
    return this.thickness;
}

public void setThickness(double thickness){
    if (thickness < 0){
    throw new IllegalArgumentException("Invalid thickness.");
    } else {this.thickness = thickness;
  }}

public String getElementType() {
    return this.elementType;
}

public void setElementType(String type) {
    if (type == null || type.isEmpty()){
        this.elementType = "Neutral";
    } else {
        this.elementType = type;
    }
}

public static int getShieldCount(){
    return shieldCount;
}

public static boolean isValidSize (double size){
    return (size > 0);
}

public static double calculateDefensePower(double radius, double thickness, String type){
    double c = 1.0;

    if (type == null || type.isEmpty()){
        c = 1.0;
    } else if (type.equalsIgnoreCase("Fire")){
        c = 1.1;
    } else if (type.equalsIgnoreCase("Ice")){
        c = 1.2;
    } else if (type.equalsIgnoreCase("Light")){
        c = 1.3;
    } else if (type.equalsIgnoreCase("Dark")){
        c = 1.4;}
        
        return (radius * thickness) * c;
  
}

public static double calculateManaCost (double r, double t){
    if (r <= 0 || t <= 0){
        throw new IllegalArgumentException("Radius and Thickness must be positive.");
    }
    return (r * 10) + (t * 2);
}

public double calculateDefensePower(){
    
    return calculateDefensePower(this.radius, this.thickness, this.elementType);
}

public double calculateManaCost(){
    return calculateManaCost(this.radius, this.thickness);
}

    @Override
    public String toString(){
    return String.format(
        "[MagicShield]%nElement Type: %s%nRadius: %.1f%nThickness: %.1f%nDefense Power: %.2f%nMana Cost: %.2f%n",
        this.elementType, this.radius, this.thickness, this.calculateDefensePower(), this.calculateManaCost());
}
}