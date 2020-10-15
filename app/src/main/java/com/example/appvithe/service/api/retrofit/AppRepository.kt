package com.example.appvithe.service.api.retrofit

import com.example.appvithe.model.request.LoginRequest
import com.example.appvithe.model.request.SignUpRequest
import com.example.appvithe.model.response.BaseResponse
import io.reactivex.Single
import retrofit2.http.Body
import retrofit2.http.POST

interface AppRepository {
    
    @POST("auth/signup")
    fun signup(@Body signUpRequest: SignUpRequest): Single<BaseResponse>
    @POST("auth/login")
    fun login(@Body loginRequest: LoginRequest): Single<BaseResponse>
}