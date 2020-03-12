package com.skillboxhelloworld.module4

fun main() {
    println(Ammo.BulletPistol.damageDone())
    println(Ammo.BulletGun.damageDone())
    println(Ammo.BulletRifle.damageDone())

    println(FireType.SingleShot.shot(Ammo.BulletGun))
    println(FireType.TripleShot.shot(Ammo.BulletRifle))
    println(FireType.TripleShot.shot(Ammo.BulletPistol))


}