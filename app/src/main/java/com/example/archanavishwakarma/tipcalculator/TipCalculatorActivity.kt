package com.example.archanavishwakarma.tipcalculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_tip_calculator.*

class TipCalculatorActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tip_calculator)

        tv_result.visibility = View.INVISIBLE

        button_cal.setOnClickListener{
            var billValue = et_bill.text.toString().toDouble()
            var tipValue = et_tip.text.toString().toDouble()

            val total = tipValue + billValue;

            tv_result.text = "Tip \$${String.format("%.2f",tipValue)} Total \$${String.format("%.2f",total)}" ;

            tv_result.visibility = View.VISIBLE
        }
    }
}
