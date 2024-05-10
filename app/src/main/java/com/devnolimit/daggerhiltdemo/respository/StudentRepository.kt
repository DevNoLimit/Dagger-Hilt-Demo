package com.devnolimit.daggerhiltdemo.respository

import android.util.Log
import javax.inject.Inject

class StudentRepository @Inject constructor() {

    fun studentCalling(){
        Log.e("StudentClass", "-----> Calling")
    }

}