package com.example.appvithe.model.request

class SignUpRequest: BaseAuthRequest() {
    var phone: String? = null
    var password_confirmation: String? = null
}