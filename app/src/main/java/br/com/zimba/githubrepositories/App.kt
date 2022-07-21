package br.com.zimba.githubrepositories

import android.app.Application
import br.com.zimba.githubrepositories.data.di.DataModule
import br.com.zimba.githubrepositories.domain.di.DomainModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
        }

        DataModule.load()
        DomainModule.load()
    }
}