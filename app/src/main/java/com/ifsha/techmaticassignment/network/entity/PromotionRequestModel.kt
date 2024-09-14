package com.ifsha.techmaticassignment.network.entity

import com.google.gson.annotations.SerializedName


data class PromotionRequestModel (

    @SerializedName("AppId"       ) var AppId       : Int    = 10368,
    @SerializedName("DeviceId"    ) var DeviceId    : String = "ctI9PWLRRYe5elgrzxubXD:APA91bHr5uzNPykkm_wzeKSWBvsA5MW0O4hQAo_hsfvXW3kTh43M2cMa_a0K65F3tEOhzjVCMy54Gxh4yyOXYw_vw6GcfJNkhB1MJNhRpW9VKj3e_jf_ssuSm121BnoZbA6RW8qrzrJp",
    @SerializedName("DeviceToken" ) var DeviceToken : String = "82d1cb47d9e0e7e6",
    @SerializedName("DeviceType"  ) var DeviceType  : String = "I",
    @SerializedName("SessionId"   ) var SessionId   : String,
    @SerializedName("SourceId"    ) var SourceId    : Int    = 0,
    @SerializedName("StoreId"     ) var StoreId     : Int    = 10368,
    @SerializedName("UserId"      ) var UserId      : Int

)