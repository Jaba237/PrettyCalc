package cmr.the_ak.calculator_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import cmr.the_ak.calculator_app.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    //Creating a binding class for activity_main.xml
    //which is generated automatically

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding : ActivityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Call a button


        //Addition
        binding.btnPlus.setOnClickListener{

            val input1 =binding.editTextInput1.text.toString().toInt()
            val input2 = binding.editTextInput2.text.toString().toInt()

            binding.TVresults.text = (input1 + input2).toString()
        }
        //Subtraction
        binding.btnMinus.setOnClickListener{
            val input1 = binding.editTextInput1.text.toString().toInt()
            val input2 = binding.editTextInput2.text.toString().toInt()

            binding.TVresults.text = (input1 - input2).toString()
        }
        //Multiplication
        binding.btnMultiplication.setOnClickListener{
            val input1 = binding.editTextInput1.text.toString().toInt()
            val input2 = binding.editTextInput2.text.toString().toInt()

            binding.TVresults.text =(input1 * input2).toString()
        }
        //Division
        binding.btnDivision.setOnClickListener{

            val input1 = binding.editTextInput1.text.toString().toInt()
            val input2 = binding.editTextInput2.text.toString().toInt()

            binding.TVresults.text = (input1 / input2).toString()
        }

        binding.btnReset.setOnClickListener{

            if ((binding.editTextInput1.text.toString() !="")||((binding.editTextInput2.text.toString()!=""))){

                binding.editTextInput1.setText("")
                binding.editTextInput2.setText("")
                binding.TVresults.text = "Result Text View"

            }
        }


    }
}