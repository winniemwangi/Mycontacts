package com.winnie.mycontacts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.winnie.mycontacts.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displayContacts()
    }

    fun displayContacts(){
        var contact = Contact("Winnie", "winnie@gmail.com", "0789898989","616 Korongo", "https://images.unsplash.com/photo-1526336024174-e58f5cdd8e13?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTB8fGNhdHN8ZW58MHx8MHx8&auto=format&fit=crop&w=500&q=60")
        var contact1 = Contact("Wambui", "winnie@gmail.com", "0756382937","616 Korongo", "https://images.unsplash.com/photo-1557246565-8a3d3ab5d7f6?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTN8fGNhdHN8ZW58MHx8MHx8&auto=format&fit=crop&w=500&q=60")
        var contact2 = Contact("Lark", "winnie@gmail.com", "0759784984","616 Korongo", "https://images.unsplash.com/photo-1573865526739-10659fec78a5?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTR8fGNhdHN8ZW58MHx8MHx8&auto=format&fit=crop&w=500&q=60")
        var contact3 = Contact("Speria", "winnie@gmail.com", "0748392823","616 Korongo", "https://images.unsplash.com/flagged/photo-1557427161-4701a0fa2f42?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTl8fGNhdHN8ZW58MHx8MHx8&auto=format&fit=crop&w=500&q=60")
        var contact4 = Contact("Damaris", "winnie@gmail.com", "0749283738","616 Korongo", "https://images.unsplash.com/photo-1559235038-1b0fadf76f78?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTZ8fGNhdHN8ZW58MHx8MHx8&auto=format&fit=crop&w=500&q=60")
        var contact5 = Contact("Patrick", "winnie@gmail.com", "0749283738","616 Korongo", "https://images.unsplash.com/photo-1568043210943-0e8aac4b9734?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTV8fGNhdHN8ZW58MHx8MHx8&auto=format&fit=crop&w=500&q=60")
        var contact6 = Contact("Jaelhard", "winnie@gmail.com", "0749283738","616 Korongo", "https://images.unsplash.com/photo-1548546738-8509cb246ed3?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8OXx8Y2F0c3xlbnwwfHwwfHw%3D&auto=format&fit=crop&w=500&q=60")
        var contact7 = Contact("Alvin", "winnie@gmail.com", "0749283738","616 Korongo", "https://images.unsplash.com/photo-1543852786-1cf6624b9987?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8NXx8Y2F0c3xlbnwwfHwwfHw%3D&auto=format&fit=crop&w=500&q=60")
        var contact8 = Contact("Shee", "winnie@gmail.com", "0749283738","616 Korongo", "https://images.unsplash.com/photo-1592194996308-7b43878e84a6?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MXx8Y2F0c3xlbnwwfHwwfHw%3D&auto=format&fit=crop&w=500&q=60")
        var contact9 = Contact("Mwas", "winnie@gmail.com", "0749283738","616 Korongo", "https://images.unsplash.com/photo-1548802673-380ab8ebc7b7?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8Mnx8Y2F0c3xlbnwwfHwwfHw%3D&auto=format&fit=crop&w=500&q=60")
        var contact0 = Contact("Robin", "winnie@gmail.com", "0749283738","616 Korongo", "https://images.unsplash.com/photo-1519238263530-99bdd11df2ea?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8NXx8YmxhY2slMjBraWRzfGVufDB8fDB8fA%3D%3D&auto=format&fit=crop&w=500&q=60")


        var contactList = listOf(contact,contact1,contact2,contact3,contact4,contact5,contact6,contact7,contact8,contact9,contact0)

        var contactsAdapter = ContactRvAdapter(contactList)
        binding.rvContacts.layoutManager = LinearLayoutManager(this)
        binding.rvContacts.adapter = contactsAdapter

    }
}