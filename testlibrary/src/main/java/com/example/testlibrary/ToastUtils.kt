package com.example.testlibrary

import android.content.Context
import android.widget.Toast

class ToastUtils{
    companion object {
        fun showToast(context:Context,string:String){
            Toast.makeText(context,string,Toast.LENGTH_LONG).show()
        }
    }
}