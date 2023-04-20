package kr.hs.emirim.viewpropertiestest2

import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)  //항상 이 다음에 id를 찾아야 한다.
        //findviewbyid는 항상 setContentView 밑에 선언해야한다.

        var t1 : TextView
        var t2 : TextView
        var t3 : TextView

        t1 = findViewById<TextView>(R.id.text1)
        t2 = findViewById<TextView>(R.id.text2)
        t3 = findViewById<TextView>(R.id.text3)

        t1.setText("안녕 미림")
        t1.setTextSize(30.0f)
        t1.setTextColor(Color.GREEN)

        t2.setText("hello")
        t2.setTextSize(40.0f)
        t2.setTextColor(Color.CYAN)
        t2.setTypeface(Typeface.SANS_SERIF,Typeface.BOLD_ITALIC)

        t3.setText("미림여자정보과학고미림여자정보과학고미림여자정보과학고미림여자정보과학고미림여자정보과학고미림여자정보과학고미림여자정보과학고미림여자정보과학고미림여자정보과학고")
        t3.setSingleLine() //...으로 보이지 않고 화면을 넘어가면 그냥 자른다.

    }
}