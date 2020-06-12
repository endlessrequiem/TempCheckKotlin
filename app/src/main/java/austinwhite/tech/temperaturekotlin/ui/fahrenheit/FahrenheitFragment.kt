package austinwhite.tech.temperaturekotlin.ui.fahrenheit

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.support.v4.app.Fragment
import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.widget.Button
import android.widget.EditText
import austinwhite.tech.temperaturekotlin.R

class FahrenheitFragment : Fragment() {


    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_fah, container, false)
        val tempresultf: TextView = root.findViewById(R.id.text_fah) //result
        val tempfah: EditText = root.findViewById(R.id.tempf) //user input temperature
        val button: Button = root.findViewById(R.id.submitfah) //submit button

        button.setOnClickListener {
            val temp = tempfah.text.toString().toDouble()

            if (temp in 97.0..99.0) {
                tempresultf.setText(R.string.normal)
            } else {
                tempresultf.setText(R.string.abnormal)
            }

        }
        return root
    }
}
