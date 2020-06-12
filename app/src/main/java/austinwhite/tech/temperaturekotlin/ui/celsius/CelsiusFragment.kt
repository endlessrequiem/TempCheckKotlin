package austinwhite.tech.temperaturekotlin.ui.celsius

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.EditText
import kotlinx.android.synthetic.main.fragment_cel.*
import austinwhite.tech.temperaturekotlin.R


class CelsiusFragment : Fragment() {


    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_cel, container, false)
        val tempresult: TextView = root.findViewById(R.id.text_cel) //result
        val tempcels: EditText = root.findViewById(R.id.tempc) //user input temperature
        val button: Button = root.findViewById(R.id.submitcel) //submit button

        button.setOnClickListener {
            val temp = tempcels.text.toString().toDouble()

            if (temp in 36.1..37.2) {
                tempresult.setText(R.string.normal)
            } else {
                tempresult.setText(R.string.abnormal)
            }

        }

        return root
    }

}


