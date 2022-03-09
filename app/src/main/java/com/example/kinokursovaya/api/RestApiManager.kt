package com.example.kinokursovaya.api

import android.util.Log
import com.example.kinokursovaya.interfaces.*
import com.example.kinokursovaya.models.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class RestApiManager {
    fun userAuthorization(userDb: ModelClassAuthorization, onResult: (ModelClassAuthorization?) -> Unit){
        val retrofit = ServiceBuilder.buildService(InterfaceApiAuthorization::class.java)
        retrofit.userAuto(userDb).enqueue(
            object : Callback<ModelClassAuthorization> {
                override fun onFailure(call: Call<ModelClassAuthorization>, t: Throwable) {
                    onResult(null)
                }
                override fun onResponse(call: Call<ModelClassAuthorization>, response: Response<ModelClassAuthorization>) {
                    val addedUser = response.body()
                    onResult(addedUser)
                }
            }
        )
    }

    fun userRegistration(userRegister: ModelClassRegistration, onResult: (ModelClassRegistration?) -> Unit){
        val retrofit = ServiceBuilder.buildService(InterfaceApiRegistration::class.java)
        retrofit.userReg(userRegister).enqueue(
            object : Callback<ModelClassRegistration> {
                override fun onFailure(call: Call<ModelClassRegistration>, t: Throwable) {
                    onResult(null)

                }
                override fun onResponse(call: Call<ModelClassRegistration>, response: Response<ModelClassRegistration>) {
                    val addedUser = response.body()
                    onResult(addedUser)
                }
            }
        )
    }


}