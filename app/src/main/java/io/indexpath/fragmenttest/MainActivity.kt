package io.indexpath.fragmenttest

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loadPikachu(PikachuFragment())
        pikachu.setOnClickListener {
            loadPikachu(PikachuFragment())
        }

        pidgey.setOnClickListener {
            loadPidgey(PidgeyFragment())
        }

    }

    private  fun loadPikachu(frag1: PikachuFragment) {
        val ft = supportFragmentManager.beginTransaction()
        ft.replace(R.id.fragment, frag1)
        ft.commit()
    }

    private  fun loadPidgey(frag2: PidgeyFragment) {
        val ft = supportFragmentManager.beginTransaction()
        ft.replace(R.id.fragment, frag2)
        ft.commit()
    }
}
