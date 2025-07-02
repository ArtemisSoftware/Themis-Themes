package com.artemissoftware.themisthemes

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform