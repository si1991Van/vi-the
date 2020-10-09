package com.example.appvithe.service.api.retrofit

import com.example.appvithe.model.response.BaseResponse
import io.reactivex.Single
import retrofit2.http.Body
import retrofit2.http.POST

interface AppRepository {
    @POST("SysUserRestService/service/auth")
    fun auth(): Single<BaseResponse>
}