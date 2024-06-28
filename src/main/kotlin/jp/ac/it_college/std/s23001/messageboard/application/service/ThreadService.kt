//package jp.ac.it_college.std.s23001.messageboard.application.service
//
//import jp.ac.it_college.std.s23001.messageboard.domain.model.Thread
//import jp.ac.it_college.std.s23001.messageboard.domain.repository.ThreadRepository
//import org.springframework.stereotype.Service
//import org.springframework.transaction.annotation.Transactional
//
//@Service
//@Transactional
//class ThreadService(private val threadRepository: ThreadRepository) {
//    fun getAllThreads(): List<Thread> {
//        return threadRepository.findAll().sortedByDescending { it.updatedAt }
//    }
//
//    fun createThread(thread: Thread): Thread {
//        return threadRepository.save(thread)
//    }
//
//    fun updateThreadTitle(threadId: Long, title: String, userId: Long): Thread {
//        val thread = threadRepository.findById(threadId) ?: throw IllegalArgumentException("Thread not found")
//        if (thread.userId != userId) {
//            throw IllegalAccessException("スレッド作成者のみがタイトルを更新できます。")
//        }
//        thread.title = title
//        return threadRepository.update(thread)
//    }
//
//    fun deleteThread(threadId: Long, userId: Long): Thread {
//        val thread = threadRepository.findById(threadId) ?: throw IllegalArgumentException("Thread not found")
//        if (thread.userId != userId) {
//            throw IllegalAccessException("スレッド作成者のみがスレッドを削除できます。")
//        }
//        thread.deleted = true
//        return threadRepository.update(thread)
//    }
//}
