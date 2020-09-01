package com.example.samplemvprxapp.mvp.presenter

import androidx.lifecycle.ViewModel
import com.example.samplemvprxapp.mvp.view.BaseView
import com.example.samplemvprxapp.data.model.SampleDataModel
import com.example.samplemvprxapp.data.model.SampleDataModelImpl

abstract class BasePresenter<T: BaseView> :ViewModel() {
    protected lateinit var mView:T
    protected lateinit var mModel:SampleDataModel

    open fun initPresenter(view:T){
        this.mView=view
        mModel=SampleDataModelImpl
    }
}