package com.devnolimit.daggerhiltdemo.respository.signInRepositoryDemo

import javax.inject.Inject

class SignInRepositoryImpl @Inject constructor() : SignInRepository {
    override fun signInApi(email: String, password: String): String {
        return "$email ==== $password"
    }
}