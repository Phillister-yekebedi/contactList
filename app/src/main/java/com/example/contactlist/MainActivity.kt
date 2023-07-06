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
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        displayContactsList()
    }
        fun displayContactsList(){
            var name = contactsData("Wycliffe", "0782329012","wycliffe@gmail.com","")
            var name1= contactsData("Abigael", "0726855987","abigael@gmail.com","")
            var name2 = contactsData("Sharon", "0780933290","shaz@gmail.com","")
            var name3= contactsData("Bathsheba", "070392416","sheba@gmail.com","")
            var name4= contactsData("Dosantos", "07632100909","dosantos@gmail.com","")
            var name5= contactsData("Joyce", "0782329012","joyce@gmail.com","")
            var name6= contactsData("Angeth", "0759942644","herjok@gmail.com","")
            var name7= contactsData("Ishimwe", "0780364894","ishimwe@gmail.com","")
            var name8= contactsData("Ruth", "0743124900","ruthh@gmail.com","")
            var name9= contactsData("Ann", "0792930423","ann@gmail.com","")
            var name10= contactsData("Myles", "0782329012","myles@gmail.com","")

            var names = listOf(name,name1,name2,name3,name4,name5,name6,name7, name8,name9,name10)
            val contactAdapter =contactRvAdapter(names)
            binding.rvContactsDetails.layoutManager = LinearLayoutManager(this)
            binding.rvContactsDetails.adapter = contactAdapter
        }
}

