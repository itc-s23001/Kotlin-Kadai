package jp.ac.itcollege.std.s23001.messageboard

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MessageBoardApplication

fun main(args: Array<String>) {
    runApplication<MessageBoardApplication>(*args)
}