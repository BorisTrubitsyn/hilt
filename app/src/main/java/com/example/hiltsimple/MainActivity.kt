package com.example.hiltsimple

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hiltsimple.data.EnglishPerson
import com.example.hiltsimple.data.SpanishPerson
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    @Inject
    private lateinit var spanishPerson: SpanishPerson

    @Inject
    private lateinit var englishPerson: EnglishPerson

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        englishPerson = EnglishPerson()
        spanishPerson = SpanishPerson(englishPerson)
        spanishPerson.speakSpanish()
        spanishPerson.englishPerson.speakEnglish()
    }
}