package com.example.project2wishlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var myWishList : List<ListItem>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listsRv = findViewById<RecyclerView>(R.id.Listrv)
        val adapter = WishListAdapter(this, myWishList)

        val itemInput = findViewById<EditText>(R.id.itemID)
        val priceInput = findViewById<EditText>(R.id.priceID)
        val urlInput = findViewById<EditText>(R.id.urlID)

        findViewById<Button>(R.id.button).setOnClickListener {
            myWishList.add(ListItem(itemInput.text.toString(), urlInput.text.toString(), priceInput.text.toString()))
            adapter.notifyDataSetChanged()
        }
        listsRv.adapter=adapter
        listsRv.layoutManager=LinearLayoutManager(this)

    }
}