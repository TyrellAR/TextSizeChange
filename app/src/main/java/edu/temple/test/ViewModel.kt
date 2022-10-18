package edu.temple.test
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import java.io.Closeable


class ViewModel: ViewModel() {
    val data = MutableLiveData<Any>()
    fun setData(msg: String){
        data.setValue(msg)

    }
}