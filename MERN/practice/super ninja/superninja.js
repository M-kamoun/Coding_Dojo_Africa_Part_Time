class Ninja {
  constructor(name, health = 90, speed = 3, strength = 3) {
    this.name = name;
    this.health = health;
    this.speed = speed;
    this.strength = strength;
  }

  //methods

  sayName() {
    console.log(this.name);
  }

  showStats() {
    console.log(
      `Ninja Name : ${this.name} Health : ${this.health} - speed : ${this.speed} - strength : ${this.strength} `
    );
  }

  drinkSake() {
    this.health += 10;
  }
}

class Sensei extends Ninja {
  constructor(name) {
    super(name, 200, 10, 10);
    this.wisdom = 10;
  }

  speakWisdom() {
    super.drinkSake();
    console.log(
      "What one programmer can do in one month, two programmers can do in two months."
    );
  }
}

// example output
const superSensei = new Sensei("Master Splinter");
superSensei.sayName();
superSensei.showStats();
superSensei.speakWisdom();
// -> "What one programmer can do in one month, two programmers can do in two months."
superSensei.showStats();
// -> "Name: Master Splinter, Health: 210, Speed: 10, Strength: 10"

// const ninja1 = new Ninja("Hyabusa");
// const ninja2 = new Ninja("Mehdi", 100, 10, 10);

// ninja1.sayName();
// ninja1.showStats();
// ninja1.drinkSake();
// ninja1.showStats();
// ninja1.drinkSake();
// ninja1.drinkSake();
// ninja1.drinkSake();
// ninja1.showStats();
// ninja2.sayName();
// ninja2.showStats();
