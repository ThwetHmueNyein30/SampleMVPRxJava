package com.example.samplemvprxapp.mvp.presenter

import android.content.Context
import android.widget.Toast
import androidx.lifecycle.LifecycleOwner
import com.example.samplemvprxapp.data.vo.RetroCrypto
import com.example.samplemvprxapp.delegate.OnItemClickDelegate
import com.example.samplemvprxapp.mvp.view.MainView

class MainPresenter:BasePresenter<MainView>(),OnItemClickDelegate {

    fun getSampleData(owner: LifecycleOwner){
        mView.showProgress()
        mModel.getSampleData().observe(
            owner, {
                mView.hideProgress()
                mView.setDataToRecyclerView(it)
            }
        )
    }

    override fun onItemClick(context: Context, retroCrypto: RetroCrypto) {
        Toast.makeText(context, "You clicked: ${retroCrypto.currency}", Toast.LENGTH_LONG).show()
    }

}