package hn.ujcv.edu.pdm.p2.calculatorunittest
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txtNameOperation.requestFocus()
        btnAdd.setOnClickListener { addNumbers() }
        btnSubtract.setOnClickListener { subtractNumbers() }
        btnDivide.setOnClickListener { divideNumbers() }
        btnMultiply.setOnClickListener { multiplyNumbers() }
        btnReset.setOnClickListener { cleanFields() }
    }

    /** Normal Functions */
    fun addNumbers()
    {
        if (checkFields(txtNameOperation.text.toString(), txtFirstNumber.text.toString(), txtSecondNumber.text.toString()))
        {
            txvResult.text = testOperations(txtNameOperation.text.toString(),
                    txtFirstNumber.text.toString().toDouble(),
                    txtSecondNumber.text.toString().toDouble(),
                    btnAdd.text.toString().toUpperCase(Locale.ROOT))
        }
    }

    fun subtractNumbers()
    {
        if (checkFields(txtNameOperation.text.toString(), txtFirstNumber.text.toString(), txtSecondNumber.text.toString()))
        {
            txvResult.text = testOperations(txtNameOperation.text.toString(), txtFirstNumber.text.toString().toDouble(), txtSecondNumber.text.toString().toDouble(), btnSubtract.text.toString().toUpperCase(Locale.ROOT))
        }
    }

    fun divideNumbers()
    {
        if (checkFields(txtNameOperation.text.toString(), txtFirstNumber.text.toString(), txtSecondNumber.text.toString()))
        {
            txvResult.text = testOperations(txtNameOperation.text.toString(), txtFirstNumber.text.toString().toDouble(),
                    txtSecondNumber.text.toString().toDouble(), btnDivide.text.toString().toUpperCase(Locale.ROOT))
        }
    }

    fun multiplyNumbers()
    {
        if (checkFields(txtNameOperation.text.toString(), txtFirstNumber.text.toString(), txtSecondNumber.text.toString()))
        {
            txvResult.text = testOperations(txtNameOperation.text.toString(), txtFirstNumber.text.toString().toDouble(), txtSecondNumber.text.toString().toDouble(), btnMultiply.text.toString().toUpperCase(Locale.ROOT))
        }
    }

    fun cleanFields()
    {
        txtFirstNumber.text.clear()
        txtSecondNumber.text.clear()
        txtNameOperation.text.clear()
        txtNameOperation.requestFocus()
        txvResult.text = "Result"
    }

    /*---- Functions for test ----*/
    // Operations Test
    fun testOperations(name: String, num1: Double, num2: Double, type: String): String
    {
        when (type) {
            "ADD" -> {
                val sum: Double = num1 + num2
                val format = String.format("%.2f", sum)
                return "$name is $format"
            }
            "MULTIPLY" -> {
                val sum: Double = num1 * num2
                val format = String.format("%.2f", sum)
                return "$name is $format"
            }
            "SUBTRACT" -> {
                val sum: Double = num1 - num2
                val format = String.format("%.2f", sum)
                return "$name is $format"
            }
            else -> {
                val sum: Double = num1 / num2
                val format = String.format("%.2f", sum)
                return "$name is $format"
            }
        }
    }

    // Check Fields Test
    fun checkFields(nameOfOperation: String, firstNumber: String, secondNumber: String): Boolean
    {
        if (nameOfOperation.isEmpty() && firstNumber.isEmpty() && secondNumber.isEmpty())
        {
            //Toast.makeText(this, "Do not leave empty fields", Toast.LENGTH_SHORT).show()
            return false
        }
        else if (firstNumber.isEmpty())
        {
            //Toast.makeText(this, "Write the First Number", Toast.LENGTH_SHORT).show()
            return false
        }
        else if (secondNumber.isEmpty())
        {
            //Toast.makeText(this, "Write the Second Number", Toast.LENGTH_SHORT).show()
            return false
        }
        else if (nameOfOperation.isEmpty())
        {
            //Toast.makeText(this, "Write the Name of the Operation", Toast.LENGTH_SHORT).show()
            return false
        }
        else
        {
            return true
        }
    }
}