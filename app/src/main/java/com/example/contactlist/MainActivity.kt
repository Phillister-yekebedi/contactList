package com.example.contactlist

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.contactlist.databinding.ActivityMainBinding
import com.example.contactlist.databinding.ContactListItemBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        displayContactsList()
    }
        fun displayContactsList(){
            var name = contactsData("Wycliffe", "0782329012","wycliffe@example.com","")
            var name1= contactsData("Abigael", "0726855987","abigael@example.com","")
            var name2 = contactsData("Sharon", "0780933290","shaz@example.com","")
            var name3= contactsData("Bathsheba", "070392416","sheba@example.com","")
            var name4= contactsData("Dosantos", "07632100909","dosantos@example.com","")
            var name5= contactsData("Joyce", "0782329012","joyce@example.com","")

            var names = listOf(name,name1,name2,name3,name4,name5)
            val contactAdapter =contactRvAdapter(names)
            binding.rvContactsDetails.layoutManager = LinearLayoutManager(this)
            binding.rvContactsDetails.adapter = contactAdapter
        }
}
//
