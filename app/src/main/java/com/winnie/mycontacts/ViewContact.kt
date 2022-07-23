package com.winnie.mycontacts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import com.squareup.picasso.NetworkPolicy
import com.squareup.picasso.Picasso
import com.winnie.mycontacts.databinding.ActivityViewContactBinding

//You have added images to your contacts app. Implement the following:
//When a contact card is clicked, open the contact in a new activity,
//ViewContactActivity. Pass the contact details using the intent.putExtra() function. In
//the ViewContactActivity display all the details of the contact passed through the
//intent, including the image. Add icons for call and sms to the view contact layout

class ViewContact : AppCompatActivity() {
    lateinit var bindingView : ActivityViewContactBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingView = ActivityViewContactBinding.inflate(layoutInflater)
        setContentView(bindingView.root)
        getExtras()
    }

//    fun getExtras(){
//        var name = intent.extras?.getString("NAME")
//        var address = intent.extras?.getString("ADDRESS")
//        Toast.makeText(this,name, Toast.LENGTH_LONG).show()
//    }

    fun getExtras(){
        val actionBar: ActionBar? = supportActionBar
        actionBar!!.setDisplayHomeAsUpEnabled(true)
        actionBar!!.setDisplayShowHomeEnabled(true)

        val extras = intent
        var name = extras.getStringExtra("NAME")
        var phone = extras.getStringExtra("PHONE")
        var email = extras.getStringExtra("EMAIL")
        var address = extras.getStringExtra("ADDRESS")

//        var image = bindingView.
//        actionBar.setTitle(name)
//        bindingView.tvN.text = name
//        bindingView.tvNumber.text = phone
//        bindingView.tvEmailOne.text = email
//        bindingView.tvAddress.text = address
//
//        Picasso.get()
//            .load(intent.getStringExtra("PROFILE"))
//            .networkPolicy(NetworkPolicy.OFFLINE)
//            .into(image)

    }
}