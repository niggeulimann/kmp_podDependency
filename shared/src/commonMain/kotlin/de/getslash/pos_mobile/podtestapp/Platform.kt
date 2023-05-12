package de.getslash.pos_mobile.podtestapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform