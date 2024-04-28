package com.example.bottomnavigation2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.bottomNaviagtionView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val FirstFragement = First_Fragement()
        val SecondFragement = Second_Fragement()
        val ThirdFragemnt = Third_Fragement()

        setcurrentFrageement(FirstFragement)
        bottomNaviagtionView.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.miHome -> setcurrentFrageement(FirstFragement)
                R.id.mimessgae ->setcurrentFrageement(SecondFragement)
                R.id.miprofile ->setcurrentFrageement(ThirdFragemnt)
            }
            true
        }

        bottomNaviagtionView.getOrCreateBadge(R.id.mimessgae).apply {
            number = 10
            isVisible =true
        }

    }



    private fun setcurrentFrageement(fragment: Fragment) =
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.FlFragement,fragment)
            commit()
        }

}