package mariadev.example.fibonnaciisequence

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.mwangi.recycler_views.valuesRVAdapter
import mariadev.example.fibonnaciisequence.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    override fun onResume() {
        super.onResume()
        fibonacciSequence()

    }

    fun fibonacciSequence() {
        var firstNum = 0
        var secondNum = 1
        var thirdNum: Int

        var numbers= mutableListOf<Int>(firstNum,secondNum)
        while (true) {
            thirdNum = firstNum + secondNum
            if (thirdNum > 100)
                break

            numbers.add(thirdNum)

            firstNum = secondNum
            secondNum = thirdNum
        }


        binding.rvFib.layoutManager=LinearLayoutManager(this)
        var numbersAdapter=valuesRVAdapter(numbers)
        binding.rvFib.adapter=numbersAdapter
    }

}
