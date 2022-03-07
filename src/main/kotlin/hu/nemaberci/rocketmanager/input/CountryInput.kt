package hu.nemaberci.rocketmanager.input

import org.springframework.validation.annotation.Validated
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.Pattern

@Validated
data class CountryInput (
        @Min(1)
        @Max(255)
        val name: String,
        @Min(1)
        @Max(3)
        val code: String
)