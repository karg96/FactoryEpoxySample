package hr.factory.app

import android.app.Application
import android.content.Context

class MyApp: Application() {
    companion object {
        lateinit var instance: MyApp
        fun getAppInstance(): MyApp{
            return instance
        }
        fun getContext(): Context {
            return instance
        }
    }
    override fun onCreate() {
        instance=this
        super.onCreate()


    }
}