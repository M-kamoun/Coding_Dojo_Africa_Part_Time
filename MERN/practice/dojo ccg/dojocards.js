class Card {
  constructor(name, cost) {
    this.name = name;
    this.cost = cost;
  }
}

class Unit extends Card {
  constructor(name, cost, res, power) {
    super(name, cost);
    this.power = power;
    this.res = res;
  }

  attack(target) {
    //reduce target res by power
    console.log(
      `${this.name} makes an attack ON ${target.name} by decreasing her resilience by ${this.power} `
    );
    target.res -= this.power;
  }
  display() {
    console.log(
      `Unit card - ${this.name} { Resilience : ${this.res} Power : ${this.power}}`
    );
  }
}

class Effect extends Card {
  constructor(name, cost, text, stat, magnitude) {
    super(name, cost);
    this.text = text;
    this.stat = stat;
    this.magnitude = magnitude;
  }

  play(target) {
    if (target instanceof Unit) {
      console.log(`Effect card : ${this.name} ON ${target.name}: ${this.text}`);
      if (this.stat === "resilience") {
        target.res += this.magnitude;
      } else if (this.stat === "power") {
        target.power += this.magnitude;
      }
    } else {
      throw new Error("Target must be a unit!");
    }
  }
}

// play scenario
const redBeltNinja = new Unit("Red Belt Ninja", 3, 4, 3);
redBeltNinja.display();
const hardAlgo = new Effect(
  "Hard Algorithm",
  2,
  "increase target's resilience by 3",
  "resilience",
  3
);
hardAlgo.play(redBeltNinja);
redBeltNinja.display();

const blackBeltNinja = new Unit("Black Belt Ninja", 4, 5, 4);
blackBeltNinja.display();
const upr = new Effect(
  "Unhandled Promise Rejection",
  1,
  "reduce target's resilience by 2",
  "resilience",
  -2
);
upr.play(redBeltNinja);
redBeltNinja.display();

const pp = new Effect(
  "Unhandled Promise Rejection",
  1,
  "increase target's power by 2",
  "power",
  2
);

pp.play(redBeltNinja);
redBeltNinja.display();

blackBeltNinja.display();
redBeltNinja.attack(blackBeltNinja);
blackBeltNinja.display();
