package com.example.shravanalert

import android.content.Context
import android.widget.Toast

object ShravanAlert {

    fun alert(context: Context, msg: String) {
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show()

    }

}
