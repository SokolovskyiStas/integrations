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

init {}

override fun onCreate(savedInstanceState: Bundle?) {
super.onCreate(savedInstanceState)
setContentView(R.layout.activity_main)
titleTextView = findViewById(R.id.title)
deprecatedMethod() //deprecated method
invalidateOptionsMenu()
titleTextView.text = "Hardcoded string"
when { }
someSuperLongFunction() //long function
toManyArgumentsFunction(1,2,3,4,5,6,7,8,9,1,2,3) //long function
}

@Deprecated(message = "Deprecated")
private fun deprecatedMethod() {
}


final fun emptyFunctionBlog() {

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

    fun someSuperLongFunction() {
        invalidateOptionsMenu()
        invalidateOptionsMenu()
        invalidateOptionsMenu()
        invalidateOptionsMenu()
        invalidateOptionsMenu()
        invalidateOptionsMenu()
        invalidateOptionsMenu()
        invalidateOptionsMenu()
        invalidateOptionsMenu()
        invalidateOptionsMenu()
        invalidateOptionsMenu()
        invalidateOptionsMenu()
        invalidateOptionsMenu()
        invalidateOptionsMenu()
        invalidateOptionsMenu()
        invalidateOptionsMenu()
        invalidateOptionsMenu()
        invalidateOptionsMenu()
        invalidateOptionsMenu()
        invalidateOptionsMenu()
        invalidateOptionsMenu()
        invalidateOptionsMenu()
        invalidateOptionsMenu()
        invalidateOptionsMenu()
        invalidateOptionsMenu()
        invalidateOptionsMenu()
        invalidateOptionsMenu()
        invalidateOptionsMenu()
        invalidateOptionsMenu()
        invalidateOptionsMenu()
        invalidateOptionsMenu()
        invalidateOptionsMenu()
        invalidateOptionsMenu()
        invalidateOptionsMenu()
    }

    fun toManyArgumentsFunction(
        q: Int,
        w: Int,
        r: Int,
        t: Int,
        y: Int,
        u: Int,
        i: Int,
        o: Int,
        p: Int,
        a: Int,
        d: Int,
        f: Int
    ) {

    }

}


