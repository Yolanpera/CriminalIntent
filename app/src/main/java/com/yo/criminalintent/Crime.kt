package com.yo.criminalintent

import java.util.*

class Crime(var mId: UUID, val mTitle: String, var date: Date, val mSolved: Boolean){

    constructor(): this(UUID.randomUUID(),"", Date(), false)
}