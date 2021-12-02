import Game from "./models/game.js"
import GameService from "./services/gameService.js"
import UserService from "./services/userService.js"
import User from "./models/user.js"
import SellingService from "./services/sellingService.js"

let game1 = new Game(1, "Lol", 120, 15)
let game2 = new Game(2, "Valorant", 320, 15)
let game3 = new Game(3, "CsGo", 220, 18)
let game4 = new Game(4, "PUBG", 205, 18)
let game5 = new Game(5, "Dota", 185, 25)
let game6 = new Game(6, "Forza", 175, 18)


let gameService = new GameService()
gameService.add(game1)
gameService.add(game2)
gameService.add(game3)
gameService.add(game4)
gameService.add(game5)
gameService.add(game6)
// oyunlar eklendi.
let user1 = new User(1, "Eren", 15);
let user2 = new User(2, "Emre", 22);
let user3 = new User(3, "Recep", 25);
let userService = new UserService()

userService.add(user1)
userService.add(user2)
userService.add(user3)
// kullanıcılar eklendi

let sellingService = new SellingService()

sellingService.addSell(user1, game2);
sellingService.addSell(user1, game3);

sellingService.addSell(user2, game1);
sellingService.addSell(user2, game5);

sellingService.addSell(user3, game1);
sellingService.addSell(user3, game3);
// oyunların satışları yapıldı. 

userService.remove(user3)
gameService.remove(game4)
// oyun veya kullanıcı girişleri silindi 

userService.list()
gameService.list()
sellingService.list()
