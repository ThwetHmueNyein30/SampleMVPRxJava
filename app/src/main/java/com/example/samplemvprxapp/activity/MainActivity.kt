package com.example.samplemvprxapp.activity

import android.app.Dialog
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.samplemvprxapp.R
import com.example.samplemvprxapp.adapter.MyAdapter
import com.example.samplemvprxapp.data.vo.RetroCrypto
import com.example.samplemvprxapp.mvp.presenter.MainPresenter
import com.example.samplemvprxapp.mvp.view.ActivityView
import com.example.samplemvprxapp.mvp.view.MainView
import com.example.samplemvprxapp.util.createLoadingDialog
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(), ActivityView,MainView{


    private lateinit var mPresenter:MainPresenter
    private lateinit var loadingDialog: Dialog
    private var myAdapter: MyAdapter? = null
    private var myRetroCryptoArrayList: ArrayList<RetroCrypto>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setUpUI()
        setUpPresenter()
        setUpListener()
    }

    override fun setUpPresenter() {
        mPresenter = ViewModelProviders.of(this).get(MainPresenter::class.java)
        mPresenter.initPresenter(this)
    }

    override fun setUpUI() {
        loadingDialog = createLoadingDialog(this)
        initRecyclerView()
    }

    override fun setUpListener() {
        mPresenter.getSampleData(this)
    }

    override fun initRecyclerView() {
        val layoutManager : RecyclerView.LayoutManager = LinearLayoutManager(this)
        cryptocurrency_list.layoutManager = layoutManager
    }

    override fun showProgress() {
       loadingDialog.show()
    }

    override fun hideProgress() {
        loadingDialog.dismiss()
    }

    override fun setDataToRecyclerView(retroCryptoList: List<RetroCrypto>) {
        myRetroCryptoArrayList = ArrayList(retroCryptoList)
        myAdapter = MyAdapter(myRetroCryptoArrayList!!,mPresenter)
        cryptocurrency_list.adapter = myAdapter
    }

}