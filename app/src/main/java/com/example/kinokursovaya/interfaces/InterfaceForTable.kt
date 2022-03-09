package com.example.kinokursovaya.interfaces

import com.example.kinokursovaya.api.ResponseModel
import com.example.kinokursovaya.models.ModelClassAuthorization
import com.example.kinokursovaya.models.ModelClassRegistration
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface InterfaceApiAuthorization {
    @POST("employee/auth")
    fun userAuto(@Body userDb: ModelClassAuthorization): Call <ResponseModel<ModelClassRegistration>>
}

interface InterfaceApiRegistration {
    @POST("employee/add")
    fun userReg(@Body userReg: ModelClassRegistration): Call<ResponseModel<ModelClassRegistration>>
}