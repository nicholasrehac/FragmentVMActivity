package edu.temple.diceroll

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlin.random.Random

class DiceViewModel : ViewModel() {
    private var numSides = 0
    private val diceLiveData = MutableLiveData<Int>()
    val dice = diceLiveData as LiveData<Int>

    fun roll() {
        diceLiveData.value = Random.nextInt(numSides) + 1
    }

    fun setSides(sides : Int) {
        numSides = sides
    }
}