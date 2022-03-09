package com.example.kinokursovaya.models

import com.google.gson.annotations.SerializedName

data class ModelClassAuthorization(
    @SerializedName("Login"    ) var Login    : String? = null,
    @SerializedName("Password" ) var Password : String? = null
)

data class ModelClassRegistration(
    @SerializedName("Login"      ) var Login      : String? = null,
    @SerializedName("Password"   ) var Password   : String? = null,
    @SerializedName("RoleName"   ) var RoleName   : String? = null,
    @SerializedName("Number"     ) var Number     : String? = null,
    @SerializedName("Address"    ) var Address    : String? = null,
    @SerializedName("Age"        ) var Age        : Int?    = null,
    @SerializedName("Gender"     ) var Gender     : String? = null,
    @SerializedName("LastName"   ) var LastName   : String? = null,
    @SerializedName("FirstName"  ) var FirstName  : String? = null,
    @SerializedName("MiddleName" ) var MiddleName : String? = null
)