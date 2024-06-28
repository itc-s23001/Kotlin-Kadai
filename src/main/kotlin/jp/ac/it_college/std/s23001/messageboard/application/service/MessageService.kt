package jp.ac.itcollege.std.s23001.messageboard.aplication

import jp.ac.it_college.std.s23001.messageboard.domain.repository.MessageRepository
import org.apache.logging.log4j.message.Message
import org.springframework.stereotype.Service

@Service
class MessageService(
    private val messageRepository: MessageRepository
)


