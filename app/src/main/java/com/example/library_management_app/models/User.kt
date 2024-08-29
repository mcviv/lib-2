package com.example.library_management_app.models


class User {
    private var firstName: String = ""
    private var secondName: String = ""
    private var email: String = ""
    private var password: String = ""
    private var userid: String=""

    constructor(firstName: String,secondName: String,
                email: String,password: String,userid: String){
        this.firstName=firstName
        this.secondName=secondName
        this.email = email
        this.password=password
        this.userid=userid
    }
    constructor()
}