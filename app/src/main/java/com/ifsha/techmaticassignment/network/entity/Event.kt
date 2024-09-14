package com.ifsha.techmaticassignment.network.entity

import com.google.gson.annotations.SerializedName


data class Event (

  @SerializedName("StoreId"                          ) var StoreId                          : Int?     = null,
  @SerializedName("EventId"                          ) var EventId                          : Int?     = null,
  @SerializedName("AppId"                            ) var AppId                            : Int?     = null,
  @SerializedName("UserId"                           ) var UserId                           : Int?     = null,
  @SerializedName("EventName"                        ) var EventName                        : String?  = null,
  @SerializedName("EventStartDt"                     ) var EventStartDt                     : String?  = null,
  @SerializedName("EventEndDt"                       ) var EventEndDt                       : String?  = null,
  @SerializedName("EventFreeStatus"                  ) var EventFreeStatus                  : Boolean? = null,
  @SerializedName("IsEventAddressSameAsStoreAddress" ) var IsEventAddressSameAsStoreAddress : Boolean? = null,
  @SerializedName("EventPrice"                       ) var EventPrice                       : String?  = null,
  @SerializedName("EPrice"                           ) var EPrice                           : Int?     = null,
  @SerializedName("Currency"                         ) var Currency                         : String?  = null,
  @SerializedName("EventDescription"                 ) var EventDescription                 : String?  = null,
  @SerializedName("StatusId"                         ) var StatusId                         : Int?     = null,
  @SerializedName("StoreLatitude"                    ) var StoreLatitude                    : Int?     = null,
  @SerializedName("StoreLongitude"                   ) var StoreLongitude                   : Int?     = null,
  @SerializedName("EventStartTime"                   ) var EventStartTime                   : String?  = null,
  @SerializedName("EventEndTime"                     ) var EventEndTime                     : String?  = null,
  @SerializedName("Address1"                         ) var Address1                         : String?  = null,
  @SerializedName("Address2"                         ) var Address2                         : String?  = null,
  @SerializedName("City"                             ) var City                             : String?  = null,
  @SerializedName("State"                            ) var State                            : String?  = null,
  @SerializedName("Zip"                              ) var Zip                              : String?  = null,
  @SerializedName("EventType"                        ) var EventType                        : String?  = null,
  @SerializedName("SendNotification"                 ) var SendNotification                 : Boolean? = null,
  @SerializedName("SessionCusId"                     ) var SessionCusId                     : Int?     = null,
  @SerializedName("IsAllowOnlinePurchase"            ) var IsAllowOnlinePurchase            : Boolean? = null

)