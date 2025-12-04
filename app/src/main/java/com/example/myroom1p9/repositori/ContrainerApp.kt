package com.example.myroom1p9.repositori

import android.app.Application
import android.content.Context
import com.example.myroom1p9.room.DatabaseSiswa

interface AppContainer {
    val repositoriSiswa : RepositoriSiswa
}
class AppContainerImpl(private val context: Context) :
    AppContainer {

    override val repositoriSiswa: RepositoriSiswa by lazy {
        OfflineRepositoriSiswa(
            siswaDao = DatabaseSiswa.getDatabase(context).siswaDao()
        )
    }
}

class ContainerApp : Application() {


    lateinit var container: AppContainer

    override fun onCreate() {
        super.onCreate()
        container = AppContainerImpl(this)
       }
}