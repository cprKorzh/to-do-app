package com.cpr_korzh.todos.activities

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.cpr_korzh.todos.R
import com.cpr_korzh.todos.databinding.ActivityMainBinding
import com.cpr_korzh.todos.fragments.FragmentManager
import com.cpr_korzh.todos.fragments.NoteFragment

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setBottomNavListener()
    }

    private fun setBottomNavListener() {
        binding.bNav.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.settings -> {
                    Log.d("MyLog", "Settings")
                }

                R.id.notes -> {
                    FragmentManager.setFragment(NoteFragment.newInstance(), this)
                }

                R.id.list -> {
                    Log.d("MyLog", "List")
                }

                R.id.item -> {
                    FragmentManager.currentFrag?.onClickNew()
                }
            }
            true
        }
    }
}