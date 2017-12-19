package com.hendisantika.formsubmission.model

/**
 * Created by IntelliJ IDEA.
 * Project : kotlin-form-submission
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 19/12/17
 * Time: 06.05
 * To change this template use File | Settings | File Templates.
 */

data class Customer(
        var name: String? = null,
        var age: Int? = null,
        var address: Address = Address()
)