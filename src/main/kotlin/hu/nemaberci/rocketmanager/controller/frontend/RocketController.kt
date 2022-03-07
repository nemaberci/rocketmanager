package hu.nemaberci.rocketmanager.controller.frontend

import hu.nemaberci.rocketmanager.service.RocketService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping(path = ["/rockets"])
class RocketController {

    @Autowired
    lateinit var rocketService: RocketService

    @GetMapping(path = ["/", ""])
    fun listAllRockets(model: Model): String {
        model.addAttribute("rockets", rocketService.listAllRockets())
        return "rocket/rockets";
    }

}