package hu.nemaberci.rocketmanager.input

import org.springframework.validation.annotation.Validated
import javax.validation.constraints.Max
import javax.validation.constraints.Min

data class CityInput(
    @field:Min(1)
    @field:Max(255)
    val name: String,
    val countryId: Long? = null,
    val rocketSiloIds: List<Long>? = null
)