//package jp.ac.it_college.std.s23001.messageboard.presentation.controller
//
//import jp.ac.it_college.std.s23001.messageboard.application.service.MessageService
//import jp.ac.it_college.std.s23001.messageboard.domain.model.Message
//import jp.ac.it_college.std.s23001.messageboard.domain.model.User
//import jp.ac.it_college.std.s23001.messageboard.presentation.form.MessageForm
//import kotlinx.datetime.Clock
//import kotlinx.datetime.TimeZone
//import kotlinx.datetime.toLocalDateTime
//import org.springframework.http.HttpStatus
//import org.springframework.http.ResponseEntity
//import org.springframework.security.core.annotation.AuthenticationPrincipal
//import org.springframework.web.bind.annotation.*
//
//@RestController
//@RequestMapping("/messages")
//@CrossOrigin
//class MessageController(private val messageService: MessageService) {
//
//    @GetMapping("/list/thread/{threadId}")
//    fun getMessagesByThread(@PathVariable threadId: Long): ResponseEntity<Any> {
//        val messages = messageService.getMessagesByThread(threadId).map {
//            if (it.deleted) {
//                mapOf(
//                    "id" to it.id,
//                    "posted_at" to it.postedAt,
//                    "updated_at" to it.updatedAt
//                )
//            } else {
//                mapOf(
//                    "id" to it.id,
//                    "user_id" to it.userId,
//                    "username" to it.userId, // 必要ならUserリポジトリから取得
//                    "message" to it.message,
//                    "posted_at" to it.postedAt,
//                    "updated_at" to it.updatedAt
//                )
//            }
//        }
//        return ResponseEntity.ok(mapOf(
//            "thread_id" to threadId,
//            "messages" to messages
//        ))
//    }
//
//    @PostMapping("/post/thread/{threadId}")
//    fun createMessage(
//        @PathVariable threadId: Long,
//        @RequestBody form: MessageForm,
//        @AuthenticationPrincipal user: User
//    ): ResponseEntity<Any> {
//        val now = Clock.System.now().toLocalDateTime(TimeZone.UTC)
//        val message = Message(0, threadId, user.id, form.message, now, now, false)
//        val savedMessage = messageService.createMessage(message)
//        return ResponseEntity.status(HttpStatus.CREATED).body(mapOf(
//            "id" to savedMessage.id,
//            "thread_id" to threadId,
//            "user_id" to user.id,
//            "posted_at" to savedMessage.postedAt
//        ))
//    }
//
//    @PutMapping("/update/{id}")
//    fun updateMessageContent(
//        @PathVariable id: Long,
//        @RequestBody form: MessageForm,
//        @AuthenticationPrincipal user: User
//    ): ResponseEntity<Any> {
//        val updatedMessage = messageService.updateMessageContent(id, form.message, user.id)
//        return ResponseEntity.ok(mapOf(
//            "id" to updatedMessage.id,
//            "thread_id" to updatedMessage.threadId,
//            "message" to updatedMessage.message,
//            "updated_at" to updatedMessage.updatedAt
//        ))
//    }
//
//    @DeleteMapping("/delete/{id}")
//    fun deleteMessage(@PathVariable id: Long, @AuthenticationPrincipal user: User): ResponseEntity<Any> {
//        val deletedMessage = messageService.deleteMessage(id, user.id)
//        return ResponseEntity.ok(mapOf(
//            "id" to deletedMessage.id,
//            "thread_id" to deletedMessage.threadId,
//            "updated_at" to deletedMessage.updatedAt
//        ))
//    }
//}
//
