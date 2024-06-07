package com.devnolimit.daggerhiltdemo.di

import com.devnolimit.daggerhiltdemo.respository.signInRepositoryDemo.SignInRepository
import com.devnolimit.daggerhiltdemo.respository.signInRepositoryDemo.SignInRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryInstanceModule {


    @Binds
    abstract fun signInRepository(
        signInRepositoryImpl: SignInRepositoryImpl
    ): SignInRepository

}