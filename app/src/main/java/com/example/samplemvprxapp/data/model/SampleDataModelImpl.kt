package com.example.samplemvprxapp.data.model

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.samplemvprxapp.data.vo.RetroCrypto
import io.reactivex.Scheduler
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

object SampleDataModelImpl : BaseModel(),SampleDataModel {

    override fun getSampleData(): LiveData<List<RetroCrypto>> {
        val liveData = MutableLiveData<List<RetroCrypto>>()
        val networkObservable=dataAgent.getData()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                liveData.postValue(it)
            },{
                Log.d("THN","ErrorMessage...${it.localizedMessage}")
            })
        return liveData
    }
}