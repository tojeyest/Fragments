package otus.gpb.homework.fragments.second

import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import otus.gpb.homework.fragments.R

class SecondTaskActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_task)

        supportFragmentManager.commit {
            replace<FragmentBA>(R.id.container_one)

    }
        if (resources.configuration.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            supportFragmentManager.commit {
                replace<FragmentBB>(R.id.container_two)

            }
        }
    }
}
