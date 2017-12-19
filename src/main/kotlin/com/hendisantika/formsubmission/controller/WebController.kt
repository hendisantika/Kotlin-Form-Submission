package com.hendisantika.formsubmission.controller

import com.hendisantika.formsubmission.model.Customer
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.PostMapping

/**
 * Created by IntelliJ IDEA.
 * Project : kotlin-form-submission
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 19/12/17
 * Time: 06.08
 * To change this template use File | Settings | File Templates.
 */

@Controller
class WebController {

    private val log = LoggerFactory.getLogger(WebController::class.java)

    @GetMapping("/")
    fun home(): String {
        return "redirect:/form"
    }

    @GetMapping("/form")
    fun customerForm(model: Model): String {
        model.addAttribute("customer", Customer())
        return "form"
    }

    @PostMapping("/form")
    fun customerSubmit(@ModelAttribute("customer") customer: Customer, model: Model): String {
        model.addAttribute("customer", customer)
        val info = String.format("Customer Submission: name = %s, age = %d, street = %s, postcode = %s",
                customer.name, customer.age, customer.address.street, customer.address.postcode)
        log.info(info)
        return "result"
    }
}