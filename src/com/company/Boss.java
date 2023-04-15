package com.company;

//Создать класс Босса (Boss), с приватными полями здоровье, урон и тип защиты.
// Добавить в класс геттеры и сеттеры для всех полей.
public class Boss {
    private int health;
    private int damage;
    private String typeDefence;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getTypeDefence() {
        return typeDefence;
    }

    public void setTypeDefence(String typeDefence) {
        this.typeDefence = typeDefence;
    }
}
