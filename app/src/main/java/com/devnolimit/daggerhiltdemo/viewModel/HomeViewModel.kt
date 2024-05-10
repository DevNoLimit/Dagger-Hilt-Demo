package com.devnolimit.daggerhiltdemo.viewModel

import androidx.lifecycle.ViewModel
import com.devnolimit.daggerhiltdemo.network.ApiInterface
import com.devnolimit.daggerhiltdemo.respository.StudentRepository
import com.devnolimit.daggerhiltdemo.respository.UserRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val userRepository: UserRepository,
    private val apiInterface: ApiInterface
) : ViewModel() {

    @Inject lateinit var studentRepository: StudentRepository

    fun calling() {
        studentRepository.studentCalling()
        userRepository.printData()
    }

}