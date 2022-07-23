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
    lateinit var bindingView: ActivityViewContactBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingView = ActivityViewContactBinding.inflate(layoutInflater)
        setContentView(bindingView.root)
        getExtras()
    }

    fun getExtras(){
        var name = intent.extras?.getString("NAME")
        var address = intent.extras?.getString("ADDRESS")
        var email = intent.extras?.getString("EMAIL")
        var phoneNumber = intent.extras?.getString("PHONENUMBER")
        var image = bindingView.imgProfile

        Toast.makeText(this,name, Toast.LENGTH_LONG).show()


        bindingView.tvEmail1.text=email
        bindingView.tvPhone1.text=phoneNumber
        bindingView.tvContacName.text=name
        bindingView.tvLocation.text=address


        Picasso.get().load(intent.getStringExtra("IMAGE")).resize(200,200).centerCrop().into(bindingView.imgProfile)



    }


}
