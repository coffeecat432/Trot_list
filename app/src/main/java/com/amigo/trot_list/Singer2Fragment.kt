package com.amigo.trot_list

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Singer2Fragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_singer2, container, false)

        val items = mutableListOf<String>()
        items.add("아버지")
        items.add("천개의 바람이 되어")
        items.add("어느날 문득")
        items.add("후")
        items.add("연모")
        items.add("미운사랑")
        items.add("따라따라")
        items.add("배신자")
        items.add("별빛같은 나의 사랑아")
        items.add("홍랑")
        items.add("엄마의 노래")
        items.add("나쁜 남자")
        items.add("노래는 나의 인생")
        items.add("여백")
        items.add("울면서 후회하네")


        //여기서 view는 fragment_singer1.xml를 받고 있다. 즉, fragment_singer1.xml에서 findViewById로 singRV를 찾아오는 거다.
        val rv = view.findViewById<RecyclerView>(R.id.singRV)
        val rvAdapter = RVAdapter(items)

        rv.adapter = rvAdapter
        rv.layoutManager = LinearLayoutManager(context)




        view.findViewById<ImageView>(R.id.image1).setOnClickListener{
            it.findNavController().navigate(R.id.action_singer2Fragment_to_singer1Fragment)
        }

        view.findViewById<ImageView>(R.id.image3).setOnClickListener{
            it.findNavController().navigate(R.id.action_singer2Fragment_to_singer3Fragment)
        }

        return view
    }

}