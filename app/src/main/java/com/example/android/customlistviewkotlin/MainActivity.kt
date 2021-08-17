package com.example.android.customlistviewkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var listview = findViewById<ListView>(R.id.listView)
        // here friends I will create a separate listview variable
        var list = mutableListOf<Model>()

        // add some images
        //list.add(Model("Facebook", "facebook description..", R.drawable.facebook))
        //list.add(Model("WhatsApp", "whatsapp description..", R.drawable.whatsapp))
        //list.add(Model("Twitter", "twitter description..", R.drawable.twitter))
       //list.add(Model("Instagram", "instagram description..", R.drawable.instagram))
        //list.add(Model("Youtube", "youtube description..", R.drawable.youtube))
        list.add(Model("Facebook", "facebook description.."))
        list.add(Model("WhatsApp", "whatsapp description.."))
        list.add(Model("Twitter", "twitter description.."))
        list.add(Model("Instagram", "instagram description.."))
        list.add(Model("Youtube", "youtube description.."))


        //Create the adapter
        listview.adapter = MyAdapter(this,R.layout.row, list)

        // now friends i will set item click listener and on item click i will show a toast
        listview.setOnItemClickListener { parent: AdapterView<*>, view: View, position: Int, id: Long ->
            if (position == 0) {
                Toast.makeText(this, "you clicked on facebook!", Toast.LENGTH_LONG).show()
            }
            if (position == 1) {
                Toast.makeText(this, "you clicked on whatsapp!", Toast.LENGTH_LONG).show()
            }
            if (position == 2) {
                Toast.makeText(this, "you clicked on twitter!", Toast.LENGTH_LONG).show()
            }
            if (position == 3) {
                Toast.makeText(this, "you clicked on instagram!", Toast.LENGTH_LONG).show()
            }
            if (position == 4) {
                Toast.makeText(this, "you clicked on youtube!", Toast.LENGTH_LONG).show()
            }

        }
    }
}

// now create a Model class
// now create an Adapter class
