package com.skillboxhelloworld.module4

abstract class AbstractWeapon(
    protected val cartridgeSize:Int,
    private val FireType:FireType,
    protected var isBulletIn: Boolean

)
{
    abstract fun createBullet():Ammo
    abstract fun reload()
    abstract fun takeBulletForShot()
}
