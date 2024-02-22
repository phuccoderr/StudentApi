package com.mycompany.api;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Positive;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/students")
@Validated
public class StudentApiController {
    private static List<Student> listStudents = new ArrayList<>();

    static {
        listStudents.add(new Student(1,"Phuc",18));
        listStudents.add(new Student(2,"Thi",20));
    }

    @GetMapping
    public ResponseEntity<?> list(@RequestParam("pageSize")
                                      @Min(value = 10,message = "than 10")
                                      @Max(value = 50,message = "less 50")
                                      Integer pageSize,
                                      @Positive(message = "Page number must be greater than 0") Integer pageNum)
    {
        System.out.println("pageSize: " + pageSize);
        System.out.println("pageNum: " + pageNum);
        if (listStudents.isEmpty()) {
            return ResponseEntity.noContent().build();
        }

        return new ResponseEntity<>(listStudents, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Student> add(@RequestBody Student student) {

        return new ResponseEntity<>(student,HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<?> replace(@RequestBody Student student) {
        if (listStudents.contains(student)) {
            int index = listStudents.indexOf(student);
            listStudents.set(index,student);
            listStudents.forEach(System.out::println);

            return new ResponseEntity<>(student,HttpStatus.OK);
        } else {
            return ResponseEntity.noContent().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") @Positive(message = "id must be than 0") Integer id) {
        Student student = new Student(id);
        if (listStudents.contains(student)) {
            listStudents.remove(student);

            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
