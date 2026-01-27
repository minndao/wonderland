package com.guild.roles;

public class Role {
    private String name;
    private Integer age;
    private String race;
    private Double mana;

public Role() {
    this.name = "Johny D.";
    this.age = 19;
    this.race = "Human";
    this.mana = 10.0;
}



public Role(String name, Integer age, String race, Double mana) {
    this.name = name;
    this.age  = age;
    this.race = race;
    this.mana = mana;
}

public String getName(){
    return this.name;
}

public void setName(String name){
    this.name = name;
}

public Integer getAge(){
    return this.age;
}

public void setAge(Integer age){
    this.age = age;
}

public String getRace(){
    return this.race;
}

public void setRace(String race){
    this.race = race;
}

public Double getMana(){
    return this.mana;
}

public void setMana(Double mana){
    this.mana = mana;
}

public void performAction(){
    System.out.println(this.name + " is performing a magical action.");
     System.out.printf("Name: %s\nAge: %d\nRace: %s\nMana: %.2f\n",this.name,this.age,this.race,this.mana);
     System.out.println();
}
}





