package com.devnolimit.daggerhiltdemo.di

import com.devnolimit.daggerhiltdemo.network.ApiInterface
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.components.FragmentComponent
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Provides
    @Singleton
    @RetrofitOne
    fun retrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("www.google.com")
            .build()
    }


    @Provides
    @Singleton
    @RetrofitTwo
    fun retrofit2(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("www.devnolimit.com")
            .build()
    }


    @Provides
    @Singleton
    fun apiInterface(
        @RetrofitTwo retrofit: Retrofit
    ): ApiInterface {
        return retrofit.create(ApiInterface::class.java)
    }

}