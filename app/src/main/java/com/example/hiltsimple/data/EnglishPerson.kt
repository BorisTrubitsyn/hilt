package com.example.hiltsimple.data

import android.util.Log
import javax.inject.Inject

class EnglishPerson @Inject constructor() {
    fun speakEnglish() {
        Log.i("EnglishPerson", "Hello kind sir.")
    }
}