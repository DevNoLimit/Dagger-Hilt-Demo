package com.devnolimit.daggerhiltdemo.respository

import android.util.Log
import javax.inject.Inject

class UserRepository @Inject constructor(
    private val studentRepository: StudentRepository
) {

    fun printData(){
        Log.e("UserRepositoryClass", "---> Calling")
        studentRepository.studentCalling()
    }

}