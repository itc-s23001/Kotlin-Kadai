package jp.ac.it_college.std.s23001.messageboard.domain.repository


interface ThreadRepository {
    fun findById(id: Long): Thread?
    fun findAll(): List<Thread>
    fun save(thread: Thread): Thread
    fun update(thread: Thread): Thread
}

