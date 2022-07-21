package com.winnie.mycontacts

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.ListMenuItemView
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import com.winnie.mycontacts.databinding.ContactListItemBinding

class ContactRvAdapter (var contactList: List<Contact>): RecyclerView.Adapter<ContactViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {

        var binding = ContactListItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)

        return ContactViewHolder(binding)

    }

    // recycler view display each item in their row

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        var currentContact = contactList.get(position)
        holder.binding.tvName.text = currentContact.name
        holder.binding.tvPhoneNumber.text = currentContact.phoneNumber
        holder.binding.tvEmail.text = currentContact.email
        holder.binding.tvAddress.text = currentContact.address
        Picasso.get().load(currentContact.image).placeholder(R.drawable.ic_baseline_person_24).resize(200,200).centerCrop().into(holder.binding.imgContact)
    }

    override fun getItemCount(): Int {
        return contactList.size
    }
}

class ContactViewHolder(val binding: ContactListItemBinding):
    RecyclerView.ViewHolder(binding.root)