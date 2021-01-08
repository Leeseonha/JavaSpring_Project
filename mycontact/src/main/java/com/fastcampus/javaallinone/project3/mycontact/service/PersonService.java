package com.fastcampus.javaallinone.project3.mycontact.service;

import com.fastcampus.javaallinone.project3.mycontact.domain.Block;
import com.fastcampus.javaallinone.project3.mycontact.domain.Person;
import com.fastcampus.javaallinone.project3.mycontact.repository.BlockRepository;
import com.fastcampus.javaallinone.project3.mycontact.repository.PersonRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Slf4j
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

//    @Autowired
//    private BlockRepository blockRepository;

    public List<Person> getPeopleExcludeBlocks(){
//        List<Person> people = personRepository.findAll();
////        List<Block> blocks = blockRepository.findAll();
////        List<String> blockNames = blocks.stream().map(Block::getName).collect(Collectors.toList());
//
//        return people.stream().filter(person -> person.getBlock() == null).collect(Collectors.toList());

        return personRepository.findByBlockIsNull();
    }

    public List<Person> getPeopleByName(String name){
//        List<Person> people = personRepository.findAll();
//
//        return people.stream().filter(person -> person.getName().equals(name)).collect(Collectors.toList());

        return personRepository.findByName(name);
    }

    @Transactional(readOnly = true)
    public Person getPerson(Long id){
        Person person = personRepository.findById(id).orElse(null);

//        System.out.println("person : "+ person); // System.out.보다는 log를 활용하는게 좋다

        log.info("person : {}", person);

        return person;
    }

    @Transactional
    public void put(Person person) {
        personRepository.save(person);
    }
}
