package com.devnolimit.daggerhiltdemo.viewModel

import android.util.Log
import androidx.lifecycle.ViewModel
import com.devnolimit.daggerhiltdemo.network.ApiInterface
import com.devnolimit.daggerhiltdemo.respository.StudentRepository
import com.devnolimit.daggerhiltdemo.respository.UserRepository
import com.devnolimit.daggerhiltdemo.respository.signInRepositoryDemo.SignInRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val userRepository: UserRepository,
    private val apiInterface: ApiInterface,
    private val signInRepository: SignInRepository
) : ViewModel() {

    @Inject lateinit var studentRepository: StudentRepository

    fun calling() {
//        studentRepository.studentCalling()
//        userRepository.printData()
        val result = signInRepository.signInApi(email = "devnolimit@gmail.com", password = "12345678")

        Log.e("SignInData", result)
    }

}