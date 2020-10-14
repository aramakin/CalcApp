package jp.techacademy.nana.calcapp

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent
import android.widget.Toast
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        plus.setOnClickListener {
            //getTextの返り値はTextView型 → toStringで型変換して代入
            try {
                val x: Double = x.getText().toString().toDouble()
                val y: Double = y.getText().toString().toDouble()
                val test = x + y
                Log.d("test", "$test")

                //画面の遷移処理
                val intent = Intent(this, SecondActivity::class.java)
                intent.putExtra("VALUE1", test)
                startActivity(intent)
            } catch (e: Exception) {
                Toast.makeText(applicationContext, "エラーが発生しました", Toast.LENGTH_LONG).show()
            }
        }

        minus.setOnClickListener {
            try {
                val x: Double = x.getText().toString().toDouble()
                val y: Double = y.getText().toString().toDouble()
                val test = x - y
                Log.d("test", "$test")

                //画面の遷移処理
                val intent = Intent(this, SecondActivity::class.java)
                intent.putExtra("VALUE1", test)
                startActivity(intent)
            } catch (e: Exception) {
                Toast.makeText(applicationContext, "エラーが発生しました", Toast.LENGTH_LONG).show()
            }

        }
        waru.setOnClickListener {
            try {
                val x: Double = x.getText().toString().toDouble()
                val y: Double = y.getText().toString().toDouble()
                val test = x / y
                Log.d("test", "$test")

                //画面の遷移処理
                val intent = Intent(this, SecondActivity::class.java)
                intent.putExtra("VALUE1", test)
                startActivity(intent)
            } catch (e: Exception) {
                Toast.makeText(applicationContext, "エラーが発生しました", Toast.LENGTH_LONG).show()
            }
        }
        multi.setOnClickListener {
            try {
                val x: Double = x.getText().toString().toDouble()
                val y: Double = y.getText().toString().toDouble()
                val test = x * y
                Log.d("test", "$test")

                //画面の遷移処理
                val intent = Intent(this, SecondActivity::class.java)
                intent.putExtra("VALUE1", test)
                startActivity(intent)
            } catch (e: Exception) {
                Toast.makeText(applicationContext, "エラーが発生しました", Toast.LENGTH_LONG).show()
            }
        }
    }
}