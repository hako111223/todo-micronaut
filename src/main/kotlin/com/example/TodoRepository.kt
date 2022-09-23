package com.example

import io.micronaut.data.annotation.Repository
import io.micronaut.data.repository.CrudRepository

@Repository
interface TodoRepository : CrudRepository<TodoEntry, Long>