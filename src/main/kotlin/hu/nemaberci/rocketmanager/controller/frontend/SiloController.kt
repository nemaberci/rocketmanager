package hu.nemaberci.rocketmanager.controller.frontend

import hu.nemaberci.rocketmanager.service.RocketService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@RequestMapping("/silos")
@Controller
class SiloController {

    @Autowired
    lateinit var rocketService: RocketService

    @GetMapping(path = ["/", ""])
    fun listAllSilos(model: Model): String {
        model.addAttribute("rockets", rocketService.listAllRockets())
        return "silo/silos"
    }

}