package com.ifsha.techmaticassignment.network.entity

import android.os.Build
import com.google.gson.annotations.SerializedName

data class LoginRequestModel (
  @SerializedName("AppId"              ) var AppId              : Int    = 10368,
  @SerializedName("AppVersion"         ) var AppVersion         : String = Build.VERSION.RELEASE,
  @SerializedName("DeviceId"           ) var DeviceId           : String = "ctI9PWLRRYe5elgrzxubXD:APA91bHr5uzNPykkm_wzeKSWBvsA5MW0O4hQAo_hsfvXW3kTh43M2cMa_a0K65F3tEOhzjVCMy54Gxh4yyOXYw_vw6GcfJNkhB1MJNhRpW9VKj3e_jf_ssuSm121BnoZbA6RW8qrzrJp",
  @SerializedName("DeviceManufacturer" ) var DeviceManufacturer : String = Build.MANUFACTURER,
  @SerializedName("DeviceModel"        ) var DeviceModel        : String = Build.MODEL,
  @SerializedName("DeviceOS"           ) var DeviceOS           : String = "Android",
  @SerializedName("DeviceOSVersion"    ) var DeviceOSVersion    : String = Build.VERSION.BASE_OS,
  @SerializedName("DeviceToken"        ) var DeviceToken        : String = "82d1cb47d9e0e7e6",
  @SerializedName("DeviceType"         ) var DeviceType         : String = "I",
  @SerializedName("EmailId"            ) var EmailId            : String,
  @SerializedName("LoginType"          ) var LoginType          : String = "E",
  @SerializedName("Password"           ) var Password           : String,
  @SerializedName("SourceId"           ) var SourceId           : Int    = 0,
  @SerializedName("StoreId"            ) var StoreId            : Int    = 10368,
  @SerializedName("TimeZone"           ) var TimeZone           : String = Build.TIME.toString(),
  @SerializedName("UserId"             ) var UserId             : Int    = 0,
  @SerializedName("UserIp"             ) var UserIp             : String = ""
)