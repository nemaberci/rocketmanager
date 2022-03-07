package hu.nemaberci.rocketmanager.input

import org.springframework.validation.annotation.Validated
import javax.validation.constraints.Max
import javax.validation.constraints.Min

@Validated
data class CityInput(
    @Min(1)
    @Max(255)
    val name: String,
    val countryId: Long? = null,
    val rocketSiloIds: List<Long>? = null
)