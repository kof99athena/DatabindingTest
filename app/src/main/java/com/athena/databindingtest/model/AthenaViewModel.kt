package com.athena.databindingtest.model

import android.content.ClipData.Item
import androidx.databinding.ObservableField
import com.athena.databindingtest.data.AthenaItem
import java.util.Date

class AthenaViewModel {


    //이미지 url 변수를 하나 만들어주기 : 일반변수를 쓰면 관찰이 불가능하므로 옵저버블로 관찰 가능하게 만든다.
    var img: ObservableField<String> =
        ObservableField("https://cdn.pixabay.com/photo/2023/06/18/04/57/crimson-collared-tanager-8071235_1280.jpg")


    //리사이클러뷰가 보여줄 대량의 데이터 컬렉션
    val items : ObservableField<MutableList<AthenaItem>> = ObservableField(mutableListOf(AthenaItem("안","안녕"),AthenaItem("안녕","반갑")))


    fun add() {
        val list: MutableList<AthenaItem> = mutableListOf()
        list.add(AthenaItem("databinding", Date().toString()))
        list.addAll(items.get()!!)
        items.set(list)

    }

    fun changeImage() {
        img.set("https://cdn.pixabay.com/photo/2023/07/02/07/20/helianthemum-8101493_1280.jpg")
    }

}//class
