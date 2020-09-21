package devmemo.iichirokawashima.devmemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.iichirokawashima.devmemo.R
import devmemo.IichiroKawashima.devmemo.MainFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            supportFragmentManager
                .beginTransaction()
                .add(R.id.container, MainFragment())
                .commit()
        }
    }
}
