package com.booking.domain.mapper

interface BaseMapper<Input, Output> {
    fun map(input : Input) : Output
}