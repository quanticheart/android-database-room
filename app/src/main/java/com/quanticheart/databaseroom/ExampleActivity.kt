/*
 *
 *  *                                     /@
 *  *                      __        __   /\/
 *  *                     /==\      /  \_/\/
 *  *                   /======\    \/\__ \__
 *  *                 /==/\  /\==\    /\_|__ \
 *  *              /==/    ||    \=\ / / / /_/
 *  *            /=/    /\ || /\   \=\/ /
 *  *         /===/   /   \||/   \   \===\
 *  *       /===/   /_________________ \===\
 *  *    /====/   / |                /  \====\
 *  *  /====/   /   |  _________    /      \===\
 *  *  /==/   /     | /   /  \ / / /         /===/
 *  * |===| /       |/   /____/ / /         /===/
 *  *  \==\             /\   / / /          /===/
 *  *  \===\__    \    /  \ / / /   /      /===/   ____                    __  _         __  __                __
 *  *    \==\ \    \\ /____/   /_\ //     /===/   / __ \__  ______  ____ _/ /_(_)____   / / / /__  ____ ______/ /_
 *  *    \===\ \   \\\\\\\/   ///////     /===/  / / / / / / / __ \/ __ `/ __/ / ___/  / /_/ / _ \/ __ `/ ___/ __/
 *  *      \==\/     \\\\/ / //////       /==/  / /_/ / /_/ / / / / /_/ / /_/ / /__   / __  /  __/ /_/ / /  / /_
 *  *      \==\     _ \\/ / /////        |==/   \___\_\__,_/_/ /_/\__,_/\__/_/\___/  /_/ /_/\___/\__,_/_/   \__/
 *  *        \==\  / \ / / ///          /===/
 *  *        \==\ /   / / /________/    /==/
 *  *          \==\  /               | /==/
 *  *          \=\  /________________|/=/
 *  *            \==\     _____     /==/
 *  *           / \===\   \   /   /===/
 *  *          / / /\===\  \_/  /===/
 *  *         / / /   \====\ /====/
 *  *        / / /      \===|===/
 *  *        |/_/         \===/
 *  *                       =
 *  *
 *  * Copyright(c) Developed by John Alves at 2020/2/2 at 7:38:36 for quantic heart studios
 *
 */

package com.quanticheart.databaseroom

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.quanticheart.database.dao.clearUserData
import com.quanticheart.database.dao.insertUserData
import com.quanticheart.database.dao.updateUserdata
import com.quanticheart.database.dao.userdata
import com.quanticheart.database.entity.UserData
import kotlinx.android.synthetic.main.activity_main.*

class ExampleActivity : AppCompatActivity() {

    /**
     * https://medium.com/androiddevelopers/7-pro-tips-for-room-fbadea4bfbd1#dd40
     * https://codinginfinite.com/android-room-tutorial-persistence/
     * https://codelabs.developers.google.com/codelabs/android-room-with-a-view/#0
     */

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        insertUserData(user())

        userdata { u ->
            Log.w("n", u.name)
            Log.w("c", u.cpf.toString())
            Log.w("e", u.email)
            Log.w("id", u.id.toString())
        }

        updateUserdata(userUp())

        userdata { u2 ->
            Log.w("n Up", u2.name)
            Log.w("c Up", u2.cpf.toString())
            Log.w("e Up", u2.email)
        }

        clearUserData()

        userdata { u3 ->
            Log.w("n delete", u3.name)
            Log.w("c delete", u3.cpf.toString())
            Log.w("e delete", u3.email)
        }

        Log.w("Room", "Loading in Background")
    }

    private fun user(): UserData = UserData("TESTES TES", 0, "TESTES@TESTES")
    private fun userUp(): UserData = UserData("TESTES TES UP", 1, "TESTES@TESTES UP")
}
