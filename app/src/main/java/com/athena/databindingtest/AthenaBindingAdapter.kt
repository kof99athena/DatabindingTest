package com.athena.databindingtest

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.athena.databindingtest.data.AthenaItem
import com.bumptech.glide.Glide

object AthenaBindingAdapter {
    //기존 xml에는 없는 속성을 만들어서 연결해 줄 객체를 만들자(이미지뷰에)
    //싱글톤, 한명만 만들어서 얘한테 계속 일 시킬예정

    //xml 속성이름을 내가 지어준다. imageUrl
    @BindingAdapter("imageUrl")

    @JvmStatic
    //(어떤 뷰에-이미지뷰에, 무엇을?-url을)
    fun loadImage(view : ImageView, url : String){
        Glide.with(view.context).load(url).into(view)
    }


    @BindingAdapter("item")
    @JvmStatic
    fun setItemList(view : RecyclerView, items:Any){
        view.adapter = RecyclerItemAdapter(view.context, items as List<AthenaItem>)
    }
}