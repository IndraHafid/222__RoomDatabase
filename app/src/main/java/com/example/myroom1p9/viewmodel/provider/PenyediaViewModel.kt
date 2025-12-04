package com.example.myroom1p9.viewmodel.provider

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.myroom1p9.repositori.ContainerApp
import com.example.myroom1p9.viewmodel.EntryViewModel
import com.example.myroom1p9.viewmodel.HomeViewModel

object PenyediaViewModel {
    val Factory = viewModelFactory {

        initializer {

            HomeViewModel(

                aplikasi().container.repositoriSiswa
            )
        }


        initializer {

            EntryViewModel(

                aplikasi().container.repositoriSiswa
            )
        }
    }
}



fun CreationExtras.aplikasi(): ContainerApp =

    (this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as ContainerApp)