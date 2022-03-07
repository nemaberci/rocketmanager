package hu.nemaberci.rocketmanager.repository

import hu.nemaberci.rocketmanager.entity.RocketEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface RocketRepository: JpaRepository<RocketEntity, Long> {



}