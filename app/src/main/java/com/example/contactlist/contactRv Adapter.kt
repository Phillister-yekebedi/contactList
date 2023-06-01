package com.example.contactlist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.contactlist.R.id.imageView
import com.example.contactlist.databinding.ContactListItemBinding
import kotlinx.coroutines.currentCoroutineContext

class contactRvAdapter(var contactList: List<contactsData>):RecyclerView.Adapter<contactRvAdapter.ContactViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int):ContactViewHolder{
        val binding=ContactListItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ContactViewHolder(binding)

    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        val currentContacts=contactList.get(position)
        val binding=holder.binding
        binding.imageView.tag=currentContacts.Image
        binding.tvName.text=currentContacts.name
        binding.tvPhoneNumber.text=currentContacts.PhoneNumber
        binding.tvEmail.text=currentContacts.Email
    }
    override fun getItemCount(): Int {
        return contactList.size
    }
    class ContactViewHolder(var binding:ContactListItemBinding):RecyclerView.ViewHolder(binding.root)

}




