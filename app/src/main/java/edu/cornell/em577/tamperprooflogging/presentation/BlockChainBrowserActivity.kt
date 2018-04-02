package edu.cornell.em577.tamperprooflogging.presentation

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import edu.cornell.em577.tamperprooflogging.R
import edu.cornell.em577.tamperprooflogging.data.source.UserDataRepository

class BlockChainBrowserActivity : AppCompatActivity() {

    companion object {
        private const val GENESIS = "Genesis"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_block_chain_browser)
    }

    fun addBlockButtonListener(view: View) {
        val intent = Intent(this, AddBlockActivity::class.java)
        startActivity(intent)
    }

    fun logoutButtonListener(view: View) {
        val userRepository = UserDataRepository.getInstance(resources)
        userRepository.setCurrentUser(userRepository.getUser(GENESIS))
        finish()
    }
}
