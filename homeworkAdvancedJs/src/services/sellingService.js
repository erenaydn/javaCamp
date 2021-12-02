export default class SellingService {
    constructor() {
        this.soldGames = []
        this.failedSell = []
    }
    addSell(user, game) {

        if (user.age < game.minAge) {
            console.log(user.name + " adlı oyuncu yasi" + game.name + " adlı oyun icin yetersiz..")
            this.failedSell.push(game)
        } else {

            console.log(user.name + " adlı oyuncu " + game.name + " oyununu başarıyla aldı.")
            this.soldGames.push(user, game)

        }
    }
    list() {
        console.log("Satılan oyunların listesi :  kullanıcı ve oyun bilgileri - - ");
        console.log(this.soldGames);
        console.log("----")

        return this.soldGames;

    }
}