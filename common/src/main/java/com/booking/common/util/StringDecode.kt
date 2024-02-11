package com.booking.common.util

object StringDecode {
    fun decodeUnicodeEscape(input: String?): String {
        return input?.let {
            Regex("""\\u([0-9a-fA-F]{4})""")
                .replace(it) {
                    it.groupValues[1].toInt(16).toChar().toString()
                }
        }?:""
    }
}