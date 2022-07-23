package com.winnie.mycontacts

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
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
    //http - system that governs communication between client and server
    // recycler view display each item in their row

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        var currentContact = contactList.get(position)
        holder.binding.tvName.text = currentContact.name
        holder.binding.tvPhoneNumber.text = currentContact.phoneNumber
        holder.binding.tvEmail.text = currentContact.email
        holder.binding.tvAddress.text = currentContact.address
        Picasso.get().load(currentContact.image).placeholder(R.drawable.ic_baseline_person_24).resize(200,200).centerCrop().into(holder.binding.imgContact)

        val context = holder.itemView.context
        holder.binding.imgContact.setOnClickListener {
            Toast.makeText(context,"You've clicked the image", Toast.LENGTH_SHORT).show()
        }
        holder.binding.cvContact.setOnClickListener {
            val intent = Intent(context,ViewContact::class.java)
            intent.putExtra("NAME",currentContact.name)
            intent.putExtra("ADDRESS",currentContact.address)
            intent.putExtra("EMAIL",currentContact.email)
            intent.putExtra("PHONENUMBER",currentContact.phoneNumber)
            intent.putExtra("IMAGE",currentContact.image)
            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return contactList.size
    }
}

class ContactViewHolder(val binding: ContactListItemBinding):
    RecyclerView.ViewHolder(binding.root)