package io.github.ian.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.ian.todo.model.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long>{

}
