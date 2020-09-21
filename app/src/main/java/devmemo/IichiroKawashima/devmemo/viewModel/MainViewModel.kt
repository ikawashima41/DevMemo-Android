package devmemo.iichirokawashima.devmemo.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import devmemo.iichirokawashima.devmemo.entity.Memos

class MainViewModel : ViewModel() {
    var liveDataMemos: MutableLiveData<Memos> = MutableLiveData()

    fun fetchMemos() {}
}