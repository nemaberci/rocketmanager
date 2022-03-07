package hu.nemaberci.rocketmanager.input

import org.springframework.validation.annotation.Validated
import javax.validation.constraints.Max
import javax.validation.constraints.Min

@Validated
data class RocketSiloInput(
        @Min(0)
        @Max(1000)
        val capacity: Int,
        val cityId: Long? = null
)