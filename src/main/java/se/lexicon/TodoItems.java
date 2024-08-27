package se.lexicon;

import com.sun.tools.javac.comp.Todo;

import java.util.Collection;

public interface TodoItems {
    Todo create(Todo todo);
    Collection<Todo> findAll();
    Todo findById(int id);
    Collection<Todo> findByDoneStatus(boolean status);
    Collection<Todo> findByAssignee(int assigneeId);
    Collection<Todo> findByAssignee(Person person);
    Collection<Todo> findByUnassignedTodoItems();
    Todo update(Todo todo);
    boolean deleteById(int id);
}
