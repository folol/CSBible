package com.example.csbible.sorting

class InsertionSort(private var arrayList: Array<Int>): SortBase(arrayList) {

    override fun sort() {

        algorithm()
        printResult()

    }

    override fun algorithm() {

        if(isDataValid(true)){

            for( outer in 1 until arrayList.size){

                for ( inner in outer until 0){

                    val rightElement = arrayList[inner]
                    val leftElement = arrayList[inner - 1]

                    if(rightElement < leftElement ){

                        arrayList[inner - 1] = rightElement
                        arrayList[inner] = leftElement

                    }

                }

            }

        }

    }


}

