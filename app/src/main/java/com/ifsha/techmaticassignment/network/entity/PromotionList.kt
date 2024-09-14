package com.ifsha.techmaticassignment.network.entity

import com.google.gson.annotations.SerializedName


data class PromotionList (

  @SerializedName("StoreId"             ) var StoreId             : Int?     = null,
  @SerializedName("AppId"               ) var AppId               : Int?     = null,
  @SerializedName("UserId"              ) var UserId              : Int?     = null,
  @SerializedName("PromotionId"         ) var PromotionId         : Int?     = null,
  @SerializedName("Title"               ) var Title               : String,
  @SerializedName("Url"                 ) var Url                 : String?  = null,
  @SerializedName("PromotionTypeId"     ) var PromotionTypeId     : Int?     = null,
  @SerializedName("PromotionType"       ) var PromotionType       : String?  = null,
  @SerializedName("TargetContent"       ) var TargetContent       : String?  = null,
  @SerializedName("TargetContentType"   ) var TargetContentType   : String?  = null,
  @SerializedName("StatusId"            ) var StatusId            : Int?     = null,
  @SerializedName("StatusName"          ) var StatusName          : String?  = null,
  @SerializedName("Priority"            ) var Priority            : Int?     = null,
  @SerializedName("PromotionCategory"   ) var PromotionCategory   : String?  = null,
  @SerializedName("EventStartDt"        ) var EventStartDt        : String?  = null,
  @SerializedName("EventStartTime"      ) var EventStartTime      : String?  = null,
  @SerializedName("EventEndDt"          ) var EventEndDt          : String?  = null,
  @SerializedName("EventEndTime"        ) var EventEndTime        : String?  = null,
  @SerializedName("SendNotification"    ) var SendNotification    : Boolean? = null,
  @SerializedName("NotificationMessage" ) var NotificationMessage : String?  = null,
  @SerializedName("PageSize"            ) var PageSize            : Int?     = null,
  @SerializedName("PageNumber"          ) var PageNumber          : Int?     = null,
  @SerializedName("Event"               ) var Event               : Event?   = Event(),
  @SerializedName("IsDeleted"           ) var IsDeleted           : Boolean? = null,
  @SerializedName("IsEdited"            ) var IsEdited            : Boolean? = null,
  @SerializedName("IsCancel"            ) var IsCancel            : Boolean? = null,
  @SerializedName("IsEdit"              ) var IsEdit              : Boolean? = null,
  @SerializedName("RowCounter"          ) var RowCounter          : Int?     = null,
  @SerializedName("IsABPinned"          ) var IsABPinned          : Boolean? = null,
  @SerializedName("CampaignId"          ) var CampaignId          : Int?     = null,
  @SerializedName("CampaignName"        ) var CampaignName        : String?  = null,
  @SerializedName("ListId"              ) var ListId              : Int?     = null,
  @SerializedName("SortNumber"          ) var SortNumber          : Int?     = null

)