package com.ssokolovskyi.integrations

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import android.widget.EditText
import android.Manifest

/*
* Issues:
* - Formatting
* - Unused imports
* - Deprecated method calls
* - Unused resources
* - Hardcoded string
* - Duplicated code
* */

class MainActivity : AppCompatActivity() {

    private lateinit var titleTextView: TextView

    init {

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        titleTextView = findViewById(R.id.title)
        deprecatedMethod() //deprecated method
                invalidateOptionsMenu() //formatting
        titleTextView.text = "Hardcoded string"
        when {

        }
    }

    @Deprecated(message = "Deprecated")
    private fun deprecatedMethod() {
    }

    fun emptyFunctionBlog() {

    }

    private fun updateUI() {
        titleTextView.invalidate()
        invalidateOptionsMenu()
        return Unit
    }

    private fun refreshUI() {
        titleTextView.invalidate()
        invalidateOptionsMenu()
        return Unit
    }
}
