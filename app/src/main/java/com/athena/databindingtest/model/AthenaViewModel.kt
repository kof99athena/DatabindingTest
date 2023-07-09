package com.athena.databindingtest.model

import androidx.databinding.ObservableField

class AthenaViewModel {

    //이미지 url 변수를 하나 만들어주기 : 일반변수를 쓰면 관찰이 불가능하므로 옵저버블로 관찰 가능하게 만든다.
    var img : ObservableField<String> = ObservableField("https://media.istockphoto.com/id/902966276/ko/%EC%82%AC%EC%A7%84/%EA%B5%90%ED%86%A0%EB%B6%80-%EC%9D%BC%EB%B3%B8%EC%9A%A9-%EB%B4%84.jpg?s=2048x2048&w=is&k=20&c=O2pwHXBv4E8anrJOwRz3ZMkL8n_b3ljrIT_qduAk4WY=")
}