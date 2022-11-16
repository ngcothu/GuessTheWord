package com.example.android.guesstheword.screens.score

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelStore

class ScoreViewModelFactory(private val finalScore: Int) : ViewModelProvider.Factory
{
    override fun <T : ViewModel?> create(modelClass: Class<T>): T
    {
        if(modelClass.isAssignableFrom(ScoreViewModel::class.java))
        {
            return ScoreViewModel(finalScore) as T
        }
        throw java.lang.IllegalArgumentException("Unknown ViewModel class")
    }
}
class ScoreViewModel(finalScore: Int) : ViewModel()
{
    //the final score
    var score = finalScore
    init
    {
        Log.i("ScoreViewModel", "Final score is $finalScore")
    }
}