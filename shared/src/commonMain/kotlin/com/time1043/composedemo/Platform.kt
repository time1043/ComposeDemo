package com.time1043.composedemo

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform