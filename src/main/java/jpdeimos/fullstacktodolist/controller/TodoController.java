package jpdeimos.fullstacktodolist.controller;

import jpdeimos.fullstacktodolist.dto.TodoDTO;
import jpdeimos.fullstacktodolist.model.Todo;
import jpdeimos.fullstacktodolist.service.TodoService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/todo")
@RequiredArgsConstructor
public class TodoController {

    private final TodoService todoService;

    @GetMapping("/getAll")
    public List<TodoDTO> getAllTodo() {
        return todoService.getAllTodos();
    }

    @PutMapping("/addTodo/{newTodo}")
        public List<TodoDTO> addTodo(@PathVariable @NonNull String newTodo) {
        return todoService.addTodo(newTodo);
    }

    @PostMapping("/updateTodo")
    public List<TodoDTO> updateTodo(@RequestBody @NonNull Todo updatedTodo) {
        return todoService.updateTodo(updatedTodo);
    }

    @DeleteMapping("/deleteTodo/{id}")
    public List<TodoDTO> deleteTodo(@PathVariable UUID id) {
        return todoService.deleteTodo(id);
    }
}
