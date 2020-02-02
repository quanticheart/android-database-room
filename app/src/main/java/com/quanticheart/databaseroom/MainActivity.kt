package com.quanticheart.databaseroom

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    /**
     * https://medium.com/androiddevelopers/7-pro-tips-for-room-fbadea4bfbd1#dd40
     * https://codinginfinite.com/android-room-tutorial-persistence/
     * https://codelabs.developers.google.com/codelabs/android-room-with-a-view/#0
     */

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toolbar2
        btnLogout
        btnLogin
    }
}
