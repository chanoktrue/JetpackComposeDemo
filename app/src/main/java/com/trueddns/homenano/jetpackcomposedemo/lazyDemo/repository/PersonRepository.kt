package com.trueddns.homenano.jetpackcomposedemo.lazyDemo.repository

import com.trueddns.homenano.jetpackcomposedemo.lazyDemo.model.Person

class PersonRepository {

    fun getAllData(): List<Person> {
        return listOf(

            Person(
                id = 0,
                firstName = "John",
                lastName = "Doe",
                age = 20
            ),
            Person(
                id = 1,
                firstName = "Marin",
                lastName = "Garcia",
                age = 21
            ),
            Person(
                id = 2,
                firstName = "James",
                lastName = "Johnson",
                age = 22
            ),
            Person(
                id = 3,
                firstName = "Michale",
                lastName = "Brown",
                age = 23
            ),
            Person(
                id = 4,
                firstName = "John",
                lastName = "Doe",
                age = 20
            ),
            Person(
                id = 5,
                firstName = "Marin",
                lastName = "Garcia",
                age = 21
            ),
            Person(
                id = 6,
                firstName = "James",
                lastName = "Johnson",
                age = 22
            ),
            Person(
                id = 7,
                firstName = "Michale",
                lastName = "Brown",
                age = 23
            ),
            Person(
                id = 8,
                firstName = "John",
                lastName = "Doe",
                age = 20
            ),
            Person(
                id = 9,
                firstName = "Marin",
                lastName = "Garcia",
                age = 21
            ),
            Person(
                id = 10,
                firstName = "James",
                lastName = "Johnson",
                age = 22
            ),
            Person(
                id = 11,
                firstName = "Michale",
                lastName = "Brown",
                age = 23
            ),
            Person(
                id = 12,
                firstName = "John",
                lastName = "Doe",
                age = 20
            ),
            Person(
                id = 13,
                firstName = "Marin",
                lastName = "Garcia",
                age = 21
            ),
            Person(
                id = 14,
                firstName = "James",
                lastName = "Johnson",
                age = 22
            ),
            Person(
                id = 15,
                firstName = "Michale",
                lastName = "Brown",
                age = 23
            )

        )
    }
}