export default class UserService {

    constructor() {
        this.users = []
        this.fakeUsers = []
    }

    add(user) {
        console.log("Kullanıcı başarıyla eklendi. Kullanıcı adı : " + user.name);
        this.users.push(user);
    }

    list() {
        console.log("Kayıtlı kullanıcılar : " + this.users)
        return this.users
    }
    remove(value) {

        // sildiğimiz yerdeki değeri tutabilmek adına fakeusers açtım ve consoleda silinen değerin bilgilerini yazdırdım
        for (let i = 0; i < this.users.length; i++) {
            this.fakeUsers[i] = this.users[i]

        }

        var index = this.users.indexOf(value);
        if (index > -1) {
            this.users.splice(index, 1);
        }
        console.log("Temizleme işlemi başarılı, silinen kullanıcı bilgileri aşağıdadır")
        console.log(this.fakeUsers[index])
        console.log("-----")


        return this.users
    }

}