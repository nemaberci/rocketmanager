package hu.nemaberci.rocketmanager.controller.frontend

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@RequestMapping("/stats")
@Controller
class StatsController {

    @GetMapping(path = ["/", ""])
    fun getDefaultStats(model: Model): String {

        return "stats/stats"
    }

}