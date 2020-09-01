package com.example.samplemvprxapp.data.model

import androidx.lifecycle.LiveData
import com.example.samplemvprxapp.data.vo.RetroCrypto

interface SampleDataModel {
    fun getSampleData () : LiveData<List<RetroCrypto>>
}