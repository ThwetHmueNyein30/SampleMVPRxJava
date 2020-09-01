package com.example.samplemvprxapp.util

import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.view.LayoutInflater
import androidx.appcompat.app.AlertDialog
import androidx.core.content.ContextCompat
import com.example.samplemvprxapp.R
import com.github.ybq.android.spinkit.style.Circle
import kotlinx.android.synthetic.main.loading_view.view.*

fun createLoadingDialog(context: Context): AlertDialog {
    val builder = AlertDialog.Builder(context)
    val view = LayoutInflater.from(context).inflate(R.layout.loading_view, null,
        false)
    val progressBar = view.progressBar
    val circle = Circle()
    circle.setBounds(0, 0, 100, 100)
    circle.color = ContextCompat.getColor(context, R.color.colorPrimary)
    progressBar.indeterminateDrawable = circle
    builder.setView(view)

    val dialog = builder.create()
    dialog.setCanceledOnTouchOutside(false)
    dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
    return dialog
}
