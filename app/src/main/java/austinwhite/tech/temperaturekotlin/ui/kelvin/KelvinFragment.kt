package austinwhite.tech.temperaturekotlin.ui.kelvin

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

class KelvinFragment : Fragment() {


    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_kel, container, false)
        val tempresultk: TextView = root.findViewById(R.id.text_kel) //result
        val tempkels: EditText = root.findViewById(R.id.tempk) //user input temperature
        val button: Button = root.findViewById(R.id.submitkel) //submit button

        button.setOnClickListener {
            val temp = tempkels.text.toString()

            if (temp.isEmpty()) {
                tempresultk.text = (getString(R.string.error))
            } else {
                checker(temp, tempresultk)
            }

        }
        return root
    }

    private fun checker(temp: String, tempresultk: TextView) {
        if (temp.toDouble() in 309.25..310.35) {
            tempresultk.text = getString(R.string.normal)
        } else {
            tempresultk.text = getString(R.string.abnormal)
        }
    }
}
