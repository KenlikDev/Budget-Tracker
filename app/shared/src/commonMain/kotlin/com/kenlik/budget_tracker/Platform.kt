package com.kenlik.budget_tracker

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform