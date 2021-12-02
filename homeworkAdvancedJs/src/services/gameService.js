export default class GameService {

    constructor() {
        this.games = []
        this.fakeGames = []
    }

    add(game) {
        if (game.unitPrice <= 0) {
            console.log("Lütfen fiyat giriniz.  Ürün = " + game.name)
            return;
        }
        this.games.push(game)
    }


    list() {
        console.log("Kaydedilen oyunlar ")
        console.log(this.games)
        console.log("-----")
        return this.games;
    }

    remove(value) {

        for (let i = 0; i < this.games.length; i++) {
            this.fakeGames[i] = this.games[i]

        }
        var index = this.games.indexOf(value);
        if (index > -1) {
            this.games.splice(index, 1);

        }
        console.log("Aşağıdaki oyun silindi ");
        console.log(this.fakeGames[index])
        console.log("-----")
        return this.games
    }


}