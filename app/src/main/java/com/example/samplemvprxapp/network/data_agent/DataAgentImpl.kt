package com.example.samplemvprxapp.network.data_agent

import com.example.samplemvprxapp.data.vo.RetroCrypto
import io.reactivex.Observable

object DataAgentImpl :BaseDataAgent(),DataAgent {
    override fun getData(): Observable<List<RetroCrypto>> {
        return sampleApi.getDataFromApi()
    }

}