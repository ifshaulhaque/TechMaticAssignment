package com.ifsha.techmaticassignment.network.entity

import com.google.gson.annotations.SerializedName


data class PromotionResponseModel (

  @SerializedName("PromotionList"              ) var PromotionList              : ArrayList<PromotionList> = arrayListOf(),
  @SerializedName("StoreId"                    ) var StoreId                    : Int?                     = null,
  @SerializedName("UserId"                     ) var UserId                     : Int?                     = null,
  @SerializedName("AppId"                      ) var AppId                      : Int?                     = null,
  @SerializedName("IsExcludeProgramming"       ) var IsExcludeProgramming       : Boolean?                 = null,
  @SerializedName("IsDisableTopSellers"        ) var IsDisableTopSellers        : Boolean?                 = null,
  @SerializedName("IsEnablePickupSlots"        ) var IsEnablePickupSlots        : Boolean?                 = null,
  @SerializedName("IsEnableDeliverySlots"      ) var IsEnableDeliverySlots      : Boolean?                 = null,
  @SerializedName("IsEnableCurbsideSlots"      ) var IsEnableCurbsideSlots      : Boolean?                 = null,
  @SerializedName("IsCartTransferAvailable"    ) var IsCartTransferAvailable    : Boolean?                 = null,
  @SerializedName("EnableWineClubSubscription" ) var EnableWineClubSubscription : Boolean?                 = null,
  @SerializedName("OnlinePaymentTypeId"        ) var OnlinePaymentTypeId        : Int?                     = null

)