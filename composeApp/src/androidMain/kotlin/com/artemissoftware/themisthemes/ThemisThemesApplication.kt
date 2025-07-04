package com.artemissoftware.themisthemes

import android.app.Application
import com.artemissoftware.themisthemes.di.initKoin
import org.koin.android.ext.koin.androidContext

class ThemisThemesApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        initKoin {
            androidContext(this@ThemisThemesApplication)
        }
    }
}