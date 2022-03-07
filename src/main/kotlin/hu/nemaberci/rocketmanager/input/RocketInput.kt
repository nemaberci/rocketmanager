package hu.nemaberci.rocketmanager.input

import org.springframework.validation.annotation.Validated
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.Pattern

@Validated
data class RocketInput(
        @Pattern(regexp = "^((P)|(p)ointy)|((R)|(r)ounded)$")
        val coneShape: String,
        @Min(0)
        @Max(50000)
        val radius: Int,
        val siloId: Long? = null
)