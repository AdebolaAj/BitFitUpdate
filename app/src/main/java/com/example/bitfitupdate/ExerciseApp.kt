package com.example.bitfitupdate

import android.app.Application

class ExerciseApp: Application() {
    val db by lazy {AppDatabase.getInstance(this)}
}