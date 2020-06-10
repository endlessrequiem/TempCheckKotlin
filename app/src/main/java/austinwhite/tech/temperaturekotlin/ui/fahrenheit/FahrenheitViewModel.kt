package austinwhite.tech.temperaturekotlin.ui.fahrenheit

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

class FahrenheitViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Fahrenheit"
    }
    val text: LiveData<String> = _text
}