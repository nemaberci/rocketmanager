package hu.nemaberci.rocketmanager.controller.frontend

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@RequestMapping("/cities")
@Controller
class CityController {

    @GetMapping(path = ["/", ""])
    fun listAllCities(model: Model): String {
        return "city/cities"
    }

}