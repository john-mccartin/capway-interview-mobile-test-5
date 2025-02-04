package app.capway.designchallenge.view

import android.os.Bundle
import android.os.Parcel
import android.view.MenuItem
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import app.capway.designchallenge.R


/**
 * Placeholder activity displaying a test screen.
 */
class BlankActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_blank)

        // Calling the action bar
        val actionBar: ActionBar? = supportActionBar

        // Showing the back button in action bar
        actionBar?.setDisplayHomeAsUpEnabled(true)
    }

    /**
     * Provides a function for the home arrow being selected.
     */
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.getItemId()) {
            android.R.id.home -> {
                finish()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }
}