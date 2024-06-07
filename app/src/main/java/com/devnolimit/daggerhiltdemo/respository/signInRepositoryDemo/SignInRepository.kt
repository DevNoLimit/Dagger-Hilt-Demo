package com.devnolimit.daggerhiltdemo.respository.signInRepositoryDemo

interface SignInRepository {

    fun signInApi(email: String, password: String): String

}