package hu.nemaberci.rocketmanager.dto

import hu.nemaberci.rocketmanager.entity.CountryEntity

data class Country(
        val id: Long,
        val name: String,
        val code: String
) {
    companion object {
        fun from(countyEntity: CountryEntity): Country {
            return Country(
                    countyEntity.id,
                    countyEntity.name,
                    countyEntity.code
            )
        }
    }


}