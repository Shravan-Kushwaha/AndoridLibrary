package com.example.shravanalert

import android.content.Context
import android.widget.Toast

class ShravanAlert {
    companion object {
        fun alert(context: Context, msg: String) {
            Toast.makeText(context, msg, Toast.LENGTH_SHORT).show()
        }
    }

}