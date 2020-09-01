package com.example.samplemvprxapp.network.data_agent

import com.example.samplemvprxapp.data.vo.RetroCrypto
import io.reactivex.Observable

interface DataAgent {
    fun getData() : Observable<List<RetroCrypto>>

}