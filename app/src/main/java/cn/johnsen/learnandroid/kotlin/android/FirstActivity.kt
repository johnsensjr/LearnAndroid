package cn.johnsen.learnandroid.kotlin.android

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import cn.johnsen.learnandroid.R
import kotlinx.android.synthetic.main.activity_first.*

class FirstActivity : AppCompatActivity() {

    companion object {//模仿静态类的写法
        @JvmStatic //使方法实际成为静态的 只能加在单例类 和 companion object中的方法上
        fun actionStart(context: Context, data1: String, data2: String) {
            val intent = Intent(context, FirstActivity::class.java).apply {
                putExtra(data1, data1)
                putExtra(data2, data2)
            }
            context.startActivity(intent)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)
        tv_click.setOnClickListener { Toast.makeText(this, "", Toast.LENGTH_LONG).show() }
    }
}