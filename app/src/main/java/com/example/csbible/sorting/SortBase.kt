package com.example.csbible.sorting

import android.util.Log

abstract class SortBase (private var arrayList: Array<Int>) {

    protected abstract fun sort()
    protected abstract fun algorithm()

    fun isDataValid(forSort : Boolean = false) : Boolean = !arrayList.isNullOrEmpty()
            && if (forSort) arrayList.size > 1 else true

    fun printResult(){
        if(isDataValid()) {
            arrayList.forEach {
                Log.d("SORT_RESULT", "" + it)
            }
        }
        else
            Log.d("SORT_RESULT", "data set invalid")
    }

}