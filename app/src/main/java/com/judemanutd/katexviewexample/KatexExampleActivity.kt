package com.judemanutd.katexviewexample

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_katex_example.*

class KatexExampleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_katex_example)

//        val text = "$\\sqrt{3}$"
        val text = "\"PQ is a post of given height a, and AB is a tower at some distance. If α and β are the angles of elevation of B, the top of the tower, at P and Q respectively, then the distance of the tower from the post is ___.\"\n" +
                "\n" +
                "\$\\frac{\\text{a\\ }}{\\ \\ (tan\\ \\alpha\\ –\\ tan\\ \\beta)\\ }\$,1,0,can’t find,\$\\frac{\\text{a\\ }}{\\ \\ (tan\\ \\alpha\\ –\\ tan\\ \\beta)\\ }\$,2,\"Let AB be the tower of height H and PQ is a given post of height a, α and β are angles of elevation of top of tower AB from P and Q. Let PA = x, PQ = a and BC = h.<br>The corresponding figure is as follows:<br>https://s3.ap-south-1.amazonaws.com/kg-question-images/f43fc9e3-b1a4-4b86-ab45-f1284cf36cec.jpg<br>In ∆QCB, <br>⇒ tan β = \$\\frac{h}{\\text{x\\ }}\$<br>⇒ x = \$\\frac{h}{\\text{tan\\ β}}\$<br>Again in ∆PAB,<br>⇒ tan α = \$\\frac{h\\ + \\ a\\ }{x}\$<br>⇒ x = \$\\frac{h\\ + \\ a\\ }{\\text{tan\\ α\\ }}\$<br>\$\\Rightarrow \\frac{\\text{h\\ }}{\\text{tan\\ β}}\$ = \$\\frac{h\\ + \\ a\\ }{\\text{tan\\ α}}\$<br>⇒ h tan α = h tan β + a tan β<br>⇒ h tanα − h tanβ = a tanβ <br>⇒ h (tanα − tanβ) = a tanβ <br>⇒ h = \$\\frac{\\text{atanβ\\ }}{tan\\alpha\\ - \\ tan\\beta}\$<br>Now<br>⇒ x = \$\\frac{\\text{atanβ\\ }}{(tan\\alpha\\ - \\ tan\\beta)tan\\beta\\ }\$<br>⇒ x = \$\\frac{\\text{a\\ }}{tan\\alpha\\ - \\ tan\\beta}\$<br>Hence, the required distance is \$\\frac{a}{tan\\alpha\\ - \\ tan\\beta}\$.\",2,TEXT,\"PQ is a post of given height a, and AB is a tower at some distance. If α and β are the angles of elevation of B, the top of the tower, at P and Q respectively, then the distance of the tower from the post is ___."
//        val text = "$ c = \\pm\\sqrt{a^2 + b^2} $"

        katex_text.setText(text)

        katex_text_2.setText(text)
        katex_text_2.setTextColor(Color.BLUE)
    }
}
