package com.example.samplemvprxapp.mvp.view

interface ActivityView : BaseView {
    fun setUpPresenter()
    fun setUpUI()
    fun setUpListener()
}