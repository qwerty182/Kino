package com.example.kinokursovaya.api

import android.util.Log
import com.example.kinokursovaya.interfaces.*
import com.example.kinokursovaya.models.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class RestApiManager {
    fun userAuthorization(userDb: ModelClassAuthorization, onResult: (ResponseModel<ModelClassRegistration>?) -> Unit){
        val retrofit = ServiceBuilder.buildService(InterfaceApiAuthorization::class.java)
        retrofit.userAuto(userDb).enqueue(
            object : Callback<ResponseModel<ModelClassRegistration>> {
                override fun onResponse(
                    call: Call<ResponseModel<ModelClassRegistration>>,
                    response: Response<ResponseModel<ModelClassRegistration>>
                ) {
                    val addedUser = response.body()
                    onResult(addedUser)
                }

                override fun onFailure(
                    call: Call<ResponseModel<ModelClassRegistration>>,
                    t: Throwable
                ) {
                    onResult(null)
                }

               /* override fun onFailure(call: Call<ModelClassAuthorization>, t: Throwable) {
                    onResult(null)
                }
                override fun onResponse(call: Call<ModelClassAuthorization>, response: Response<ResponseModel<ModelClassRegistration>>) {
                    val addedUser = response.body()
                    onResult(addedUser)
                }*/
            }
        )
    }

    fun userRegistration(userRegister: ModelClassRegistration, onResult: (ResponseModel<ModelClassRegistration>?) -> Unit){
        val retrofit = ServiceBuilder.buildService(InterfaceApiRegistration::class.java)
        retrofit.userReg(userRegister).enqueue(
            object : Callback<ResponseModel<ModelClassRegistration>> {
                override fun onResponse(
                    call: Call<ResponseModel<ModelClassRegistration>>,
                    response: Response<ResponseModel<ModelClassRegistration>>
                ) {
                    val addedUser = response.body()
                    onResult(addedUser)
                }
                override fun onFailure(
                    call: Call<ResponseModel<ModelClassRegistration>>, t: Throwable) {
                    onResult(null)
                }
                /*override fun onFailure(call: Call<ResponseModel<ModelClassRegistration>>, t: Throwable) {
                    onResult(null)
                }
                override fun onResponse(call: Call<ModelClassRegistration>, response: Response<ResponseModel<ModelClassRegistration>>) {
                    val addedUser = response.body()
                    onResult(addedUser)
                }*/
            }
        )
    }


}