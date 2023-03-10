package com.example.login_layout

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.login_layout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnlogin.setOnClickListener { Login_acc() }
    }

    @SuppressLint("SetTextI18n")
    private fun Login_acc() {
        val userName = binding.username.text.toString()
        val password = binding.password.text.toString()
        if (userName == "" || password == ""){
            binding.result.text = "Please enter your Username or Password!"
        }else if(userName == "vku" && password ==  "123"){
            binding.result.text = "Logged in successful!"
        }else{
            binding.result.text = "Login failed!"
        }
//        if (checkInput(userName, password)) {
//            if (userName == "vku" && password == "123") {
//                binding.result.text = "Logged in successful!"
//            } else {
//                binding.result.text = "Login failed!"
//            }
//        }
    }

//    private fun checkInput(userName: String, password: String): Boolean {
//        if (userName == "" || password == "") {
//            binding.result.text = "Please enter your Username or Password!"
//            return false
//        }
//        return true
//    }


}