package id.kotlin.basicmvvmarch

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

  private var model = MutableLiveData<MainModel>()

  fun getModel(): LiveData<MainModel> = model

  fun setModel() {
    model.postValue(MainModel(name = "Budi Oktaviyan", age = 32))
  }
}