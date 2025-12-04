package com.example.myroom1p9.viewmodel

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.example.myroom1p9.repositori.RepositoriSiswa
import com.example.myroom1p9.view.route.DestinasiDetailSiswa

class DetailViewModel(
    savedStateHandle: SavedStateHandle,
    private val repositoriSiswa: RepositoriSiswa
) : ViewModel() {

    private val idSiswa: Int =
        checkNotNull(savedStateHandle[DestinasiDetailSiswa.itemIdArg])


}

data class DetailSiswaUiState(
    val detailSiswa: DetailSiswa = DetailSiswa()
)
