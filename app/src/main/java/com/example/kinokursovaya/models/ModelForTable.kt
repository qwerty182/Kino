package com.example.kinokursovaya.models

import com.google.gson.annotations.SerializedName

data class ModelClassAuthorization(
    @SerializedName("Login"    ) var Login    : String? = null,
    @SerializedName("Password" ) var Password : String? = null
)

data class ModelClassRegistration(
    @SerializedName("idEmployee" ) var IdEmployee : Int?    = null,
    @SerializedName("login"      ) var Login      : String? = null,
    @SerializedName("password"   ) var Password   : String? = null,
    @SerializedName("roleId"     ) var RoleId     : Int?    = null,
    @SerializedName("roleName"   ) var RoleName   : String? = null,
    @SerializedName("number"     ) var Number     : String? = null,
    @SerializedName("address"    ) var Address    : String? = null,
    @SerializedName("age"        ) var Age        : Int?    = null,
    @SerializedName("gender"     ) var Gender     : String? = null,
    @SerializedName("lastName"   ) var LastName   : String? = null,
    @SerializedName("firstName"  ) var FirstName  : String? = null,
    @SerializedName("middleName" ) var MiddleName : String? = null
)