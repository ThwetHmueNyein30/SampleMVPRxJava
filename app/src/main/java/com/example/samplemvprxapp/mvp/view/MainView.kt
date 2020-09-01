package com.example.samplemvprxapp.mvp.view

import com.example.samplemvprxapp.data.vo.RetroCrypto

interface MainView : BaseView {

    fun initRecyclerView()

    fun showProgress()

    fun hideProgress()

    fun setDataToRecyclerView(retroCryptoList: List<RetroCrypto>)

}