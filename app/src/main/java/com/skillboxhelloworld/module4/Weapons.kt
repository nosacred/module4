package com.skillboxhelloworld.module4

import android.os.Parcel
import android.os.Parcelable
import com.skillboxhelloworld.module4.Ammo.*
import com.skillboxhelloworld.module4.FireType.*

object Weapons {
    class AWP : AbstractWeapon(cartridgeSize = 5, FireType = SingleShot, isBulletIn = false)  {
         private var listAmmo = mutableListOf<Ammo>()

        override fun createBullet(): Ammo = BulletRifle

        override fun reload() {
            for (i in  0..this.cartridgeSize-1){
                this.listAmmo.add(createBullet())
            }
            this.isBulletIn = true
            println("Полная обойма!")
        }

        override fun takeBulletForShot() {
            if (this.listAmmo.isNotEmpty()&& isBulletIn == true){
                listAmmo.remove(BulletRifle)
                SingleShot.shot(BulletRifle)
                println("минус патрон")
            }
            if (this.listAmmo.isEmpty()){
                isBulletIn = false
                println("Патроны кончились")
                reload()
            }
        }
    }

    class Glock : AbstractWeapon(cartridgeSize = 20, FireType = TripleShot, isBulletIn = false)  {
        private var listAmmo = mutableListOf<Ammo>()

        override fun createBullet(): Ammo = BulletPistol

        override fun reload() {
            for (i in  0..this.cartridgeSize-1){
                this.listAmmo.add(createBullet())
            }
            this.isBulletIn = true
            println("Полная обойма!")
        }

        override fun takeBulletForShot() {
            if (this.listAmmo.isNotEmpty()&& isBulletIn == true){
                listAmmo.remove(BulletPistol)
                println("Минус патрон")
                listAmmo.remove(BulletPistol)
                println("Минус патрон")
                listAmmo.remove(BulletPistol)
                println("Минус патрон")
                TripleShot.shot(BulletPistol)

            }
            if (this.listAmmo.isEmpty()){
                isBulletIn = false
                println("Патроны кончились")
                reload()
            }
        }
    }

    class Famas : AbstractWeapon(cartridgeSize = 25, FireType = TripleShot, isBulletIn = false)  {
        private var listAmmo = mutableListOf<Ammo>()

        override fun createBullet(): Ammo = BulletGun

        override fun reload() {
            for (i in  0..this.cartridgeSize-1){
                this.listAmmo.add(createBullet())
            }
            this.isBulletIn = true
            println("Полная обойма!")
        }

        override fun takeBulletForShot() {
            if (this.listAmmo.isNotEmpty()&& isBulletIn == true){
                listAmmo.remove(BulletGun)
                println("Минус патрон")
                listAmmo.remove(BulletGun)
                println("Минус патрон")
                listAmmo.remove(BulletGun)
                println("Минус патрон")
                TripleShot.shot(BulletGun)

            }
            if (this.listAmmo.isEmpty()){
                isBulletIn = false
                println("Патроны кончились")
                reload()
            }
        }
    }

    class AK : AbstractWeapon(cartridgeSize = 30, FireType = SingleShot, isBulletIn = false)  {
        private var listAmmo = mutableListOf<Ammo>()

        override fun createBullet(): Ammo = BulletGun

        override fun reload() {
            for (i in  0..this.cartridgeSize-1){
                this.listAmmo.add(createBullet())
            }
            this.isBulletIn = true
            println("Полная обойма!")
        }

        override fun takeBulletForShot() {
            if (this.listAmmo.isNotEmpty()&& isBulletIn == true){
                listAmmo.remove(BulletGun)
                SingleShot.shot(BulletGun)
                println("минус патрон")
            }
            if (this.listAmmo.isEmpty()){
                isBulletIn = false
                println("Патроны кончились")
                reload()
            }
        }
    }


}

