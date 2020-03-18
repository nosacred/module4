package com.skillboxhelloworld.module4

abstract class AbstractWeapon(
    protected val cartridgeSize:Int,
    internal val FireType:FireType,
    internal var isBulletIn: Boolean,
    private var listAmmo: MutableList<Ammo> = mutableListOf()

) {
    abstract fun createBullet(): Ammo

    fun reload() {
        for (i in 0..this.cartridgeSize - 1) {
            this.listAmmo.add(createBullet())
        }
        this.isBulletIn = true
        println("К Бою готов!")
    }

    fun takeBulletForShot():Int {
        var dmg=0
        if (this.listAmmo.isNotEmpty() && this.isBulletIn == true) {
                this.listAmmo.remove(createBullet())
                dmg+= FireType.shot(createBullet())
            }
        if (this.listAmmo.isEmpty()) {
                this.isBulletIn = false
        }
        return dmg
    }
}
