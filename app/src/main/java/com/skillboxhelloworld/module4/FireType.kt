package com.skillboxhelloworld.module4

sealed class FireType {

    object SingleShot: FireType(){
        fun shot(ammo: Ammo):Int {
            return when (ammo) {
                Ammo.BulletPistol -> Ammo.BulletPistol.damageDone()
                Ammo.BulletRifle -> Ammo.BulletRifle.damageDone()
                Ammo.BulletGun -> Ammo.BulletGun.damageDone()
            }
        }
    }
    object TripleShot: FireType(){
        fun shot(ammo: Ammo):Int {
            return when (ammo) {
                Ammo.BulletPistol -> Ammo.BulletPistol.damageDone()+ Ammo.BulletPistol.damageDone()+
                        Ammo.BulletPistol.damageDone()
                Ammo.BulletRifle -> Ammo.BulletRifle.damageDone() + Ammo.BulletRifle.damageDone()+
                        Ammo.BulletRifle.damageDone()
                Ammo.BulletGun -> Ammo.BulletGun.damageDone() + Ammo.BulletGun.damageDone() +
                        Ammo.BulletGun.damageDone()
            }
        }
    }



    }

