package austinwhite.tech.temperaturekotlin.ui.kelvin

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

class KelvinViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Kelvin"
    }
    val text: LiveData<String> = _text
}