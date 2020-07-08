package fr.epita.android.helloclicks

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ActionMenuView
import kotlinx.android.synthetic.main.activity_main.*

var counter : Int = 0
var step : Int = 1
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btn_clickMe.setOnClickListener{
            counter += step
            field_counter.setText(counter.toString())
        }

        btn_reset.setOnClickListener {
            counter = 0
            field_counter.setText("0")
        }

        btn_reverse.setOnClickListener {
            counter -= step
            field_counter.setText(counter.toString())
        }

        btn_normal.setOnClickListener {
            step = 1
        }

        btn_big.setOnClickListener {
            step = 5
        }

        btn_goto2.setOnClickListener {
            val explicitIntent : Intent = Intent(this@MainActivity, SecondActivity::class.java)
            explicitIntent.putExtra("message","Goodbye")
            startActivity(explicitIntent)

            /*
            val url = "https://epita.fr"
            val implicitIntent : Intent = Intent(Intent.ACTION_VIEW)
            implicitIntent.data = Uri.parse(url)
            startActivity(implicitIntent)
             */
        }

    }
}
