package austinwhite.tech.temperaturekotlin.ui.celsius

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

class CelsiusViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "0"
    }
    val text: LiveData<String> = _text
}