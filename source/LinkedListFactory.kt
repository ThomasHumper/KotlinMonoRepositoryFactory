; linked_list.asm
; x86-64 Linux / NASM

global create_node

section .text

; create_node(value, next)
; RDI = value
; RSI = next pointer
; Returns pointer to node in RAX
create_node:
    push rbp
    mov rbp, rsp

    ; Allocate 16 bytes using mmap
    mov rax, 9              ; sys_mmap
    xor rdi, rdi            ; address = NULL
    mov rsi, 16             ; size
    mov rdx, 3              ; PROT_READ | PROT_WRITE
    mov r10, 0x22           ; MAP_PRIVATE | MAP_ANONYMOUS
    mov r8, -1
    xor r9, r9
    syscall

    ; Node layout:
    ; [rax + 0] = value
    ; [rax + 8] = next

    mov [rax], rdi
    mov [rax + 8], rsi

    pop rbp
    retclass Node<T>(
    val value: T,
    var next: Node<T>? = null
)

object LinkedListFactory {

    fun <T> create(): LinkedList<T> {
        return LinkedList()
    }
}

class LinkedList<T> {
    private var head: Node<T>? = null

    fun add(value: T) {
        val node = Node(value)

        if (head == null) {
            head = node
            return
        }

        var current = head
        while (current?.next != null) {
            current = current.next
        }

        current?.next = node
    }
}
