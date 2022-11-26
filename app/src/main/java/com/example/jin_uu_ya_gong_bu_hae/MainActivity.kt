package com.example.jin_uu_ya_gong_bu_hae

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.clear
import kotlinx.android.synthetic.main.activity_main.plus
import kotlinx.android.synthetic.main.activity_main.result


class Calculator : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var a: String = ""
        var list = mutableListOf<String>()
        var b: Long = 0L
        var c: Long = 1L
        var d: Double = 1.0

        num1.setOnClickListener {
            all_result.setText(all_result.getText().append("1"))
            a = all_result.getText().toString()
        }

        num2.setOnClickListener {
            all_result.setText(all_result.getText().append("2"))
            a = all_result.getText().toString()
        }

        num3.setOnClickListener {
            all_result.setText(all_result.getText().append("3"))
            a = all_result.getText().toString()
        }

        num4.setOnClickListener {
            all_result.setText(all_result.getText().append("4"))
            a = all_result.getText().toString()
        }

        num5.setOnClickListener {
            all_result.setText(all_result.getText().append("5"))
            a = all_result.getText().toString()
        }

        num6.setOnClickListener {
            all_result.setText(all_result.getText().append("6"))
            a = all_result.getText().toString()
        }

        num7.setOnClickListener {
            all_result.setText(all_result.getText().append("7"))
            a = all_result.getText().toString()
        }

        num8.setOnClickListener {
            all_result.setText(all_result.getText().append("8"))
            a = all_result.getText().toString()
        }

        num9.setOnClickListener {
            all_result.setText(all_result.getText().append("9"))
            a = all_result.getText().toString()
        }

        num0.setOnClickListener {
            all_result.setText(all_result.getText().append("0"))
            a = all_result.getText().toString()
        }

        plus.setOnClickListener {
            all_result.setText(all_result.getText().append("+"))
            a = all_result.getText().toString()
        }

        minus.setOnClickListener {
            all_result.setText(all_result.getText().append("-"))
            a = all_result.getText().toString()
        }

        multiple.setOnClickListener {
            all_result.setText(all_result.getText().append("X"))
            a = all_result.getText().toString()
        }

        slush.setOnClickListener {
            all_result.setText(all_result.getText().append("/"))
            a = all_result.getText().toString()
        }

        result.setOnClickListener {
            b = 0
            c = 1
            d = 1.0
            if (list.size != 0) {
                list = mutableListOf<String>()
            }

            if (all_result.getText().contains("+")) {
                val str = all_result.getText().split("+")
                val a = str[0].toDouble()
                val z = a.toInt()
                for (i in 0..str.size - 1) {
                    if(i == 0){
                        list.add(z.toString())
                        b += list.get(i).toInt()
                    }else{
                        list.add(str[i])
                        b += list.get(i).toInt()
                    }

                }

                all_result.setText(String.format("%d", b))
            }

            if (all_result.getText().contains("-")) {
                val str = all_result.getText().split("-")
                val a = str[0].toDouble()
                val z = a.toLong()
                b = z
                for (i in 0..str.size - 1) {
                    list.add(str[i])
                    if (i != 0) {
                        b -= list.get(i).toInt()

                    }
                }

                all_result.setText(String.format("%d", b))
            }

            if (all_result.getText().contains("X")) {
                val str = all_result.getText().split("X")
                val a = str[0].toDouble()
                val z = a.toInt()

                for (i in 0..str.size - 1) {
                    if(i == 0){
                        list.add(z.toString())
                        c *= list.get(i).toInt()
                    }else{
                        list.add(str[i])
                        c *= list.get(i).toInt()
                    }

                }

                all_result.setText(String.format("%d", c))
            }

            if (all_result.getText().contains("/")) {
                val str = all_result.getText().split("/")
                d = str[0].toDouble()
                for (i in 0..str.size - 1) {
                    list.add(str[i])
                    if (i != 0) {
                        d /= list.get(i).toDouble()

                    }
                }

                all_result.setText(String.format("%.2f", d))
            }

        }

        clear.setOnClickListener {
            all_result.setText("")
        }




    }
}