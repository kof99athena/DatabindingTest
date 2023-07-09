package com.athena.databindingtest.model

import android.content.ClipData.Item
import androidx.databinding.ObservableField
import com.athena.databindingtest.data.AthenaItem
import java.util.Date

class AthenaViewModel {

    //이미지 url 변수를 하나 만들어주기 : 일반변수를 쓰면 관찰이 불가능하므로 옵저버블로 관찰 가능하게 만든다.
    var img: ObservableField<String> =
        ObservableField("https://cdn.pixabay.com/photo/2023/06/18/04/57/crimson-collared-tanager-8071235_1280.jpg")

    fun changeImage() {
        img.set("https://media.istockphoto.com/id/1313338296/ko/%EC%82%AC%EC%A7%84/%ED%81%AC%EB%A6%BC%EC%8A%A8-%EC%B9%BC%EB%9D%BC-%ED%83%80%EB%82%98%EA%B1%B0-%EB%9E%8C%ED%98%B8%EC%85%80%EB%A3%A8%EC%8A%A4-%EC%82%B0%EA%B8%B0%EB%86%80%EB%A0%8C%ED%88%AC%EC%8A%A4%EB%8A%94-%EB%A9%95%EC%8B%9C%EC%BD%94%EC%97%90%EC%84%9C-%ED%8C%8C%EB%82%98%EB%A7%88%EC%97%90-%EC%9D%B4%EB%A5%B4%EA%B8%B0%EA%B9%8C%EC%A7%80-%ED%8C%8C%EB%A1%9C%ED%8A%B8%EB%9D%BC%EC%9A%B0%ED%94%BC%EC%82%B0%EA%B8%B0%EB%86%80%EB%A0%8C%ED%83%80%EB%A1%9C-%EC%86%8C%EC%9C%A0%EB%90%98%EB%8A%94-%EC%9E%91%EC%9D%80-%EC%A4%91%EB%AF%B8-%ED%9D%91%EC%9D%B8%EA%B3%BC-%EB%B6%89%EC%9D%80-%EB%85%B8%EB%9E%98-%EC%83%88%EC%9E%85%EB%8B%88%EB%8B%A4.jpg?s=2048x2048&w=is&k=20&c=jRoMEL-ZwPF4jl9k0FPRFlVhz1ub-sO4dI-1xTO1DG4=")
    }

        val items: ObservableField<MutableList<AthenaItem>> =
            ObservableField(mutableListOf(AthenaItem("ahn", "ahn"), AthenaItem("ahn", "ahn")))

        fun add() {
            val list: MutableList<AthenaItem> = mutableListOf()
            list.add(AthenaItem("new", Date().toString()))
            list.addAll(items.get()!!)
            items.set(list)
        }
}//class
