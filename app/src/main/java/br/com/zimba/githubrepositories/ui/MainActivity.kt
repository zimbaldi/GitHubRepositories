package br.com.zimba.githubrepositories.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.zimba.githubrepositories.R
import br.com.zimba.githubrepositories.databinding.ActivityMainBinding
import androidx.appcompat.widget.SearchView
import android.util.Log
import android.view.Menu
import android.view.MenuItem

class MainActivity : AppCompatActivity() {

    private val binding by lazy {ActivityMainBinding.inflate(layoutInflater)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)
    }
}