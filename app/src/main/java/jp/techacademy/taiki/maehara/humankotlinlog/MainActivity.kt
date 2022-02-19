package jp.techacademy.taiki.maehara.humankotlinlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human1 = Human("山田", 15, "読書")
        human1.say()
        human1.think()

        val human2 = Human("たなか", 9, "スポーツ")
        human2.say()
        human2.think()

    }
}