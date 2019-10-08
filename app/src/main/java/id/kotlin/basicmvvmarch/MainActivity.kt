package id.kotlin.basicmvvmarch

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    val viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)
    viewModel.setModel()
    viewModel.getModel().observe(this, Observer { model ->
      tv_name.text = resources.getString(R.string.text_name, model.name)
      tv_age.text = resources.getString(R.string.text_age, model.age)
    })
  }
}