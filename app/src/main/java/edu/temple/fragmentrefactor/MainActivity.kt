package edu.temple.fragmentrefactor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (supportFragmentManager.findFragmentById(R.id.fragmentContainer) == null) {

            val fragmentTransaction: FragmentTransaction = supportFragmentManager.beginTransaction()

            fragmentTransaction.replace(R.id.fragmentContainer, RefactorFragment())

            fragmentTransaction.commit()
        }
    }
}