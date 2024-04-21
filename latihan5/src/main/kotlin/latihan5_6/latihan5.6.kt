package com.basyair7.latihan5_6

// Sealed Class
sealed class Result {
    data class Success(val data: Any): Result()
    data class Error(val message: String): Result()
    object Loading : Result()
}

private fun main() {
    test1()
}

private fun test1() {
    val result: Result = Result.Error("Oops!")
    when (result) {
        // jika salah satu kondisi dihapus, kode akan error
        is Result.Success -> {
            println("Success: ${result.data}")
        }
        is Result.Error -> {
            println("Error: ${result.message}")
        }
        is Result.Loading -> {
            println("Loading....")
        }
    }
}

private fun test2() {

}