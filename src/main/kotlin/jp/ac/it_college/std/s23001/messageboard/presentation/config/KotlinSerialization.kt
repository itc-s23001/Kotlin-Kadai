package jp.ac.it_college.std.s23001.messageboard.presentation.config

import org.springframework.context.annotation.Configuration
import org.springframework.http.converter.HttpMessageConverter
import org.springframework.http.converter.json.KotlinSerializationJsonHttpMessageConverter
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer

@Configuration
class KotlinSerialization : WebMvcConfigurer {
    override fun extendMessageConverters(converters: MutableList<HttpMessageConverter<*>>) {
        converters.add(KotlinSerializationJsonHttpMessageConverter())
    }
}
