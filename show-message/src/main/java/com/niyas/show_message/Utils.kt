package com.niyas.show_message

import android.content.Context
import android.widget.Toast

class Utils {
    companion object{
        fun showToast(context: Context,msg:String){
            Toast.makeText(context, msg, Toast.LENGTH_SHORT).show()
        }
    }
}