export default class Game {
    // özellik sınıfıı için constructor kullanırız. 
    constructor(id, name, unitPrice, minAge) {
        // undefined değerler için
        if (!id || !name || !unitPrice || !minAge) {
            console.log("nesne eksik")
        }
        //prototyping
        this.id = id;
        this.name = name;
        this.unitPrice = unitPrice;
        this.minAge = minAge;
    }

}