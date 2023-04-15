package com.company;

public class Main {

    public static void main(String[] args) {
        //В классе Main создать 1 экземпляр босса и задать ему все свойства (значения полям).
        //Затем распечатать всю информацию о боссе.
        Boss boss=new Boss();
        boss.setDamage(220);
        boss.setHealth(700);
        boss.setTypeDefence("physical");

        System.out.println("Босс:");
        System.out.print("health:"+boss.getHealth()+" damage:"+boss.getDamage()+" typeDefence:"+boss.getTypeDefence());
//Затем вызвать этот метод в методе main и распечатать информацию о всех героях массива через цикл.
        System.out.println("\nHeroes:");
        Hero[] heroes=createHeroes();
        for (int i = 0; i < heroes.length; i++) {
            System.out.println("health:"+heroes[i].getHealth()+" damage:"+heroes[i].getDamage()+" Ability:"+heroes[i].getAbility());
        }
    }
    //Добавить метод в классе Main который называется createHeroes,
    // в теле метода необходимо создать 3х героев с помощью класса Hero,
    // используя при этом разные варианты конструкторов (либо первый либо второй).
    // Затем поместить созданные экземпляры героев в массив и вернуть его с помощью команды return,
    // как возвращаемый результат метода createHeroes Hero[ ]
    public static Hero[] createHeroes(){
        Hero hero1 = new Hero(150, 20);
           Hero hero2 = new Hero(250, 100, "invisibility");
           Hero hero3 = new Hero(200, 70, "freezing");

           Hero[] heroes=new Hero[3];
        for (int i = 0; i < heroes.length; i++) {
            heroes[0]=hero1;
            heroes[1]=hero2;
            heroes[2]=hero3;
        }
        return heroes;
        }
    }


