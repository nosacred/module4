package com.skillboxhelloworld.module4

import java.util.*
import kotlin.random.Random
import kotlin.random.nextInt

abstract class AbstractWarrior(
    private var maxHealth:Int,
    override  var evaisionChance: Int,
    private var accuraty:Int,
    private var weapon: AbstractWeapon,
    private val rank:Int = Random.nextInt(1..5)

): Warrior{
    init {
        if(this.rank ==1){
            this.maxHealth = Random.nextInt(100..120)
            this.accuraty = Random.nextInt(6..12)
            this.evaisionChance = Random.nextInt(5..10)
            this.weapon = Weapons.pistolGlock
        }
        if(this.rank ==2){
            this.maxHealth = Random.nextInt(110..130)
            this.accuraty = Random.nextInt(7..12)
            this.evaisionChance = Random.nextInt(6..10)
            this.weapon = Weapons.pistolUsp
        }
        if(this.rank ==3){
            this.maxHealth = Random.nextInt(130..150)
            this.accuraty = Random.nextInt(8..12)
            this.evaisionChance = Random.nextInt(7..10)
            this.weapon = Weapons.automatGalil
        }
        if(this.rank ==4){
            this.maxHealth = Random.nextInt(130..150)
            this.accuraty = Random.nextInt(9..12)
            this.evaisionChance = Random.nextInt(8..10)
            this.weapon = Weapons.automatFamas
        }
        if(this.rank ==5){
            this.maxHealth = Random.nextInt(130..150)
            this.accuraty = Random.nextInt(10..12)
            this.evaisionChance = Random.nextInt(8..9)
            this.weapon = Weapons.sniperGun
        }
        this.weapon.reload()
    }
    var currentHealth = this.maxHealth
    override var isKilled: Boolean = false

    override fun attack(enemy: Warrior):Int {
        var dmg = 0
        for(shot in 1..this.weapon.FireType.shotQuantity){
            if (this.weapon.isBulletIn == true){
                if(Random.nextInt(0..this.accuraty) >= Random.nextInt(0..enemy.evaisionChance))
                   dmg+= this.weapon.takeBulletForShot()
            }
        }
        if (this.weapon.isBulletIn == false) this.weapon.reload()
        return dmg

    }

    override fun takeDamage(damage: Int) {
        this.currentHealth -= damage
        if(this.currentHealth <= 0) this.isKilled = true
    }

    override fun toString(): String {
        return ("${currentHealth} , ${weapon}, ${rank}")
    }


}



