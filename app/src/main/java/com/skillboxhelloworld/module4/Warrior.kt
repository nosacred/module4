package com.skillboxhelloworld.module4

interface Warrior {
    var isKilled:Boolean
    var evaisionChance:Int
    fun takeDamage(damage:Int)
    fun attack(enemy: Warrior):Int
}