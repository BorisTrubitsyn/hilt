package com.example.hiltsimple.data

import android.util.Log
import javax.inject.Inject

class SpanishPerson @Inject constructor(val englishPerson: EnglishPerson) {
    fun speakSpanish() {
        Log.i("SpanishPerson", "Despacito senor")
    }
}