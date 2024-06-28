package jp.ac.it_college.std.s23001.messageboard.domain.repository

import jp.ac.itcollege.std.s23001.messageboard.domain.model.Message

interface MessageRepository {
    fun findById(id: Long): Message?
    fun findByThreadId(threadId: Long): List<Message>
    fun save(message: Message): Message
    fun update(message: Message): Message
}
