package com.example.samplemvprxapp.delegate

import android.content.Context
import com.example.samplemvprxapp.data.vo.RetroCrypto

interface OnItemClickDelegate {
    fun onItemClick(context: Context,retroCrypto: RetroCrypto)
}